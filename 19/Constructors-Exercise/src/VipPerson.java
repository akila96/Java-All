public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson(){
       this("Default name" , 50000.00,"Default@gmail.com");
    }

   public  VipPerson(String name, double creditLimit){
      this(name,creditLimit,"unknown@gmail.com");
   }

    public VipPerson(String name, double creditLimit, String emailAddress) {  //  <-----Constructor
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public String getName() {
        return name;
    }



    public double getCreditLimit() {
        return creditLimit;
    }



    public String getEmailAddress() {
        return emailAddress;
    }





}
