public class Main {
    
    public static void main(String[] args) {
        //System.out.println("Anatomia das classes");
        // Integer number = 1;
        // final String BR = "Brasil";
        // String variableName = "Name";
        // Double num123$23_1 = 1234.567;
        String firstName = "Lucas";
        String lastName = "Oliveira";

        String completeName = completeName(firstName, lastName);
        System.out.println(completeName);
    }

    public static String completeName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
