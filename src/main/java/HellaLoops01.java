import java.util.ArrayList;
import java.util.Arrays;

public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String strNum = "";
        for(int i = start; i < stop; i +=2){
            strNum += i;
        }
        return strNum;
    }


    public static String getOddNumbers(int start, int stop) {
        String strNum = "";
        for(int i = start; i < stop; i += 2){
            strNum += i;
        }
        return strNum;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String strSquared = "";
        for(int i = start; i < stop; i += step) {
            strSquared += i*i;
        }
        return strSquared;
    }

    public static String getRange(int stop) {
        String range = "";
        for (int i = 0; i < stop; i++) {
            range += i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++) {
            range += i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i += step) {
            range += i;
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expo = "";
        for (int i = start; i < stop; i += step) {
            expo += (int)Math.pow(i, exponent);
        }
        return expo;

    }
}
