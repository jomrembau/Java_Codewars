public class RemoveTheTime {
    public static void main(String[] args) {
        System.out.println(shortenToDate("Friday May 2, 9am"));
    }

    public static String shortenToDate(String longDate) {
        String[] myArray = longDate.split(",");
        return myArray[0];
    }
}
