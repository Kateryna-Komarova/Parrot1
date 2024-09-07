package task_02;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ParrotSave {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Stepan", 34, "Grey", 345);
        System.out.println("Original parrot: ");
        System.out.println(parrot);

        File file = new File("parrot_json.txt");
        try {
            file.createNewFile();
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, parrot);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
