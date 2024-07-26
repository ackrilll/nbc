package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // LV 1-1
        Scanner sc = new Scanner(System.in);
        int[] results = new int[10];
        int result_index = 0;
        boolean end_flag = true;
        while(end_flag) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            //LV 1-2
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char operation = sc.next().charAt(0);

            //LV 1-3
            int result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                    } else {
                        result = num1 / num2;
                    }
                    break;
            }
            System.out.println(result);
            if(result_index > 9){ // result_index가 10이 되면 배열 한칸씩 옮기고 result_index 는 9로 돌아옴
                for (int i = 0; i < 9; i++) {
                    results[i] = results[i+1];
                }
                result_index = 9;
            }
            results[result_index] = result;
            result_index += 1;
            System.out.println(Arrays.toString(results));

            //LV 1-4
            System.out.println("더 계산하시려면 아무 키나 누르고 엔터키를 누르세요. (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                end_flag = false;
            }
        }
        //LV 1-5
        //LV 1-6



    }
}

