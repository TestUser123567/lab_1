public class Main {
    public static void main(String[] args){
        int a = (int)(20 + Math.random()*10);
        int b = (int)(40 + Math.random()*10);
        System.out.println("a - " + a + "\n" + "b - " + b);
        myNumberProcessing(a, b);
    }
    public static void myNumberProcessing(int a, int b){
        System.out.println("Sum a & b - " + (a + b));
        System.out.println("Product a & b - " + (a * b));
    }
}
