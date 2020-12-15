package patiDev.codeSignal;

public class problem2_sortByHeightWithTree {

    public static void main(String[] args){
//        int[] array = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
//        int[] array = new int[]{-1, -1, -1, -1, -1};
//        int[] array = new int[]{23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
//        int[] array = new int[]{2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
        int[] array = new int[]{4, 2, 9, 11, 2, 16};
        sortByHeight(array);
        for(int i: array){
            System.out.println(i);
        }
//        System.out.println(sortByHeight(new int[]{-1, 150, 190, 170, -1, -1, 160, 180}));
//        System.out.println(sortByHeight(new int[]{-1, -1, -1, -1, -1}));
//        System.out.println(sortByHeight(new int[]{23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3}));
//        System.out.println(sortByHeight(new int[]{2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1}));
//        System.out.println(sortByHeight(new int[]{4, 2, 9, 11, 2, 16}));
    }

    public static int[] sortByHeight(int[] a) {
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]!=-1 && a[j]!=-1){
                    if(a[i]< a[j]){
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
        }
        return a;
    }

}
