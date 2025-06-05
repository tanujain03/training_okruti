import java.util.*;
public class H {
    public static void main(String[] args) {
     Scanner Sc=new Scanner (System.in);
     System.out.println("enter the value of n");
     int n=Sc.nextInt();
     System.out.println();
     int i=1;
     int j,mid;
     mid=(n+1)/2;
     while(i<=n){
        j=1;
        while(j<=n){
            if(j==1||j==n || i==mid){
                System.out.print("*"); 
            }
                
            else{
                System.out.print(" ");
            }
                    
            j++;
            }
        System.out.println();
        i++;

            }
            
        }
    }
