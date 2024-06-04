package algorithms.warmup;

public class FlippingBits {
    public static long flippingBits(long n) {
        // Write your code here


        String numberTobinary = convertToBinary(n, 2);

        String flipeed = "";
        for (int i = 0; i < 32; i++) {
            if( i< numberTobinary.length() && numberTobinary.charAt(numberTobinary.length()-(1+i)) == '1'){
                flipeed += 0;
            } else {
                flipeed +=1;
            }
        }
        String invertido = new StringBuilder(flipeed).reverse().toString();
        //return convertToDecimal(invertido);
        //Flip the bits using bitwise NOT operator and mask with 0xFFFFFFFFL to keep it 32-bit unsigned
        return ~n & 0xFFFFFFFFL;
    }

    public static String convertToBinary(long number, int base) {
        if (number == 0) {
            return "0";
        }
        String result = "";
        long aux = number;
        while (aux > 0) {
            result = (aux%base) + result;
            aux = aux / base;
        }
        return result;
    }

    public static long convertToDecimal (String number){
        long result = 0L;
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(number.length()-(1+i)) == '1'){
                result += Math.pow(2, i);
            }
        }

        return result;
    }


}
