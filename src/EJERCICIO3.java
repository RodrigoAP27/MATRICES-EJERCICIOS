import javax.swing.*;
public class EJERCICIO3 {
    public static void main(String[] args) {
        String[][]tabla=new String[5][5];
        for (int i=0;i< 5 ;i++){
            for (int j=0;j<5 ;j++){

                if ((i==0)||(i==4)||(i==j)){
                    tabla[i][j]="X";
                }else{
                   tabla[i][j]=" ";
                }
                System.out.print("|"+tabla[i][j]);

            }
            System.out.println("|");


        }

    }
}
