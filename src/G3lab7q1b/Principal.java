package G3lab7q1b;

public class Principal {
    private static Principal principal = new Principal();

    private Principal() {}

    public static Principal getInstance(){
        return principal;
    }
    
    public void printDetails(){
        System.out.print("Name: Kamran Jamil");
        System.out.print(", Age: " + 51);
    }


}