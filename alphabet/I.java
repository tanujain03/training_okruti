public class I {
    public static void main(String[] args) {
        int n=5;
        int m=4;
        int mid=(m+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==mid||i==n){
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
 