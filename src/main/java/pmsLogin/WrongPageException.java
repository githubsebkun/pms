package pmsLogin;

/**
 * Created by sindh on 10/03/2017.
 */
public class WrongPageException extends RuntimeException{

    public WrongPageException(String message){

        super(message);
    }
}