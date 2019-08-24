public class Main {

    static public int n = 4;
    static public int m = 5;


    public static void main(String[] args) {
        System.out.println("Первое задание");
        Array array = new Array(m);
        array.printMas();
        array.reverce();
        array.printMas();
        System.out.println("Второе задание");
        Matrix matrix = new Matrix(n, m);
        matrix.printMas();
        matrix.reverse();
        matrix.printMas();
    }
}
