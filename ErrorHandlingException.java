package Exception;

public class ErrorHandlingException {
	
	public static void main(String[] args) {
System.out.println("first line");
try {
	int a[]= new int[300];
	}
catch (Error e) {
	System.out.println(e);
}
System.out.println("lastline");
}
}