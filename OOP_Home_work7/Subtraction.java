package OOP_Home_work7;

public interface Subtraction {
    default double subtract(double a, double b){
        return a - b;
    }
}