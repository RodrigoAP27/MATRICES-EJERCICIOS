import java.util.Scanner;
public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        int n;
        System.out.println("ingresa numero de columnas");
        m= sc.nextInt();
        System.out.println("ingresa numero de filas");
        n= sc.nextInt();
        int [][] numero = new int[n][m];
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                System.out.print("escribe un numero en esta pocision: " +i+ "," +j   );
                numero[i][j] = sc.nextInt();
            }

        }
        int[] M=new int[3];
        for (int i=0;i<m;i++){
            for (int j = 0;j <n; j++){
            M[i] += numero[j][i];

            }
        }
        for (int j = 0; j < m; j++) {
            System.out.println("Suma de la columna " + j + ": " + M[j]+"");
        }








    }
}