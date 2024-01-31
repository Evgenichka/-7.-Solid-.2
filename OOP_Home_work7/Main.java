package OOP_Home_work7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorView calculatorView = new CalculatorView();
        CalculatorController calculatorController = new CalculatorController(calculatorModel, calculatorView);

        calculatorController.run();

        // Код для проверки работы лога
        System.out.println("\nЗаписано в логах:");
        System.out.println(String.join("\n", calculatorController.log));
    }
}