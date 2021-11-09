public class HellaLoops01<response5> {
    public static String getEvenNumbers(int start, int stop) {
        String response3= "";
        for(int i=start; i<stop; i+=2)
            response3+=i;
        return response3;
    }


    public static String getOddNumbers(int start, int stop) {
        String response4= "";
        for(int i=start; i<stop; i++){
            if (i %2==0){
                response4+=i;
            }
        }
        return response4;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String response5= "";
        for(int i=start; i<stop; i+= step){
            int square = i*i;
            response5 += square;
        }
        return response5;
    }

    public static String getRange(int stop) {
        String response= "";
        for(int i=0; i<stop; i++){
            response+=i;
        }
        return response;
    }

    public static String getRange(int start, int stop) {
        String response1= "";
        for(int i=start; i<stop; i++){
            response1+=i;
        }
        return response1;
    }


    public static String getRange(int start, int stop, int step) {
        String response2= "";
        for(int i=start; i<stop; i+=step){
            response2+=i;

        }
        return response2;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String response6 = "";
        for(int i =start; i < stop; i += step){
            int exponentAmount = (int) Math.pow(i, exponent);

            response6 += exponentAmount;
        }
        return response6;
    }
}
