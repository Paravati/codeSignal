package patiDev.codeSignal;
// You are given an array of integers. On each move you are allowed to increase
// exactly one of its element by one. Find the minimal number of moves required
// to obtain a strictly increasing sequence from the input.
// For inputArray = [1, 1, 1], the output should be
//arrayChange(inputArray) = 3. (bo zeby zrobic tablice rosnaca, to trzeba zmienic inputArray na [1,2,3]
public class problem9_arrayChange {
    public static void main(String[] args){
        System.out.println(arrangeArray(new int[]{1,1,1}));
    }

    public static int arrangeArray(int[] inputArray){
        int amountOfChanges = 0;
        int changeValue = 0;
        for(int i = 1; i<inputArray.length; i++){
            if(inputArray[i] <= inputArray[i-1]){
                changeValue += (inputArray[i-1] - inputArray[i]+1);
                inputArray[i] += changeValue;
                amountOfChanges += changeValue;
                changeValue = 0;
            }
        }
        return amountOfChanges;
    }
}
