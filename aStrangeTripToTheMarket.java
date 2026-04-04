public class aStrangeTripToTheMarket {
    public static void main(String[] args) {
        
        String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";

        System.out.println(isLockNessMonster(n));
    }

    public static boolean isLockNessMonster(String s){
    if (s.contains("three fifty") || s.contains("3.50") || s.contains("tree fiddy")) {
        return true;
    } else {
        return false;
    }
    }
}
