public class MegaBiteConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

     if(kiloBytes < 0){
         System.out.println("invalid value");
     }else {
         int megaBytes = (kiloBytes / 1024);
         int remainingKiloBytes = (kiloBytes % 1024);
         System.out.println(kiloBytes + " KB = " + megaBytes +
                 " MB AND " + remainingKiloBytes + " KB");
     }


    }
}
