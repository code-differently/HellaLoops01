public class HellaLoops01 {

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder count = new StringBuilder();
        for(int i = start; i < stop; i ++){
            if(i % 2 != 0){
               count.append(i);
               
            }
        }
        return "" + count;
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder count = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                count.append(i);

            }
        }
        return "" + count;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder count = new StringBuilder();
        for(int i = start; i < stop; i +=5){
                count.append(i *i);


        }
        return "" + count;

    }

    public static String getRange(int stop) {
        StringBuilder count = new StringBuilder();
        for(int i = 0; i < stop; i ++){
            count.append(i);

        }


       return "" + count;


    }

    public static String getRange(int start, int stop) {
        StringBuilder count = new StringBuilder();
        for(int i =start; i<stop; i++){
            count.append(i);
        }
        return "" + count;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder count = new StringBuilder();
        for(int i =start; i<stop; i+=step){
            count.append(i);
        }
        return "" + count;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder count = new StringBuilder();
        for(int i = start; i<stop; i+=step){
            count.append((int)Math.pow(i,exponent));
        }
        return "" + count;
    }


}
