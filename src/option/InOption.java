package option;

import file.StandardTextFile;

/**
 * @author SmartCoding
 *         Created the 13 octobre 2016.
 */
public class InOption extends FileOption {

    @Override
    public String getName() {
        return "-i";
    }

    @Override
    public void Call(String program) {
        input.setFile(new StandardTextFile(getFilename()));
    }
}