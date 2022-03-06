package q1;

public class Main {
    public static void main(String[] args) {
        Citizen firstCitizen = new Citizen("John", 302714549);
        System.out.println(firstCitizen.toString());
        firstCitizen.changeId();
        System.out.println(firstCitizen.toString());

    }

}
