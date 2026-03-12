public class MethodsReturnValueBasic {

    static int square(int n)              { return n * n; }
    static double cube(double n)          { return n * n * n; }
    static boolean isPositive(double n)   { return n > 0; }
    static String repeat(String s, int n) { return s.repeat(n); }
    static int absolute(int n)            { return n < 0 ? -n : n; }
    static double celsiusToFahrenheit(double c) { return c * 9.0 / 5.0 + 32; }

    static String classify(int score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    static boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println("=== Return Value Examples ===");
        for (int i : new int[]{1,2,3,4,5,10})
            System.out.printf("square(%2d) = %d%n", i, square(i));

        System.out.println("\n=== Grade Classifier ===");
        for (int s : new int[]{95,85,75,65,55})
            System.out.printf("Score %d → Grade %s%n", s, classify(s));

        System.out.println("\n=== Factorials ===");
        for (int i = 0; i <= 10; i++) System.out.printf("%2d! = %d%n", i, factorial(i));

        System.out.println("\n=== Palindrome Checker ===");
        String[] words = {"racecar","hello","A man a plan a canal Panama","level","Java"};
        for (String w : words) System.out.printf("%-40s → %b%n", w, isPalindrome(w));

        System.out.println("\n=== Temperature Conversion ===");
        for (double c : new double[]{0,-40,20,37,100})
            System.out.printf("%.1f°C = %.2f°F%n", c, celsiusToFahrenheit(c));
    }
}
