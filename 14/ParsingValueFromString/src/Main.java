public class Main {
    public static void main(String[] args) {

        String numberAsString ="2018";
        System.out.println("number As String : " +numberAsString);

        // float number =Float.parseFloat(numberAsString);
        // System.out.println("number is :" +number);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number is: "+ number);

        //double number =Double.parseDouble(numberAsString);
        //System.out.println("number is:" +number);



        numberAsString += 1;
        number +=1;

        System.out.println(numberAsString);
        System.out.println(number);




    }


}