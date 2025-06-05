public class K {
        public static void main(String[] args) {
            int n=11;
            int m=11;
            int mid=(n+1)/2;
                    for(int i=1;i<=mid;i++){
                        for(int j=1;j<=m;j++){
                            if(j==1&&i<=mid||i+j==m-1){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
    
                    }
                  for(int i=mid;i<=n;i++){
                        for(int j=1;j<=m;j++){
                            if(j==1&&i>mid||i+j==m-1){
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
        
