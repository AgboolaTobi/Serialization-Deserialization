package json.serialization.serialization;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {
    private String name;
    private BigDecimal price;
    @JsonProperty("created_at")
    @JsonSerialize(using = LocalDateTimeSerializer.class) //these are used to serialize

    @JsonDeserialize(using = LocalDateTimeDeserializer.class) // this is used to deserialize
    private LocalDateTime createdAt;

    public Product() {
    }

    public Product(String name, BigDecimal price, LocalDateTime createdAt) {
        this.name = name;
        this.price = price;
        this.createdAt = createdAt;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", createdAt=" + createdAt +
//                '}';
        return String.format("""
                name: %s
                price: %f
                created_At: %s
               
                """,name,price,createdAt);
    }
}