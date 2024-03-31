//java program to sum 3X3 matrix.
import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[][][] mat=new int[2][3][3];
        int[][] sum=new int[3][3];
        for (var i=0;i<2;i++){
            for(var j=0;j<3;j++){
                for(var k=0;k<3;k++){
                    System.out.printf("enter the data for mat %d where row is %d and place is %d :\n",i+1,j+1,k+1);
                    mat[i][j][k]=scan.nextInt();
                }
            }
        }
        for (var i=0;i<3;i++){
            for(var j=0;j<3;j++){
                sum[i][j]=mat[0][i][j]+mat[1][i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
