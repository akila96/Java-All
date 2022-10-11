public class Main {
    public static void main(String[] args) {
        System.out.println("10 000 at 2% rate is " +calculateInterest(10000.0, 2.0));
        System.out.println("10 000 at 3% rate is " +calculateInterest(10000.0, 3.0));
        System.out.println("10 000 at 4% rate is " +calculateInterest(10000.0, 4.0));
        System.out.println("10 000 at 5% rate is " +calculateInterest(10000.0, 5.0));

        System.out.println(calculateInterest(10000.0,2.0));


        for(int i= 0 ; i<5 ; i++){
            System.out.println("number is " +i);

        }

        for(int i =2; i<9 ;i++){
            System.out.println("10 000 at " +i +" rate is" +calculateInterest(10000.0, i));


        }
        System.out.println("************************");

        for(int i=8; i>=2 ; i--){
            System.out.println("10 000 at " +i +" rate is" +calculateInterest(10000.0, i));

        }

        for(int num=0; num <=10 ; num +=2){

            System.out.println("number is: " +num);
        }
    }


    public static double calculateInterest(double amount, double interestRate){

        return  (amount*(interestRate/100));
    }


}