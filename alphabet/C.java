public class C {
    public static void main(String[] args) {
        int n=7;
        int m=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if((i==1&&j==1)||(i==n&&j==1)){
                System.out.print(" ");
               }
               else if(i==1||i==n||j==1) {
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
    

