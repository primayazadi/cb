public class SimpleFunctions {

    // Fungsi untuk menghitung jumlah dua angka
    public static int sum(int a, int b) {
        return a + b;
    }

    // Fungsi untuk memeriksa apakah sebuah string adalah palindrom
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Menguji fungsi sum
        int num1 = 10;
        int num2 = 20;
        int result = sum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);

        // Menguji fungsi isPalindrome
        String testString1 = "madam";
        String testString2 = "hello";
        System.out.println("Is \"" + testString1 + "\" a palindrome? " + isPalindrome(testString1));
        System.out.println("Is \"" + testString2 + "\" a palindrome? " + isPalindrome(testString2));
    }
}
