package OOP_Home_work7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorView {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String userInput (String message) throws IOException {
        System.out.print(message);
        return reader.readLine();
    }
}