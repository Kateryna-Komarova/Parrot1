package task_03;


import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;

@XmlRootElement
public class Parrot {
    private String name;
    private String color;
    private int age;
    private int numberOfWords;

    public Parrot() {
    }

    public Parrot(String name, int age, String color, int numberOfWords) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.numberOfWords = numberOfWords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return age == parrot.age && numberOfWords == parrot.numberOfWords && Objects.equals(name, parrot.name) && Objects.equals(color, parrot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age, numberOfWords);
    }

    @Override
    public String toString() {
        return String.format("Parrot: name - %s, color - %s, age - %d, numberOfWords - %d",
                name, color, age, numberOfWords);
    }
}
