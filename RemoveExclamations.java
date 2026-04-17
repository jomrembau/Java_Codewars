import java.util.ArrayList;

public class RemoveExclamations {
    public static void main(String[] args) {
    
        System.out.println(remove("Hello!"));  
    }

public static String remove(String s) {
        String[] ary = s.split("");
        ArrayList<String> newWord = new ArrayList<>();

        for (int i = 0; i < ary.length; i++) {
            if (!ary[i].equals("!")) {
                newWord.add(String.valueOf(ary[i]));
            }
        }
        return String.join("", newWord) + "!";
    }
}
