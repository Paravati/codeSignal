package patiDev.codeSignal;

public class problem17_longestWord {
    public static void main(String[] args) {
       // System.out.println(longestWord("Ready[[[, steady, go!"));
        System.out.println(longestWord("You are the best!!!!!!!!!!!! CodeFighter ever!"));
        System.out.println(" []y,[abc".codePointAt(0));

    }

    public static String longestWord(String t) {
        String[] arr = t.split("[\\PL]");
        String l = "";
        for(var arg: arr){
            if(arg.length()>l.length()){
                l = arg;
            }
        }
        return l;
    }
}
