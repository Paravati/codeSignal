// Reverse the order of words in a given string sentence. You can assume that sentence does not have any leading,
// trailing or repeating spaces.
// For sentence = "Man bites dog", the output should be
//reverseSentence(sentence) = "dog bites Man".
package patiDev.codeSignal;

public class Problem5_reverseSentence {
    public static void main(String[] args){
        System.out.println(reverseSentence("Man bites dog"));
    }

    public static String reverseSentence(String sentence){
        String[] array1 = sentence.split(" ");
        String sentence1= "";
        for(int i = array1.length-1; i>=0; i--){
            sentence1 += array1[i];
            if(i>0){
                sentence1 += " ";
            }
        }
        return sentence1;
    }
}
