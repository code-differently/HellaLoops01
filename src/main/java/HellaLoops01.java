public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String evenNums = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evenNums = evenNums.concat(String.valueOf(i));
            }
        }
        return evenNums;

    }


    public static String getOddNumbers(int start, int stop) {
        String oddNums = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                oddNums = oddNums.concat(String.valueOf(i));
            }
        }
        return oddNums;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String sqrNums = "";
        for (int i = start; i < stop; i+= step) {
            sqrNums = sqrNums.concat(String.valueOf((int)Math.pow(i, 2)));
        }
        return sqrNums;
    }

    public static String getRange(int start) {
        String range = "";
        for (int i = 0; i < start; i++) {
            range = range.concat(String.valueOf(i));
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++) {
            range = range.concat(String.valueOf(i));
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i+=step) {
            range = range.concat(String.valueOf(i));
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expNums = "";
        for (int i = start; i < stop; i+= step) {
            expNums = expNums.concat(String.valueOf((int)Math.pow(i, 2)));
        }
        return expNums;
    }
}
