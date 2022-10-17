public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel( String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("abc") || (validModel.equals("def")))
        {
            this.model=model;
        }
       else{
            this.model = "unknown";
        }


    }
    public String getModel(){
            return this.model;
    }



       public void setEngine( String engine){
           this.engine= engine;

       }
       public String getEngine(){
          return this.engine;
       }



       public  void setDoors(int doors){
           this.doors=doors;
       }
       public int getDoors(){
         return this.doors;

       }
}
