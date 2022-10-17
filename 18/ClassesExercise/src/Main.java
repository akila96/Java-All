public class Main {
    public static void main(String[] args) {


        Car porche =new Car();
        Car holden =new Car();

        porche.setModel("abc");
        System.out.println("Model is : " +porche.getModel());

        porche.setEngine("SR20");
        System.out.println("Engine is : " +porche.getEngine());

        porche.setDoors(5);
        System.out.println("Number of doors : " +porche.getDoors());

        holden.setEngine("Orient");
        System.out.println("Engine is :" +holden.getEngine());
    }
}