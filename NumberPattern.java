import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of rows");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        int number=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println("------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               if((i+j)%2==0){
                   System.out.print("1"+" ");
               }
               else {
                   System.out.print("0"+" ");
               }
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        int num=1;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
        System.out.println("------------------------");
        //palindrome number
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print(i + " ");
            }
            for (int j = i; j <= n; j++) {
                if (j==1){
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print(i + " ");
            }
            for (int j = i; j <= n; j++) {
                if(j==1){
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
       

    }}
