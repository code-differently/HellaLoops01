public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder countEven = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
              countEven.append(i);
            }
        }
            return "" + countEven;

    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder countOdd = new StringBuilder();
        for (int i = start; i < stop; i++){
            if (i % 2 ==0) {
                countOdd.append(i);
            }
        }
        return "" + countOdd;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder countSquares = new StringBuilder();
        for (int i = start; i < stop; i+=step){
            countSquares.append(i*i);

        }
        return "" + countSquares;
    }

    public static String getRange(int stop) {
        StringBuilder countRange = new StringBuilder();
        for (int i =0; i < stop; i++) {
            countRange.append(i);
        }
        return "" + countRange;
    }

    public static String getRange(int start, int stop) {
        StringBuilder countRange = new StringBuilder();
        for (int i = start; i < stop; i++) {
            countRange.append(i);
        }
        return "" + countRange;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder countRange = new StringBuilder();
        for(int i = start; i< stop; i+=step) {
            countRange.append(i);
        }
        return "" + countRange;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder countEx = new StringBuilder();
        for(int i = start; i< stop; i+= step) {
            countEx.append((int)Math.pow(i,exponent));
        }
        return "" + countEx;
    }
}
