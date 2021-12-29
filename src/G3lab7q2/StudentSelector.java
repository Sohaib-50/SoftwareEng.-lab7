package G3lab7q2;

public class StudentSelector {

    public Student getStudent(String name, String house) {
        if (house.equalsIgnoreCase("Gryffindor")) {
            return new GryffindorStudent(name);
        } else if (house.equalsIgnoreCase("Slytherin")) {
            return new SlytherinStudent(name);
        } else {
            return null;
        }
    }
}
