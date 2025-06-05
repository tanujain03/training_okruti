import java.util.*;
public class D {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter rows");
        int n=Sc.nextInt();
        System.out.println("enter column");
        int m=Sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==3||j==m){
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

