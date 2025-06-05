import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i =n ; i>=1; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i =n ; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i =1;i<=n; i++) {
            for (int j=1; j<=2*n; j++) {
                if((i+j)>=n+1 && (j-i)<=n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i =n;i>=1; i--) {
            for (int j=1; j<=2*n; j++) {
                if((i+j)>=n+1 && (j-i)<=n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i =1;i<=2*n; i++) {
            for (int j=1; j<=2*n; j++) {
                if ((i + j >= n + 1) && (j - i <= n - 1) && (i - j <= n - 1) && (i + j <= 3 * n - 1))  {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
        System.out.println("_________________________");
        for (int i =1; i <= 2*n; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i-j>=0 && (i+j)<=2*n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j) % 2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        int count=1;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i = 1; i<=n; i++) {
            char ch='A';
            for (int j = 1; j <=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i = n; i>=1; i--) {
            char ch='A';
            for (int j = 1; j <=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        System.out.println("_________________________");
        char ch='A';
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
        System.out.println("_________________________");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

System.out.println();
        }
}}