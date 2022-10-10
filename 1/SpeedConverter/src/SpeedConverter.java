public class SpeedConverter {

    public static long toMilesPerHour(double kilomitersPerHour ){

         if(kilomitersPerHour < 0){

             return -1;
         }
         return  Math.round(kilomitersPerHour / 1.609);


    }

     public static void printConversion(double kilomitersPerHouer) {

         if(kilomitersPerHouer < 0){
             System.out.println("Invalid value");
         }
         else {

             long milesPerHour = toMilesPerHour(kilomitersPerHouer);
             System.out.println(kilomitersPerHouer+ " km/h " +milesPerHour+ " mi/h ");
         }
     }
}
