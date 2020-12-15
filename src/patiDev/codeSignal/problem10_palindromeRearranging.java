package patiDev.codeSignal;

public class problem10_palindromeRearranging {
    public static void main(String[] args){
        char znak = 'a';
        System.out.println((int)znak);
        System.out.println(palindromeRearranging("aabb"));
        System.out.println(palindromeRearranging("aaabb"));
        System.out.println(palindromeRearranging("aaacbb"));
        System.out.println(palindromeRearranging("aaaccbb"));
        System.out.println(palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));
        System.out.println(palindromeRearranging("abbcabb"));


    }
    public static boolean palindromeRearranging(String inputString){
        int flag = 1;
        int sumFlag = 0;
        for(int i = 97; i<=122; i++){
            flag = 1;
            for(int j = 0; j<inputString.length(); j++){
                if(inputString.codePointAt(j) == i){
                    flag *= (-1);
                }
            }
            //System.out.print(flag); //jezeli i jest ujemne to mamy nieparzysta liczbe
            if(flag < 0 ){
                sumFlag += 1;
            if(sumFlag == 2){
                return false;
            }
            }
        }
        return sumFlag <= 1;
    }
//    public static boolean palindromeRearranging(String inputString){
//        int flag = 1;
//        int sumFlag = 0;
//        for(int i = 97; i<=122; i++){
//            for(int j = 0; j<inputString.length(); j++){
//                if(inputString.codePointAt(j) == i){
//                    flag *= (-1);
//                }
//            }
//            System.out.print(flag);
//            if(flag == -1){
//                sumFlag += flag;
//                if(sumFlag == -2){
//                    return false;
//                }
//            }
//        }
//        if(flag==1)
//            return true;
//        return false;
//    }
}
