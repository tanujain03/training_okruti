class G{
    public static void main(String[] args) {
        int n=9;
        int m=11;
        int mid=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1){
                    System.out.print("*");
                }
                
    }System.out.println();
}
for(int i=n;i<mid;i--){
    for(int j=1;j<n;j++){
        System.out.print(" ");
        if(i==mid||j==n){
            System.out.print("*");
        }
    }

}
    }
}