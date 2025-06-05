package alphabet;

import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter rows");
        int n=Sc.nextInt();
        int mid=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1||i==mid){
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
