package main;

import interpreter.Interpreter;


/**
 * Brainfuck Project
 * Main Class
 *
 *
 * @author SmartCoding
 * @version Slice 0
 *
 * Created the 4 October 2016
 */

public class Main {
    public static void main(String... args) {
        System.out.println("edit4");
        Interpreter interpreter = new Interpreter(args);
        interpreter.buildSystem();
    }
}
