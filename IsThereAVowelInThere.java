import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class IsThereAVowelInThere {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<Integer> (
            Arrays.asList(100, 100, 116, 105, 117, 121));
        System.out.println(isVow(numbersList));
    }

    public static List<Object> isVow(List<Integer> a) {
        List<Object> list = new ArrayList<>();

        for (Integer number: a) {
            switch (number) {
                case 97:
                    list.add("a");
                    break;
                case 101:
                    list.add("e");
                    break;
                case 105:
                    list.add("i");
                    break;
                case 111:
                    list.add("o");
                    break;
                case 117:
                    list.add("u");
                    break;
            
                default:
                    list.add(number);
                    break;
            }
        }
        return list;
    }
}