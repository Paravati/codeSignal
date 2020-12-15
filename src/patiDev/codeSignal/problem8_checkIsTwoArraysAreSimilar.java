package patiDev.codeSignal;

public class problem8_checkIsTwoArraysAreSimilar {
    public static void main(String[] args) {
        System.out.println(areSimilar(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        System.out.println(areSimilar(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
        System.out.println(areSimilar(new int[]{2, 3, 9}, new int[]{10, 3, 2}));
        System.out.println(areSimilar(new int[]{1, 2, 3}, new int[]{1, 10, 2}));
        System.out.println(areSimilar(new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279}, new int[]{832, 998, 148, 570, 533, 561, 455, 147, 894, 279}));
        System.out.println(areSimilar(new int[]{1, 1, 4}, new int[]{1, 2, 3}));
        System.out.println(areSimilar(new int[]{2, 3, 1}, new int[]{1, 3, 2}));
        System.out.println(areSimilar(new int[]{2, 1, 3}, new int[]{1, 2, 3}));

    }

    public static boolean areSimilar(int[] a, int[] b) {
        int controlSum = 0;
        int valueTmp1 = 0;
        int valueTmp2 = 0;
        int isOk=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                controlSum++;
                if (controlSum == 1) {
                    valueTmp1 = a[i];
                    valueTmp2 = b[i];
                } else if (controlSum == 2) {
                    if (a[i] == valueTmp2 && b[i] == valueTmp1) {
                       isOk=1;
                    }
                } else {
                    controlSum=3;
                }
            }
        }
        if(controlSum == 0 || (controlSum == 2 && isOk==1)){
            return true;
        }
        return false;
    }

}