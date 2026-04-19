public class CubeShape {
    public static void main(String[] args) {
    }
    public static boolean isCube(int volume, int side) {
    if ( (side*side*side) != volume || volume <= 0 ) {
        return false;
    } else {
        return true;
    }
    
  }
}
