package G3lab7q2;

public class GryffindorStudent implements Student {
    String name;
    String house;

    public GryffindorStudent(String name) {
        this.name = name;
        this.house = "Gryffindor";
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("House: " + house);
    }
}
