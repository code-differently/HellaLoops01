public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String response = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                response += i;
            }
        }
        return response ;
    }


    public static String getOddNumbers(int start, int stop) {
        String response = "";
             for (int i = start; i < stop; i++) {
                if (i % 2 == 0){
            response +=i;
        }
             }
        return response;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String response = "";
        for (int i = start; i < stop; i+=step) {
            response += (i*i);

        }
        return response;

    }

    public static String getRange(int stop) {
        String response = "";
        for (int i = 0; i < stop; i++) {
            response += i;

        }
        return response;
    }

    public static String getRange(int start, int stop) {
        String response = "";
        for (int i = start; i < stop; i++) {
            response += 0;

        }
        return response;
    }


    public static String getRange(int start, int stop, int step) {
        String response = "";
        for (int i = start; i < stop; i += step) {
            response += i;

        }

        return response;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String response = "";
        for (int i = start; i < stop; i += step) {
            response += (int)Math.pow(i, exponent);

        }
        return response;
    }
}

