public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String response = "";
        for(int i = 5; i< stop; i+=2){
            response +=i;
        }



        return response;
    }



    public static String getOddNumbers(int start, int stop) {
       String response = "";
       for(int i = 6; i< stop; i+=2){
           response +=i;
       }



        return response;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String response = "";
        for (int i = 2; i < stop; i+=5){
            response +=i;

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
        for (int i = 5; i < stop; i++) {

            response += i;
        }


        return response;
    }

    public static String getRange(int start, int stop, int step) {

        String response = "";
        for (int i = 5; i < stop; i+=5) {

            response += i;
        }


        return response;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String response = "";

        return null;
    }
}
