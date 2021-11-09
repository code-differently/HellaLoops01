public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String count = "";
        for (int i = start; i<stop; i++){
            if (i%2!=0){
                count+=i;
            }
    }
        return  "" + count;
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder count = new StringBuilder();
        for (int i = start; i<stop; i++){
            if (i%2!=1){
                count.append(i);
            }
        }
        return  "" + count;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String count = "";
        for (int index = start; index<stop; index+=step){
            int newIndex = index*index;
            count+=newIndex;
        }
        return count;
    }

    public static String getRange(int stop) {
        String count ="";
        for (int i=0; i<stop; i++){
            count+=i;
        }
        return count;
    }

    public static String getRange(int start, int stop) {
        String count = "";
        for (int i=start; i<stop; i++){
            count+=i;
        }
        return count;
    }


    public static String getRange(int start, int stop, int step) {
        String count = "";
        for (int i =start; i<stop; i+=step){
            count+=i;
        }
        return count;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String count = "";
        for (int i= start; i<stop; i+=step){
            count+=(int)Math.pow(i,exponent);
        }
        return count;
    }
}
