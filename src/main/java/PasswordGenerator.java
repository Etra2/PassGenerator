import java.security.SecureRandom;

public class PasswordGenerator {

    // Zestaw znaków, z którego będą generowane hasła
    private static final String CHARACTERSLIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_";

    // Metoda generująca hasło o określonej długości
    public static String generatePass(int length) {
        StringBuilder pass = new StringBuilder();

        // Utwórz obiekt SecureRandom do generowania losowych liczb
        SecureRandom random = new SecureRandom();

        // Dodaj losowe znaki do hasła o określonej długości
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERSLIST.length());
            char randomChar = CHARACTERSLIST.charAt(randomIndex);
            pass.append(randomChar);
        }

        return pass.toString();
    }
}
