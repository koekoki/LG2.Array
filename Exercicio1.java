package Array;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] a = new int[9];
        int[] b= new int[9];
        int i;
        for (i=0;i<9;i++){
            a[i]=i;
            b[i]=i*3;
            System.out.println("array A: "+a[i]);
        }
        for (i=0;i<9;i++){
            System.out.println("array B: "+b[i]);
        }
    }
}
