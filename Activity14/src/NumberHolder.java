import java.util.Scanner;

class NumberHolder<T extends Number> {
    private T number1;
    private T number2;

    public void setNumber1(T number1) {
        this.number1 = number1;
    }

    public void setNumber2(T number2) {
        this.number2 = number2;
    }

    public int sum() {
        return number1.intValue() + number2.intValue();
    }

    public double sumDouble() {
        return number1.doubleValue() + number2.doubleValue();
    }
}