//To prepare his students for an upcoming game, the sports coach decides to try some new training drills.
// To begin with, he lines them up and starts with the following warm-up exercise: when the coach says 'L',
// he instructs the students to turn to the left. Alternatively, when he says 'R', they should turn to the right.
// Finally, when the coach says 'A', the students should turn around.
//Unfortunately some students (not all of them, but at least one) can't tell left from right,
// meaning they always turn right when they hear 'L' and left when they hear 'R'.
// The coach wants to know how many times the students end up facing the same direction.
// Given the list of commands the coach has given, count the number of such commands after which the students
// will be facing the same direction.
// For commands = "LLARL", the output should be
//lineUp(commands) = 3.
//
//Let's say that there are 4 students, and the second one can't tell left from right.
// In this case, only after the second, third and fifth commands will the students face the same direction.

package patiDev.codeSignal;

public class problem4_lineUp {
    public static void main(String[] args){
        String str1 = "LLARL";
        System.out.println(lineUp(str1));  //3
        String str2 = "RLR";
        System.out.println(lineUp(str2));  //1
        String str3 = "";
        System.out.println(lineUp(str3));  //0
        String str4 = "L";
        System.out.println(lineUp(str4));  //0
        String str5 = "A";
        System.out.println(lineUp(str5));  //1
        String str6 = "AAAAAAAAAAAAAAA";
        System.out.println(lineUp(str6));  //15
        String str7 = "RRRRRRRRRRLLLLLLLLLRRRRLLLLLLLLLL";
        System.out.println(lineUp(str7));  //16
        String str8 = "AALAAALARAR";
        System.out.println(lineUp(str8));  //5
    }

    public static int lineUp(String commands){
        int lookingInSameDirectionTimes = 0;
        boolean isTheSameDirectionOfLooking = true;  //na poczatku patrza w tym samym kierunku
        if(commands.length()==0){  //jezeli nie ma zadnych komend
            return lookingInSameDirectionTimes;   //=0
        }else{  //jezeli sa jakies komendy
            for(int i = 0; i<commands.length(); i++){
                if(isTheSameDirectionOfLooking){  //jezeli patrza w tym samym kierunku
                    if(commands.charAt(i)=='L' || commands.charAt(i)== 'R')
                        isTheSameDirectionOfLooking = false;
                    else
                        isTheSameDirectionOfLooking = true;
                }else{  //jezeli patrza w innym kierunku
                        if(commands.charAt(i)=='R' || commands.charAt(i)=='L')
                            isTheSameDirectionOfLooking = true;
                        else
                            isTheSameDirectionOfLooking = false;
                    }

                if (isTheSameDirectionOfLooking)  //jezeli jest true po kolejnym elemencie sekwencji to patrza w jednym kierunku
                    lookingInSameDirectionTimes++;
            }
        }
        return lookingInSameDirectionTimes;
    }
}
