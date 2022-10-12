public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(NewClass.isEvenNumber(5));
        System.out.println(isEvenNumber(10));

        int x = 6;
        while (x != 10) {
            System.out.println("number is :" + x);
            x++;
        }

        int y = 1;
        while (true) {
            if (y == 6) {
                break;
            }
            System.out.println("number is :" + y);
            y++;
        }

        for (int k = 1; k != 10; k++) {
            System.out.println("number is " + k);
            if (k == 5) {
                break;
            }

        }

        x = 1;
        do {
            System.out.println("new number is ;" + x);
            x++;
        }
        while (x != 7);

        for (int g = 6; g <= 9; g++) {
            System.out.println("number is  :" + g);
        }
    }



  public static boolean isEvenNumber(int number){

             if((number % 2) == 0){
                 return true;

             }
             else{
                 return false;
             }

        }

}
