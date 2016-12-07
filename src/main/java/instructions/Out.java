package instructions;

import core.ExecutionContext;
import exception.CoreException;
import exception.LanguageException;

/**
 * @author Alexandre Clement
 *         Created the 25/11/2016.
 */
public class Out implements Executable
{

    @Override
    public void execute(ExecutionContext executionContext) throws CoreException, LanguageException
    {
        executionContext.out.print((char) executionContext.printValue());
        executionContext.out.flush();
    }
}
