public class Main {
    public static void main(String[] args) {
        int value = sum(5,2);
        System.out.println("sum is "+value);

        int value1 = sum(5,2, 4);
        System.out.println("sum is "+value1);

        int value2 = sum(5,2,6,8);
        System.out.println("sum is "+value2);
    }

    public static int sum(int a,int b){
        return a+b;

    }
    public static int sum(int a,int b,int c){
        return a+b+c;

}   public static int sum(int a,int b,int c,int d ) {
        return a + b + c + d;
    }
}