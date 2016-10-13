package language.instruction;

import model.OperatingSystem;

/**
 * Brainfuck Project
 *
 * @author SmartCoding
 */
public class Decr implements Instruction {

    @Override
    public void exec(OperatingSystem os) {
        os.decr();
        os.nextI();
    }

    @Override
    public String getLongSyntax() {
        return "DECR";
    }

    @Override
    public Character getShortSyntax() {
        return '-';
    }

    @Override
    public String toString() {
        return "Decr";
    }
}
