package patiDev.codeSignal;

public class problem6_concatenateArrays {
    public static void main(String[] args){
        int[] a = {2,2,1,3,5, 256};
        int[] b = {10,11, 15, 16};
        int[] table1 = concatenateArrays(a,b);
        for(int element: table1){
            System.out.print(element + " ");
        }
    }

    public static int[] concatenateArrays(int[] a, int[] b) {
        int newArrayLen = a.length + b.length;
        int[] arrayConcatenated = new int[newArrayLen];
        int iteratorTmp = 0;
        for(int i = 0; i<newArrayLen; i++){
            if(i<a.length){
                arrayConcatenated[i] = a[iteratorTmp];
                iteratorTmp++;
            }else{
                if(i == a.length)
                    iteratorTmp = 0;
                arrayConcatenated[i] = b[iteratorTmp];
                iteratorTmp++;
            }
        }
        return arrayConcatenated;
    }
}
