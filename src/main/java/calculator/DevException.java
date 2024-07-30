package calculator;

public class DevException extends Exception{
    public DevException(){
        super("0으로는 나눌 수 없습니다.");
    }
}
