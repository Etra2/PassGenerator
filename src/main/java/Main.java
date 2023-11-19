public class Main {
    public static void main(String[] args) {
        //Uzycie hasło o długości 10 znaków
        String generatedPass = PasswordGenerator.generatePass(10);
        System.out.println("Generuj hasło - 10 znaków:  " + generatedPass );

        //Uzycie hasło o długości 20 znaków
        String genPass = PasswordGenerator.generatePass(20);
        System.out.println("Generuj hasło - 20 znaków:  " + genPass );
    }
}
