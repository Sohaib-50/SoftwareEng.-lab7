package G3lab7q2;

public class demo {
    public static void main(String[] args) {
        StudentSelector studentSelector = new StudentSelector();

        Student Harry_Potter = studentSelector.getStudent("Harry Potter", "Gryffindor");
        System.out.println("Harry's details:");
        Harry_Potter.printDetails();
        System.out.println();

        Student Ron_Weasley = studentSelector.getStudent("Ron Weasley", "Gryffindor");
        System.out.println("Ron's details:");
        Ron_Weasley.printDetails();
        System.out.println();

        Student Tom_Riddle = studentSelector.getStudent("Tom Riddle", "Slytherin");
        System.out.println("Tom's details:");
        Tom_Riddle.printDetails();
        System.out.println();

        Student Voldemort = studentSelector.getStudent("Voldemort", "Slytherin");
        System.out.println("Voldemort's details:");
        Voldemort.printDetails();
        
    }
    
}
