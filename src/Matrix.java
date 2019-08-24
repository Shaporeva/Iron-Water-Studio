public class Matrix {
    private Integer[][] mas;

    Matrix (int n, int m){
        mas = new Integer[n][m];
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                mas[i][j] = (int)(Math.random()*10);
            }
        }
    }

    Integer[] get(int i){
        return mas[i];
    }

    void set(Integer[] mas2, int i ){
        mas[i-1]= mas[i];
        mas[i] = mas2;
    }

    void printMas(){
    for (int i = 0; i<mas.length; i++){
        for (int j = 0; j<mas[i].length; j++){
            System.out.print(mas[i][j]+ " ");
        }
        System.out.println("");
    }
        System.out.println("");
    }

    public void reverse() {
        for (int i = 1; i < mas.length; i = i + 2) {
            set(get(i-1),i);}
    }


}
