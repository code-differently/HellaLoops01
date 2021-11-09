public class HellaLoops01 {


    public static String getRange(int stop) {
        String response = "";
        for(int i = 0; i<stop; i++){

            response+=i;}

        return response;
    }

    public static String getRange(int start, int stop) {
        String response = "";
        for(int i =start; i<stop; i++){
            response+=i;
        }


        return response;
    }


    public static String getRange(int start, int stop, int step) {
        String response = "";
        for(int i =start; i<stop; i+=step){
            response+=i;
        }
        return response;
    }

    public static String getEvenNumbers(int start, int stop) {
        String response="";
        for (int i = start; i<stop;i+=2){
            response+=i;
        }
        return response;
    }

    public static String getOddNumbers(int start, int stop) {
        String response="";
        for (int i = start; i<stop;i+=2){
            response+=i;
        }

        return response;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String response="";
        for (int i = start; i<stop;i=step){
           response+= Math.pow(i,2);
        }
            return response;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String response = "";

        for (int i = start; i<stop;i=step){
           response += Math.pow(i,exponent);

    }
        return response;
}
}

