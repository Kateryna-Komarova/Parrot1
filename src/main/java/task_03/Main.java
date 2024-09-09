package task_03;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Anton", 5, "Grey", 564);
        System.out.println("Original parrot");
        System.out.println(parrot);

        File file = new File("parrot_xml.xml");

        try {
            JAXBContext context = JAXBContext.newInstance(Parrot.class);
            Marshaller marshaller = context.createMarshaller();
            file.createNewFile();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(parrot, file);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {

            File file1 = new File("parrot_xml.xml");
            JAXBContext context = JAXBContext.newInstance(Parrot.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Object parrot1 = (Parrot) unmarshaller.unmarshal(file);
            System.out.println("Parrot from xml: ");
            System.out.println(parrot1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
