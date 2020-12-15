package patiDev.codeSignal;

public class problem1_findMissingNumberInArray {

    public static void main(String[] args) {
        sortArray(new int[]{3, 4, 1, 5});
        System.out.println(missingNumber(new int[]{3, 4, 1, 5}));
        System.out.println(missingNumber(new int[]{3, 1, 2}));
        System.out.println(missingNumber(new int[]{3, 1, 2}));
        System.out.println(missingNumber(new int[]{0}));
        System.out.println(missingNumber(new int[]{2, 9, 8, 1, 3, 6, 7, 4, 5}));
        System.out.println(missingNumber(new int[]{0, 2, 9, 8, 1, 3, 6, 7, 4, 5}));
//        System.out.println(missingNumber(new int[]{1, 0, 3}));
//        System.out.println(missingNumber(new int[]{14, 12, 11}));
//        System.out.println(missingNumber(new int[]{34, 32}));
//        System.out.println(missingNumber(new int[]{10, 12, 11}));
    }

    static void sortArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
//        for(int i =0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
    }

    static int missingNumber(int[] arr) {
//        sortArray(arr);
//        int missingValue = arr[0];
//        int min = arr[0];
//
//
//        for(int i = 0; i<arr.length;i++){
//
//            if(arr[i] == min){
//                min++;
//                if(i==arr.length-1){
//                    missingValue = min;
//                }
//
//            } else{
//                 missingValue = min;
//            }
//        }
//        return missingValue;
        sortArray(arr);
        int i = 0;


        for(i = 0; i<arr.length;i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return i;
    }
}
