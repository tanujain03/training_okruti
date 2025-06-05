
import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entetr the value of row");
        int n=sc.nextInt();
        System.out.println("entetr the value of column");
        int m=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

