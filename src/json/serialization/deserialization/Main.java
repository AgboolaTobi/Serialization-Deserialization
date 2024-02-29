package json.serialization.deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import json.serialization.serialization.Product;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"coke\",\"price\":50.00,\"created_at\":\"2023-03-12T10:00:00\"}";
        try {
            Product product = mapper.readValue(json, Product.class);
            System.out.println(product);
        }catch (JsonProcessingException exception){
            System.err.println(exception.getMessage());
        }

    }
}
