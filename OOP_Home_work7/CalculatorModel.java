package OOP_Home_work7;
public class CalculatorModel implements Summary, Subtraction, Multiplication, Dividing {
    private double num1;
    private double num2;
    private char sym;


    public CalculatorModel(int num1, int num2, char sym) {
        this.num1 = num1;
        this.num2 = num2;
        this.sym = sym;
    }

    public CalculatorModel() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getSym() {
        return sym;
    }

    public void setSym(char sym) {
        this.sym = sym;
    }

    public double calculation() {
        return switch (sym) {
            case '+' -> sum(num1, num2);
            case '-' -> subtract(num1, num2);
            case '*' -> multiply(num1, num2);
            case '/' -> divide(num1, num2);
            default -> -1;
        };
    }
}
