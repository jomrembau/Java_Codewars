public class USDtoCNY {
    public static void main(String[] args) {
        System.out.println(usdcny(15));
    }

    public static String usdcny(int usd) {
    double usDollar = Math.round((double)usd * 6.75* 100.00) / 100.00;
    String cYuan = String.format("%.2f Chinese Yuan", usDollar);
    return cYuan + " Chinese Yuan";
    }
}
