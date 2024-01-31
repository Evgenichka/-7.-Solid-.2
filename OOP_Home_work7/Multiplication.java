package OOP_Home_work7;

public interface Multiplication {
    default double multiply(double a, double b) {
        return a * b;
    }
}