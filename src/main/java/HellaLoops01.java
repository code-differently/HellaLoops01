public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String answer = "";
        return answer;

    }


    public static String getOddNumbers(int start, int stop) {
        String answer =null;


return null;


    }


    public static String getSquareNumbers(int start, int stop, int step) {

            String answer = "";
            for (int i = start; i < stop; i += start) {
                answer += (i * i);
            }
            return answer;
        }


        public static String getRange ( int stop){
        String answer = "";
        for( int i= 0 ; i < stop; i++){
          answer+=i;

        }
        return answer;

        }

        public static String getRange ( int start, int stop){

            String answer = "";
            for( int i= start ; i < stop; i++){
                answer+=i;

            }
            return answer;
        }


        public static String getRange ( int start, int stop, int step){

            String answer = "";
            for( int i= start ; i < stop; i+= step){
                answer+=i;

            }
            return answer;
        }

        public static String getExponentiations ( int start, int stop, int step, int exponent){

                String answer = "";
                for (int i = start; i < stop; i += step) {
                    answer += (int) Math.pow(i, exponent);
                }
                return answer;
            }
        }
