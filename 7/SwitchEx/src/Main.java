public class Main {
    public static void main(String[] args) {


        char myVal = 'A';

        switch (myVal) {


            case 'A':
                System.out.println("A found");
                break;
            case 'B':
                System.out.println("B found");
                break;

            case 'C':
                System.out.println("C found");
                break;
            case 'D':
            case 'E':
            case 'F':
                System.out.println(myVal + " found");
                break;
            default:
                System.out.println("Not found");
                break;

        }

    }
}