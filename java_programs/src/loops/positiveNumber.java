package loops;

import java.util.Scanner;

public class positiveNumber {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        for (int i= 0; i<=5; i++){
            System.out.println("please enter your numbers");
            int value = scan.nextInt();
            if (value > num ){
                num = value;
                num += i;
                System.out.println(num);
            }
        }
    }
}
