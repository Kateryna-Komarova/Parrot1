package task_01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ParrotSave {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Kate", 12, "Pink", 156);

        File file = new File("parrot_object.txt");
        System.out.println("Original parrot");
        System.out.println(parrot);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            file.createNewFile();
            out.writeObject(parrot);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
