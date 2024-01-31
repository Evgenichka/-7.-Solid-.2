package OOP_Home_work7;

public interface Dividing {
    default double divide(double a, double b){
        return a / b;
    }
}