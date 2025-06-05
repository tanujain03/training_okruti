public class T {
    public static void main(String[] args) {
        int n=11;
        int m=19;
        int mid=(m+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==mid){
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
