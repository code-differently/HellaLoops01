public class HellaLoops01 {
    public static String getEvenNumbers(int start, int stop) {
        String answer = "";
        for(int i = start; i<stop; i++){
            if(i%2 !=0){
                answer +=i;
            }
        }

        return answer;
    }


    public static String getOddNumbers(int start, int stop) {
        String answer = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }


        public static String getSquareNumbers ( int start, int stop, int step){
            String answer1 = "";
            for (int i = start; i < stop; i += start) {
                answer1 += (i * i);
            }
            return answer1;
        }

        public static String getRange ( int stop){
            String response = "";
            for (int i = 0; i < stop; i++)
                response += i;
            return response;
        }

        public static String getRange ( int start, int stop){
            return null;
        }


        public static String getRange ( int start, int stop, int step){
            return null;
        }


        public static String getExponentiations (int start, int stop, int step, int exponent){
            String answer2 = "";
            for (int i = start; i < stop; i += step) {
                answer2 += (int) Math.pow(i, exponent);
            }
            return answer2;
        }
    }