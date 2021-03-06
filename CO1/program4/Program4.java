import java.util.Scanner;

class Matrix{
    int row;
    int col;
}

public class Program4{
     public static void main(String[] args) {
        Matrix m = new Matrix();
        Scanner s = new Scanner(System.in);
        int i,j,flag=1;

        System.out.println("Enter number of rows:");
        m.row=s.nextInt();
        System.out.println("Enter number of columns:");
        m.col=s.nextInt();
        int[][] matrix=new int[m.row][m.col];

        System.out.println("Enter the element of Matrix: ");
        for(i=0;i<m.row;i++){
            for(j=0;j<m.col;j++)
                matrix[i][j]=s.nextInt();
               
        }
        
        System.out.println("Matrix : ");
        for(i=0;i<m.row;i++){
            for(j=0;j<m.col;j++){
                System.out.print(matrix[i][j]+ "\t");
            }
         System.out.println();  
        } 

        System.out.println("Transpose Matrix : ");
        for(i=0;i<m.row;i++){
            for(j=0;j<m.col;j++){                     
                System.out.print(matrix[j][i]+ "\t");
            }
         System.out.println();  
        } 

        for(i=0;i<m.row;i++){
            for(j=0;j<m.col;j++){
                if(matrix[i][j] != matrix[j][i]){
                  flag=0;
                  break;
                }
            }
        }
       if(flag==1){
            System.out.println("Matrix is Symmetric");
        }
       else{
            System.out.println("Matrix is Not Symmetric");
        }   
    }

}
