public class CountSheep {
    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }

    public static String countingSheep(int num) {
        String counts = "";

        for (int i = 1; i <= num; i++) {
            String indexNum = String.valueOf(i);
            if ( i == num) {
                counts += indexNum + " sheep";
            } else {
                counts += indexNum + " sheep...";
            }
            
        }

        return counts;
    }
}
