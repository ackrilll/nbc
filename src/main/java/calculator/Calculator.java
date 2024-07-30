package calculator;

import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    int num1;
    int num2;
    char operation;
    int result;
    private ArrayList<Integer>resultList = new ArrayList<>();
    private ArrayList<Double>circleResultList = new ArrayList<>();
    final double pi = 3.14159265359; // pi는 상수 이므로 final 붙여줌
    private double circle_s;

    // 생성자
    public Calculator(){
        resultList.clear();
        circleResultList.clear();
    }

    public int calculate(int inputNum1, int inputNum2, char inputOperation) throws DevException,OperationException{
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
        this.num1 = inputNum1;
        this.num2 = inputNum2;
        if( inputOperation != '+'&&inputOperation != '-'&&
            inputOperation != '*'&&inputOperation != '/'){
            throw new OperationException();
        }
        this.operation = inputOperation;
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
                    throw new DevException();
                } else {
                    result = num1 / num2;
                }
                break;
        }
        resultList.add(result);
        return result;
        //lv 2-1
        //lv 2-2

    }

    public ArrayList<Integer> getResultList(){
        return resultList;
    }
    public void setResultList(ArrayList<Integer> List){
        this.resultList = List;
    }
    //lv 2-3
    public void removeResult() {
        /* 구현 */
        resultList.remove(0);
    }
    public void inquiryResults() {
        /* 구현 */
        for(int result : resultList){
            System.out.println(result);
        }
    }
    public double calculateCircleArea(double r) {
        /* 원의 넓이 계산 구현 */
        circle_s = r*r*pi;
        circleResultList.add(circle_s);
        return circle_s;
    }
    public double getCircle_s(){
        return circle_s;
    }
    public void setCircle_s(double s){
        this.circle_s = s;
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */
}


