import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter your birthday :");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int birthDay = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - birthDay;

            if ((age > 0) && (age < 100)) {
                System.out.println("name is: " + name + " .your birthday is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        }else{

            System.out.println("Unable to parse year of birth");
        }
         scanner.close();


    }
}