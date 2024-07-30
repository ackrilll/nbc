package calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> circleResultList = new ArrayList<>();
    final double pi = 3.14159265359; // pi는 상수 이므로 final 붙여줌
    private double circle_s;
    int num1;
    int num2;
    char operation;
    int result;
    private ArrayList<Integer> resultList = new ArrayList<>();
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */


    // 생성자
    public Calculator(){
        resultList.clear();
        circleResultList.clear();
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
        for(Object result : resultList){
            System.out.println(result);
        }
    }
    public double getCircle_s(){
        return circle_s;
    }
    public void setCircle_s(double s){
        this.circle_s = s;
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */
}


