package patiDev.codeSignal;

public class reverseInteger {
    public static void main(String[] args){

    }

    public static int reverseInt(int x){
        int lastDigit = 0;
        int returningValue = 0;

        while(x != 0){
            lastDigit = x % 10;
            x /= 10;
            returningValue = returningValue *10 + lastDigit;
        }

        return returningValue;
    }
}
