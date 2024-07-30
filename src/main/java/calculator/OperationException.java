package calculator;

public class OperationException extends Exception{
    public OperationException(){
        super("연산자가 '+','-','*','/' 중 하나가 아닙니다.");
    }
}
