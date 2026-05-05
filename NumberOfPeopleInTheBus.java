import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {

        ArrayList<int[]> passengersList = new ArrayList<>();
        passengersList.add(new int[] {10,0});
        passengersList.add(new int[] {3,5});
        passengersList.add(new int[] {2,5});
        System.out.println(countPassengers(passengersList));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int numberOfPassenger = 0;
        for (int i = 0; i < stops.size(); i++) {
            numberOfPassenger = numberOfPassenger + stops.get(i)[0];
            numberOfPassenger = numberOfPassenger - stops.get(i)[1];
        }
        return numberOfPassenger;
  }
}
