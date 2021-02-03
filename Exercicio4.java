package Array;

public class Exercicio4 {
    public static void main(String[] args) {
        int[][] a = new int[50][100];
        for (int i = a.length-1;i>=0;i--)
            for (int j = a.length-1;j>=0;j--){
                a[i][j]= i+j;
                System.out.println(a[i][j]);
            }
    }
}
