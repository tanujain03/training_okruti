public class Y {
    public static void main(String[] args) {
        int n=11;
        int m=11;
        int mid=(m+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==j&&i<mid||i+j==m+1&&i<mid||j==mid&&i>mid){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
    }System.out.println();
    
}
}}
