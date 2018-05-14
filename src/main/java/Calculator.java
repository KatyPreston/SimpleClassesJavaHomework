public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int addNumbers() {
        return number1 + number2;
    }

    public int subtractNumbers() {
        return number1 - number2;
    }

    public int multiplyNumbers() {
        return number1 * number2;
    }

    public int divideNumbers() {
        return number1 / number2;
    }
}
