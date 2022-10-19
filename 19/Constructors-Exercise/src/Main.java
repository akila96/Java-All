public class Main {
    public static void main(String[] args) {

        Accounts bobsAccount =new Accounts("12345",0.00,"bob","bob@gmail.com","(011)-1234567");
        Accounts timAccount= new Accounts("Tim", "Tim@gmail.com","123445");
        //bobsAccount.setCusName("Bob");
        //bobsAccount.setNumber("12345");
        //bobsAccount.setEmail("bobs@gmail.com");
        //bobsAccount.setPhoneNum("(011) - 1234567");
        //bobsAccount.setBalance(0.00);

        System.out.println(bobsAccount.getCusName());
        System.out.println(bobsAccount.getEmail());

         bobsAccount.deposit(100);
         bobsAccount.withdrawal(50);
         bobsAccount.withdrawal(100);

         bobsAccount.deposit(51);
         bobsAccount.deposit(100);
         bobsAccount.withdrawal(200);

         VipPerson person1 = new VipPerson();
         System.out.println(person1.getName());

         VipPerson person2 = new VipPerson("Bob",2500.00);
         System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());

         VipPerson person3 =new VipPerson("Tim",3500.00,"tim@gmaul.com");
        System.out.println(person3.getName());
    }
}