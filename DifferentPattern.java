public class DifferentPattern {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");
        for (int i = 1; i <=n; i++) {
            // Print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // Print stars for the first and last n
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else { // Print stars for other n
                System.out.print("*");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("--------------");
        for (int i=1;i<=n;i++){
            for (int j = 1; j <=n ; j++) {
                for (int k = 1; k <=2*i-1 ; k++) {
                    if (j==1||j==(2*i-1)){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }

            }
            System.out.println(" ");
        }
    }
}
