package part2;

public class DartsGame {
    public static int getScore(double x, double y) {
        double hypotenuse = Math.sqrt(x * x + y * y);
        if (hypotenuse > 10) {return 0;}      // if (hypotenuse <= 1) {
        else if (hypotenuse > 5) {return 1;}  //     return 10;
        else if (hypotenuse > 1) { return 5;} // } else if (hypotenuse <= 5) {
        else { return 10;} //     return 5;
                                             // } else if (hypotenuse <= 10) {
                                             //     return 1;
                                              // } else {
                                               //     return 0;
                                                // }
    }

    public static void main(String[] args) {
        double x = 7;
        double y = 7;
        int result = getScore(x, y);
        System.out.println(result);
    }
}
