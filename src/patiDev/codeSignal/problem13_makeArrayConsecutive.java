package patiDev.codeSignal;

import java.util.Arrays;

public class problem13_makeArrayConsecutive {
    public static void main(String[] args){
       int[] returnArr = makeArrayConsecutive(new int[]{6, 2, 3, 8});
       for(int elem: returnArr){
           System.out.println(elem);
       }
    }

    public static int[] makeArrayConsecutive(int[] sequence) {
        Arrays.sort(sequence);
        int[] returnArr = new int[(sequence[sequence.length-1]-sequence[0]+1)-sequence.length];
        int index = 0;
        int indexOfReturnArray = 0;
        for(int i = sequence[0]; i<sequence[sequence.length-1]; i++){
            if(sequence[index] == i){
                index++;
            }else{
                returnArr[indexOfReturnArray] = i;
                indexOfReturnArray++;
            }
        }
        return returnArr;
    }
}
