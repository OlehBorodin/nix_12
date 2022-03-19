package homework3;

public class ReversSubstring {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args)
    {
        String str = "Techie Delight";

        // Note that string is immutable in Java
        str = reverse(str);

        System.out.println("The reverse of the given string is: " + str);
    }
}
