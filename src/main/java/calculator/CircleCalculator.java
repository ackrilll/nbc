package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    private ArrayList<Double> circleResultList = new ArrayList<>();
    final double pi = 3.14159265359; // pi는 상수 이므로 final 붙여줌
    private double circle_s;
    public CircleCalculator(){
        circleResultList.clear();
    }
    public double calculateCircleArea(double r) {
        /* 원의 넓이 계산 구현 */
        circle_s = r*r*pi;
        circleResultList.add(circle_s);
        return circle_s;
    }

}
