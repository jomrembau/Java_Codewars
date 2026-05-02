public class HowOld {
    public static void main(String[] args) {
        System.out.println(CalculateAge(1984, 2026));
    }
    
    public static String CalculateAge(int birth, int yearTo) {
	  if (birth < yearTo) {
        String age = String.valueOf(yearTo - birth);
        if (age.equals("1")) {
            return "You are " + age + " year old.";
        } else {
            return "You are " + age + " years old.";
        }
      } else if (birth == yearTo) {
        return "You were born this very year!";
      } else {
        String born = String.valueOf(birth - yearTo);
        if (born.equals("1")) {
            return "You will be born in " + born + " year.";
        } else {
            return "You will be born in " + born + " years.";
        }
      }
  }
}
