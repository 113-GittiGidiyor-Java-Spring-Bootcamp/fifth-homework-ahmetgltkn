package exceptions;

public class InstructorAlreadyExistsException  extends RuntimeException {
    public InstructorAlreadyExistsException(String msg){
        super(msg);
    }

}