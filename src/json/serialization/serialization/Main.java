package json.serialization.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("chocolate", BigDecimal.TEN, LocalDateTime.of(2024,2,18,10,0));

        ObjectMapper mapper = new ObjectMapper();
        try {
           String json = mapper.writeValueAsString(product);
            System.out.printf(json);
        }catch (JsonProcessingException exception){
            System.err.println("Error: " + exception.getMessage());
        }

    }
}