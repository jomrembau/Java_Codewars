public class stringCleaning {
    public static void main(String[] args) {
        System.out.println(stringClean("Hell70o, World!"));
    }

    static String stringClean(final String text) {
        String finalResult = "";
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                finalResult = finalResult + text.charAt(i);
            }
        }
        return finalResult;
            
    }
}
