package oop.assignment3.ex44.base;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class jsonExtractor {
    public List<Products> extractJson(File input) {
        List<Products> products = new ArrayList<>();
        try {
            //  create and process the file
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            //  process all products
            JsonArray jsonArrayOfProducts = fileObject.get("products").getAsJsonArray();
            for(JsonElement productElement : jsonArrayOfProducts) {
                //  get the JsonObject
                JsonObject productJsonObject = productElement.getAsJsonObject();

                //  extract data
                String name = productJsonObject.get("name").getAsString();
                double price = productJsonObject.get("price").getAsDouble();
                int quantity = productJsonObject.get("quantity").getAsInt();

                //  add product to the list
                Products product = new Products(name, price, quantity);
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return products;

    }
}
