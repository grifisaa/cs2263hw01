package edu.isu.cs.cs2263.hw01;

import java.util.List;
import java.util.Scanner;

/**
 * A simple app to explore some aspects of Java
 *
 * @author Isaac D Griffith
 */
public class App {

    /**
     * Main method which handles the main execution loop
     * @param args Command Line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Output out = new ExpressionOutputter();

        while (true) {
            System.out.print("> ");
            String line = scan.nextLine();
            int result = processExpression(line);
            out.output(Integer.toString(result));
        }
    }

    /**
     * Simple method to process the expressions and return a result
     * @param expr The input string from the user (assumed to be good input)
     * @return The value of the expression
     */
    public static int processExpression(String expr) {
        int result = 0;
        String[] components = expr.split(" ");
        List<String> operators = List.of("+", "-", "/", "*");
        String operator = "";
        for (String item : components) {
            if (!operators.contains(item)) {
                switch(operator) {
                    case "+" -> {result += Integer.parseInt(item);}
                    case "-" -> {result -= Integer.parseInt(item);}
                    case "/" -> {result /= Integer.parseInt(item);}
                    case "*" -> {result *= Integer.parseInt(item);}
                    default -> {result = Integer.parseInt(item);}
                }
            } else {
                operator = item;
            }
        }

        return result;
    }
}
