    public static int billboard(String name, int price) {
    int total = 0;
    for (int i = 0; i < name.length(); i++) {
        total += price;
    }
    return total;
  }
