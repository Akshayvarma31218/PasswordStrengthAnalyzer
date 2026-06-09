public class PasswordAnalyzer {

    public static void analyze(String password) {
        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*\\d.*")) score++;
        if (password.matches(".*[^a-zA-Z0-9].*")) score++;

        System.out.println("\nPassword Strength Analysis");

        if (score <= 2) {
            System.out.println("Strength: Weak");
        } else if (score <= 4) {
            System.out.println("Strength: Medium");
        } else {
            System.out.println("Strength: Strong");
        }

        if (password.length() < 8)
            System.out.println("- Use at least 8 characters");
        if (!password.matches(".*[A-Z].*"))
            System.out.println("- Add uppercase letters");
        if (!password.matches(".*[a-z].*"))
            System.out.println("- Add lowercase letters");
        if (!password.matches(".*\\d.*"))
            System.out.println("- Add numbers");
        if (!password.matches(".*[^a-zA-Z0-9].*"))
            System.out.println("- Add special characters");
    }
}
