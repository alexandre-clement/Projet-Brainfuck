package interpreter;

/**
 * @author Alexandre Clement
 *         Created the 10/11/2016.
 */
public enum Flag
{
    // Flag     opt     longOpt         help        required    hasArg  argName     isStandardOutputOption  description
    HELP(       "h",    "help",         true,       false,      false,  null,       false,                  "Print the help"),
    VERSION(    "v",    "version",      true,       false,      false,  null,       false,                  "Print the version"),
    PRINT(      "p",    null,           false,      true,       true,   "FILE",     false,                  "Specify the file name of program to execute. If no print on the standard output option are selected, it will execute the program and print the memory content"),
    REWRITE(    null,   "rewrite",      false,      false,      false,  null,       true,                   "Print on the standard output the shortened version of the program given as input (and not execute it)"),
    TRANSLATE(  null,   "translate",    false,      false,      false,  null,       true,                   "Create a square bitmap image with the content of the program (and not execute it)"),
    INPUT(      "i",    null,           false,      false,      true,   "INPUT",    false,                  "Specify the file name of the input file (the file given must exists)"),
    OUTPUT(     "o",    null,           false,      false,      true,   "OUTPUT",   false,                  "Specify the file name of the output file (the file given must exists)"),
    CHECK(      null,   "check",        false,      false,      false,  null,       true,                   "Verify if the program is well-formed i.e each JUMP instruction is bound to a BACK one, and exit silently (without executing the program)"),
    METRICS(    "m",    "metrics",      false,      false,      false,  null,       false,                   "Display the metrics of the execution of the program on the standard output"),
    TRACE(      null,   "trace",        false,      false,      false,  null,       false,                   "Create a log file with execution data named filename.log (for -p filename.bf)");

    private String opt;
    private String longOpt;
    private boolean help;
    private boolean required;
    private boolean hasArg;
    private String argName;
    private boolean isStandardOutputOption;
    private String description;

    Flag(String opt, String longOpt, boolean help, boolean required, boolean hasArg, String argName, boolean isStandardOutputOption, String description)
    {
        this.opt = opt;
        this.longOpt = longOpt;
        this.help = help;
        this.required = required;
        this.hasArg = hasArg;
        this.argName = argName;
        this.isStandardOutputOption = isStandardOutputOption;
        this.description = description;
    }

    public String getOpt()
    {
        return opt;
    }

    public String getLongOpt()
    {
        return longOpt;
    }

    public boolean isHelp()
    {
        return help;
    }

    public boolean isRequired()
    {
        return required;
    }

    public boolean hasArg()
    {
        return hasArg;
    }

    public String getArgName()
    {
        return argName;
    }

    public boolean isStandardOutputOption()
    {
        return isStandardOutputOption;
    }

    public String getDescription()
    {
        return description;
    }
}