package edu.isu.cs.cs2263.hw01;

/**
 * A Simple class to implement the Output Interface, nothing fancy
 *
 * @author Isaac D. Griffith
 */
public class ExpressionOutputter implements Output {

    @Override
    public void output(String result) {
        System.out.printf("  -> %s\n", result);
    }
}
