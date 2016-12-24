package main;

import core.Core;
import core.ExecutionContext;
import core.ExecutionContextBuilder;
import exception.ExitException;
import interpreter.Interpreter;
import language.Language;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Brainfuck Interpreter
 *
 * @author Alexandre Clement
 * @since 09/11/2016.
 */
public class Main
{
    /**
     * La version
     */
    public static final double VERSION = 1.0;
    /**
     * Le logger d'exception
     */
    private static final Logger LOGGER = Logger.getLogger("Brainfuck - " + Calendar.getInstance().getTime().toString());
    /**
     * La sortie standard
     */
    public static final PrintStream DEFAULT_OUT = System.out;

    private Main()
    {
    }

    /**
     * Interprète et exécute la ligne de commande en entrée
     *
     * @param args la ligne de commande
     */
    public static void main(String... args)
    {
        int exit = 0;

        try
        {
            Interpreter interpreter = Interpreter.buildInterpreter(args);
            Language language = new Language(interpreter);
            Core core = new Core(language.getFilename());
            ExecutionContext context = new ExecutionContextBuilder()
                    .setIn(language.getIn())
                    .setOut(language.getOut())
                    .setExecutables(Core.getExecutables())
                    .buildFromFile(language.getFile());
            core.run(interpreter.getOptions(), interpreter.getProbes(), context);
        }
        catch (ExitException exception)
        {
            LOGGER.logp(Level.SEVERE, exception.getSourceClass(), exception.getSourceMethod(), exception.getMessage());
            LOGGER.throwing(exception.getSourceClass(), exception.getSourceMethod(), exception);
            exit = exception.getExit();
        }

        System.exit(exit);
    }

    /**
     * print out the parameter
     *
     * @param object to be print out
     */
    public static void standardOutput(Object object)
    {
        DEFAULT_OUT.print(object);
    }
}
