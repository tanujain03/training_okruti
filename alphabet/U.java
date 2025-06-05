import java.util.*;
public class U {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of rows");
    int n=sc.nextInt();
    System.out.println("enter the value of column");
    int m=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if((i==n&&j==1)||(i==n&&j==m)){
                System.out.print(" ");
            }
else if(j==1||j==m||i==n){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        }
        System.out.println();
        
    }
    }
   
}
