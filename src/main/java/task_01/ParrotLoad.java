package task_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ParrotLoad {
    public static void main(String[] args) {
        File file = new File("parrot_object.txt");

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

            Parrot parrot = (Parrot) in.readObject();
            System.out.println(parrot);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
