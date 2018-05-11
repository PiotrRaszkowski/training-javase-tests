package pl.jitsolutions.training.javasetests;

public class StringFormatter {

    public static final String SPACE = " ";

    public static String reverse(String text) {
        String reversed = "";
        for (int i = text.length()-1; i>=0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }
}
