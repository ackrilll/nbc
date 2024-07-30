package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{
    int num1;
    int num2;
    char operation;
    int result;



    public ArithmeticCalculator(){
        getResultList().clear();
    }

    public int calculate(int inputNum1, int inputNum2, char inputOperation) throws DevException,OperationException{
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
        this.num1 = inputNum1;
        this.num2 = inputNum2;
        if( inputOperation != '+'&&inputOperation != '-'&&
            inputOperation != '*'&&inputOperation != '/'&&
            inputOperation!='%'){
            throw new OperationException();
        }
        this.operation = inputOperation;
        switch (operation) {
            case '+':
                result = add(num1,num2);
                break;

            case '-':
                result = sub(num1,num2);
                break;

            case '*':
                result = mul(num1,num2);
                break;

            case '/':
                if (num2 == 0) {
                    throw new DevException();
                } else {
                    result = div(num1,num2);
                }
                break;

            case '%':
               result = mod(num1,num2);
               break;
        }
        getResultList().add(result);
        return result;
        //lv 2-1
        //lv 2-2

    }


}
