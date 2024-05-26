package algorithms.warmup;

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String amPm = s.substring(s.length() -2);
        String timeWithoutAmPm = s.substring(0 , s.length()-2);


        String[] timeComponents = timeWithoutAmPm.split(":");

        int hours = Integer.parseInt(timeComponents[0]);
        int minutes = Integer.parseInt(timeComponents[1]);
        int seconds = Integer.parseInt(timeComponents[2]);

        if(amPm.equals("AM") && hours == 12){
            hours = 0;
        }else if(amPm.equals("PM") && hours !=12  ){
            hours += 12;
        }
        String parsedHour = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return parsedHour;
    }
}
