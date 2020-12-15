package patiDev.codeSignal;

public class problem11_numbersGrouping {
    public static void main(String[] args){
        //System.out.println(numbersGrouping(new int[]{20000, 239, 10001, 999999, 10000, 20566, 29999})); //11
        //System.out.println(numbersGrouping(new int[]{10000, 20000, 30000, 40000, 50000, 60000, 10000, 120000, 150000, 200000, 300000, 1000000, 10000000, 100000000, 10000000}));  //28
        System.out.println(numbersGrouping(new int[]{1000000000, 999990000, 999980000, 999970000, 999960000, 999950000, 999940000, 999930000, 999920000, 999910000}));  //20
    }

    public static int numbersGrouping(int[] a) {
        int tmp = 0;
//        for(int i=0; i<a.length; i++){
//            for(int j=1; j<a.length-1; j++){
//                if(a[j-1] > a[j]){
//                    tmp = a[j-1];
//                    a[j-1] = a[j];
//                    a[j] = tmp;
//                }
//            }
//        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i] > a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        int i = 0;
        int groupCounter = 0;
        int groupIN = 0;
        int groupOUT = 0;
        while(i<a.length){
            if(a[i] % 10000 == 0)
                groupIN = a[i]/10000;
            else
                groupIN = (a[i]/10000)+1;

            if(groupIN>groupOUT){
                groupCounter++;
                groupOUT = groupIN;
            }
            i++;
        }

        return groupCounter + a.length;
    }

//    public static int numbersGrouping(int[] a) {
//        int tmp = 0;
//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<a.length; j++){
//                if(a[i] < a[j]){
//                    tmp = a[j];
//                    a[j] = a[i];
//                    a[i] = tmp;
//                }
//            }
//        }
//
//        int lowerBoundary = 1;
//        int higherBoundary = 10000;
//        int groupCounter = 0;
//        for(int element: a){  //zeby dzialalo powinnam iterowac po kolejnych zakresach, a nie po elementach tablicy
//            if(element>=lowerBoundary && element <=higherBoundary){
//                groupCounter += 1;
//                lowerBoundary += 10000;
//                higherBoundary += 10000;
//            }
//        }
//
//        return groupCounter + a.length;
//    }
}
