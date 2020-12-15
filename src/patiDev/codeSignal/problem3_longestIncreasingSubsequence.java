package patiDev.codeSignal;

import java.util.ArrayList;

public class problem3_longestIncreasingSubsequence {
    public static void main(String[] args){
        // sequence: [10, 22, 9, 33, 21, 50, 41, 60, 80]    output->6
        //sequence: [1, 231, 2, 4, 89, 32, 12, 234, 33, 90, 34, 42, 88, 15, 16, 100]    output->9
        //sequence: [1, 231, 2, 4, 89, 32, 12, 234, 33, 90, 34, 100]    output-> 7
        //sequence: [51, 7, 2, 94, 49, 30, 24, 85, 55, 57, 41]   output->4
        //sequence: [77, 32] output->1
        //sequence: [1, 2, 3, 4, 5]   output->5
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] array1 = new int[]{1, 231, 2, 4, 89, 32, 12, 234, 33, 90, 34, 100};
        int[] array2 = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
        int[] array3 = new int[]{77, 32};
        int[] array4 = new int[]{1, 231, 2, 4, 89, 32, 12, 234, 33, 90, 34, 42, 88, 15, 16, 100};
        int[] array5 = new int[]{45, 40, 27, 24, 38, 39, 19, 83, 30, 42, 34, 16, 40, 59};
        int[] array6 = new int[]{51, 7, 2, 94, 49, 30, 24, 85, 55, 57, 41};
        int[] array7 = new int[]{60, 24, 42, 30, 79, 17, 36, 91, 43, 89, 7, 41, 43};
        int[] array8 = new int[]{68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82};
        System.out.println(longestIncreasingSubsequence(array)); //5
        System.out.println(longestIncreasingSubsequence(array1)); //7
        System.out.println(longestIncreasingSubsequence(array2)); //6
        System.out.println(longestIncreasingSubsequence(array3)); //1
        System.out.println(longestIncreasingSubsequence(array4)); //9
        System.out.println(longestIncreasingSubsequence(array5)); //5
        System.out.println(longestIncreasingSubsequence(array6)); //4
        System.out.println(longestIncreasingSubsequence(array7)); //5
        System.out.println(longestIncreasingSubsequence(array8)); //6


    }

    public static int longestIncreasingSubsequence(int[] sequence){
        int n = sequence.length;
        int[] lis = new int[n];
        int i, j, max = 0;

        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;

        /* Compute optimized LIS values in bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (sequence[i] > sequence[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];

        return max;
    }

    //
//    public static int longestIncreasingSubsequence(int[] sequence) {
//        ArrayList<Integer> subOfSub= new ArrayList<>();
//        int maxLen = 0;
//        for(int i = 0; i<sequence.length-1; i++){
//            //subOfSub.set(0, sequence[i]);
//            subOfSub.add(sequence[i]);
//            for(int j=i+1; j<sequence.length; j++){
//                if(sequence[j]>sequence[i]){
//                    subOfSub.add(sequence[j]);
//                    sequence[i] = sequence[j];
//                }
//            }
//            System.out.println(subOfSub);
//            if(subOfSub.size()>maxLen){
//                maxLen = subOfSub.size();
//            }
//            subOfSub.clear();
//        }
//        return maxLen;
//    }
}
