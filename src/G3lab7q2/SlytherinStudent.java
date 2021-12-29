package G3lab7q2;

public class SlytherinStudent implements Student {
    String name;
    String house;

    public SlytherinStudent(String name) {
        this.name = name;
        this.house = "Slytherin";
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("House: " + house);
    }
    
}
