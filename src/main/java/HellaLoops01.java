public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String evenNums = "";
        for (int i = start + 1; i < stop; i += 2) {
            if (i % 2 == 0) {
                evenNums += i;

            }
        }
        return evenNums;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNums = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                oddNums += i;
            }
        }
        return oddNums;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNums = "";
        for(int i = start; i<stop; i+=step){
            squareNums += (int) Math.pow(i,2);
        }
        return squareNums;
    }

    public static String getRange(int start) {
        String range = "";
        for(int i = start; i< 10; i++){
            range += i;
        }

        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i<stop; i++){
            range += i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range ="";
        for (int i = start; i < stop; i += step) {
            range += i;

        }
        return range;
    }


        public static String getExponentiations ( int start, int stop, int step, int exponent){
            String exp = "";
            for(int i = start; i < stop; i+=step){
                exp += i;
            }

            return exp;
        }
    }

