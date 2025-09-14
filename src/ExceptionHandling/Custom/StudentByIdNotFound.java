package ExceptionHandling.Custom;

public class StudentByIdNotFound extends Exception{

    public StudentByIdNotFound(String message){
        super(message);
    }
}
