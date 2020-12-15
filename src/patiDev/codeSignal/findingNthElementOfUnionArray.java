package patiDev.codeSignal;

public class findingNthElementOfUnionArray {
    public static void main(String[] args){
        System.out.println(twoArraysNthElement(new int[]{1, 3, 4}, new int[]{2, 6, 8}, 5));
        System.out.println(twoArraysNthElement(new int[]{1, 3, 5}, new int[]{2, 4}, 2));
        System.out.println("end");
    }

    public static int twoArraysNthElement(int[] array1, int[] array2, int n) {
        int returnElement = 0;
        int[] arrayUnion = new int[array1.length+array2.length];
        int index = 0;
        for(int i = 0; i<arrayUnion.length; i++){
            if(i<array1.length){
                arrayUnion[i] = array1[i];
            }else{
                arrayUnion[i] = array2[index];
                for(int j=0; j<arrayUnion.length; j++){
                    if(arrayUnion[i] < arrayUnion[j]){
                        int tmp = arrayUnion[j];
                        arrayUnion[j] = arrayUnion[i];
                        arrayUnion[i] = tmp;
                    }
                }
                index+=1;
            }
        }
//        for(int elem: arrayUnion){
//            System.out.println(elem);
//        }

        return arrayUnion[n];
    }
}
