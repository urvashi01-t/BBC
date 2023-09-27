package CustomExceptions;

public class CustomBillIdNotFoundException extends RuntimeException {
public CustomBillIdNotFoundException(String message){
	super(message);
}
}
