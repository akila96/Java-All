public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of digits in nnumber : " +sumDigits(125));
        System.out.println("The sum of digits in nnumber : " +sumDigits(-125));
        System.out.println("The sum of digits in nnumber : " +sumDigits(1));
        System.out.println("The sum of digits in nnumber : " +sumDigits(3215));
    }

    private static int sumDigits(int number){
      if(number < 10){
          return -1;
         }
   int sum=0;
      while(number > 0){
          int digit = number % 10;
          sum+= digit;

          number /=10;
      }
      return sum;
    }
}