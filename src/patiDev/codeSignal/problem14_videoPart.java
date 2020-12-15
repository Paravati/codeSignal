package patiDev.codeSignal;

public class problem14_videoPart {
    public static void main(String[] args){
        int[] arr = videoPart("02:20:00", "07:00:00");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static int[] videoPart(String part, String total){
        String[] partArr = part.split(":");
        String[] totalArr = total.split(":");
        int secondsOfVideo = Integer.parseInt(partArr[2]) + Integer.parseInt(partArr[1]) * 60 + Integer.parseInt(partArr[0]) * 3600;
        int totalTime = Integer.parseInt(totalArr[2]) + Integer.parseInt(totalArr[1]) * 60 + Integer.parseInt(totalArr[0]) * 3600;
        int greatestCommonDivisor = 0;
        for(int i = 1; i <= secondsOfVideo && i <= totalTime; i++)
        {
            if(secondsOfVideo%i==0 && totalTime%i==0)
                greatestCommonDivisor = i;
        }
        int[] returnArray = new int[2];
        returnArray[0] = secondsOfVideo/greatestCommonDivisor;
        returnArray[1] = totalTime/greatestCommonDivisor;
        return returnArray;
    }
}
