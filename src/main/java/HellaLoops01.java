public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        return null;
    }


    public static String getOddNumbers(int start, int stop) {
        String response1 = "";
        for(int i = start; i<stop; i++){
            if(i%2 != 0)
            response1 += i;
        }
        return response1;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers = "";
        for (int i = start; i < stop; i += step){
            squareNumbers += (i*i);
        }
        return squareNumbers;
    }

    public static String getRange(int stop) {
        String response = "";
        for (int i = 0; i< stop; i++){
            response += i;
        }
        return response;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for(int i = start; i < stop; i++) {
            range += i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for(int i = start; i < stop; i += step){
        range += i;
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
       String exponentition = "";
      for(int i = start; i < stop; i +=step){
          exponentition += (int)Math.pow(i, exponent);

       }
        return exponentition;
    }
}
