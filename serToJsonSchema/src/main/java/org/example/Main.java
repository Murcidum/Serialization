package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Item myItem = new Item(1, "theItem", new User(2, "theUser"));
        ObjectMapper objectMapper = new ObjectMapper();
        //Serialization to Json file
        //String to Json
        String json = new ObjectMapper().writeValueAsString(myItem);
        //Create file
        objectMapper.writeValue(new File("item.json"), myItem);
        System.out.println(json);

        //De serialization from Json to POJO
        //From string
        String jsonString = "{\"Id\":1,\"ItemName\":\"theItem\",\"Owner\":{\"id\":2,\"Name\":\"theUser\"}}";
        Item item2 = objectMapper.readValue(jsonString, Item.class);
        //From file
        File file = new File("item.json");
        Item item3 = objectMapper.readValue(file, Item.class);
        System.out.println(item3.id);
    }
}