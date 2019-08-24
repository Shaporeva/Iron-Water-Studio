public class Array {
    private Integer[] mas;
    private int randMax = 100;

    Array(int m){
        mas = new Integer[m];
        for (int i = 0; i<mas.length; i++){
            mas[i] = (int)(Math.random()*randMax);
        }
    }

    public void printMas(){
        for (int i = 0; i<mas.length; i++){
            System.out.print(mas[i]+ " ");
        }
        System.out.println("");
    }

    public void reverce(){
        for (int i=0, k=0;i<mas.length/2; i++ ){
            k = mas[mas.length-i - 1];
            mas[mas.length-i - 1] = mas[i];
            mas[i] = k;
        }
    }
}
