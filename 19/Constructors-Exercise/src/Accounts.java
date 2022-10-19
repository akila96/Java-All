public class Accounts {

   private String number;
   private double balance;
   private String CusName;
   private String email;
   private String phoneNum;


   public Accounts(){
      System.out.println("Empty constructor called");

   }
   public Accounts(String number, Double balance , String cusName , String email , String phoneNum){

      System.out.println("Count constructor with parameters called");
      this.number= number;
      this.balance=balance;
      this.CusName=cusName;
      this.email=email;
      this.phoneNum=phoneNum;


   }

   public Accounts(String cusName,String email,String number){

   }
   public void deposit(double depositAmount){
        this.balance += depositAmount;
      System.out.println("Deposit of :" +depositAmount + " made. New balance is : " +this.balance);
   }

   public void withdrawal(double withdrawalAmount){
      if(balance - withdrawalAmount <=0){
         System.out.println("only : " +this.balance +"available. withdrawal not processed");
      }else{
         balance-= withdrawalAmount;
         System.out.println("Withdrawal of: " +withdrawalAmount + "processed.  Remaining balance is : "+balance );
      }
   }


   public void setNumber(String number){
      this.number=number;

   }

   public String getNumber(){
      return number;
   }

   public void setBalance(double balance){
      this.balance=balance;
   }

   public double getBalance(){
      return balance;
   }

   public String getCusName() {
      return CusName;
   }

   public void setCusName(String cusName) {
      CusName = cusName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhoneNum() {
      return phoneNum;
   }

   public void setPhoneNum(String phoneNum) {
      this.phoneNum = phoneNum;
   }
}
