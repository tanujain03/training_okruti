public class W {
    public static void main(String[] args) {
        int n=5;
        int m=11;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j==1||j==m||i==j||i+j==m+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
    }System.out.println();
    
}
}}

