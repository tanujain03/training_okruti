import java.util.*;
public class S {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=sc.nextInt();
        System.out.println("enter no of columns");
        int m=sc.nextInt();
        int mid=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++) {
                if((i==1&&j==1)||(i==mid&&j==1)||(i==mid&&j==m)||(i==n&&j==m)){
                    System.out.print(" ");
                }
                else if(i==1||i==mid||(j==1&&i<mid)||(i==n||j==m&&i>mid)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
}
System.out.println();
        }}}
