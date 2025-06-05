public class O {
    public static void main(String[] args) {
        int m=11;
        int n=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if((i==1&&j==1)||(i==1&&j==m)||(i==n&&j==1)||(i==n&&j==m)){
                    System.out.print(" ");
                }
                else if(i==1||j==1||i==n||j==m){
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
