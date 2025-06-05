public class R {
    public static void main(String[] args) {
        int n=9;
        int m=11;
        int mid=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if((i==1&&j==m)||(i==mid&&j==m)){
                    System.out.print(" ");
                }
                else if((i==1||i==mid||j==1||j==m&&i<mid)||(i>mid&&i-1==j)){
                    System.out.print("*");
                 } 
                else{
                    System.out.print(" ");
                }}
                System.out.println();}
               
                     
    }
 
}