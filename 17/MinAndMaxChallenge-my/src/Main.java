import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner  scanner=new Scanner(System.in);

   int min=0;
   int max=0;

     while(true){
         System.out.println("Enter the number : ");
         boolean isAnInt= scanner.hasNextInt();

         if(isAnInt){
          int number =scanner.nextInt();

          if(number > max){
              number=max;

          }
           if(number < min){
               number=min;
           }
         }
        else{
             break;
          }
        scanner.nextLine();
     }
        System.out.println("min =" +min + " max = " +max);
      scanner.close();
    }
}