package exceptions;

public class StudentAgeNotValidException extends  RuntimeException{
    public StudentAgeNotValidException(String msg){
        super(msg);
    }
}
