public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));

    }

    private static String getDurationString(long minutes , long second ){


        if ((minutes<0) || (second < 0) ||(second > 59))
        {
            return "invalid number";
        }
        long hours= minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours +  "h " + remainingMinutes  + "m " + second +  "s" ;
    }

    private  static String getDurationString(long second){
        if (second < 0){
            return  "invalid number";
        }

        long minutes =second / 60;
        long remainngSeconds = second % 60 ;
        String x = getDurationString(minutes,remainngSeconds);
        return x;

    }
}