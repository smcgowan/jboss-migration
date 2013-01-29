package cz.muni.fi.jboss.migration.ex;

/**
 * Class for expression which will be thrown in case of error in CliScriptImpl
 *
 * @author Roman Jakubco
 * Date: 10/7/12
 * Time: 3:43 PM
 */

public class CliScriptException extends Exception {

    public CliScriptException(String message){
          super(message);
    }

     public CliScriptException(String message, Throwable cause){
        super(message,cause);
    }
    public CliScriptException(Throwable cause){
        super(cause);
    }
}