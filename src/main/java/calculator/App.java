package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws DevException, OperationException {
        // LV 1-1
        Scanner sc = new Scanner(System.in);
        boolean end_flag = true;
        CircleCalculator circleCalculator = new CircleCalculator();
        ArithmeticCalculator arithmeticCalculator =new ArithmeticCalculator();
        while(end_flag) {
            System.out.println("원의 넓이를 구하려면 circle을 입력하세요.(일반 사칙연산은 아무키나 누르고 엔터를 누르세요): ");
            String Iscircle = sc.next();
            if(Iscircle.equals("circle")){
                System.out.println("원의 반지름은 얼마입니까?: ");
                double r = sc.nextDouble();
                double result = circleCalculator.calculateCircleArea(r);
                System.out.println(result);
            }else {
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

                int result = arithmeticCalculator.calculate(num1,num2,operation);
                System.out.println(result);


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String answer_remove = sc.next();
                if(answer_remove.equals( "remove")){
                    arithmeticCalculator.removeResult();
                }
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String answer_inquiry = sc.next();
                if(answer_inquiry.equals("inquiry")){
                    arithmeticCalculator.inquiryResults();
                }

                /* 위 요구사항에 맞게 구현 */

                //LV 1-4
                System.out.println("더 계산하시려면 아무 키나 누르고 엔터키를 누르세요. (exit 입력 시 종료)");
                String answer = sc.next();
                if (answer.equals("exit")) {
                    end_flag = false;
                }
            }
        }
        //LV 1-5
        //LV 1-6
        //LV 1-7
        //LV 1-8

        //Lv 2-2
        //Lv 2-5
    }
}

