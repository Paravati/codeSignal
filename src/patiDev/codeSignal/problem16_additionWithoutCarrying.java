package patiDev.codeSignal;

public class problem16_additionWithoutCarrying {
    public static void main(String[] args){
        additionWithoutCarrying(456,1734);
        additionWithoutCarrying(2882,239);
        additionWithoutCarrying(5764,3889);
    }

    public static int additionWithoutCarrying(int a, int b){
        int c = 0, i = 1, higherValue = a;
        if (b>a)
            higherValue = b;

        while(higherValue>0){
            c += (a%10 + b%10) % 10 * i;
            a /= 10;
            b /= 10;
            i *= 10;
            higherValue /= 10;
        }
        return c;
    }
}
