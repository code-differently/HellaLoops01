public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String ans = "";
        for (int i = start; i<stop; i +=2){
             ans = String.valueOf(i);

        }
        return ans;
    }


    public static String getOddNumbers(int start, int stop) {
        String ans = "";
        for (int i = start+1; i<stop; i +=2){
            ans = String.valueOf(i);

        }
        return ans;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
