package task_02;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ParrotLoad {
    public static void main(String[] args) {
        File file = new File("parrot_json.txt");

        ObjectMapper mapper = new ObjectMapper();

        try {
            Parrot parrot = mapper.readValue(file, Parrot.class);
            System.out.println("JSON parrot: ");
            System.out.println(parrot);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
