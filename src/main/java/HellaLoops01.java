public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String ans = "";
        for (int i = start; i<stop; i +=2){
             ans +=i;

        }
        return ans;
    }


    public static String getOddNumbers(int start, int stop) {
        String ans = "";
        for (int i = start+1; i<stop; i +=2){
            ans +=i;

        }
        return ans;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String ans="";
        for(int i = start; i<stop; i +=step){
            ans +=(int)Math.pow(i,2);
        }
        return ans;
    }

    public static String getRange(int stop) {
        String result="";
        for(int i = 0; i<stop;i++){
            result +=i;
        }
        return result;

    }

    public static String getRange(int start, int stop) {
        String result="";
        for(int i = start; i<stop;i++){
            result +=i;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result="";
        for(int i = start;i<stop;i +=step){
            result +=i;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start;i<stop;i +=step){
            result +=(int)Math.pow(i,exponent);
        }
        return result;
    }
}
