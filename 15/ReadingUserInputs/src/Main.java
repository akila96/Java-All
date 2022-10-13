import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter your birthday :");
        int birthDay =scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age=2022- birthDay;



        System.out.println("name is: " + name + " .your birthday is " +age);

         scanner.close();


    }
}