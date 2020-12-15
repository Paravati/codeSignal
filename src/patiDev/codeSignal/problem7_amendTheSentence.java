package patiDev.codeSignal;

public class problem7_amendTheSentence {
    public static void main(String[] args){
        System.out.println(amendTheSentence("iEiMCyKAdsfGMPa"));
    //    System.out.println(amendTheSentence("CodesignalIsAwesome"));
        System.out.println(amendTheSentence("Hello"));
        System.out.println(amendTheSentence("HelloTomHow"));
//        System.out.println(amendTheSentence("vSKwWDjwIerQKMgVaAniorRJlerbKpDgvyKBLPNwSRWtylqKewNFtERNuUBBHAsGkTSSfdhQHJYvAighAdeG"));
//        System.out.println(amendTheSentence("JhBkPBaozMnBqEWiIaOEje"));
    }

    public static String amendTheSentence(String s) {
        String newSentence = "";
        String newStr = "";
        int beginIndex = 0;
        for(int i = 1; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                newStr = s.substring(beginIndex, i);
                s = s.substring(i);
                newSentence += newStr + " ";
                i = 0;
            }
        }
        return (newSentence + s).toLowerCase();
    }

}
