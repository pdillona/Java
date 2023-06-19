package step1;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = scanner.nextInt();

        int result = a * b;

        System.out.println("곱셈 과정 출력:");
        System.out.println("--------------");

        System.out.printf("%5d\n", a);
        System.out.printf("x%4d\n", b);
        System.out.println("-------");

        int tempNum2 = a;
        int count = 0;
        int sum = 0;
        while (tempNum2 > 0) {
            int digit = tempNum2 % 10;
            int partialProduct = a * digit;
            
            System.out.printf("%5d\n", partialProduct);
            if (count > 0) {
                System.out.print("+");
                for (int i = 0; i < count; i++) {
                    System.out.print(" ");
                }
            }
            System.out.println("-------");

            sum += partialProduct * (int) Math.pow(10, count);
            count++;
            //System.out.println("템프2값"+ tempNum2);
            tempNum2 /= 10;
        }

        System.out.println("-------");
        System.out.printf("%5d\n", result);
        System.out.println("--------------");
        System.out.println("최종 결과: " + result);
    }
}

