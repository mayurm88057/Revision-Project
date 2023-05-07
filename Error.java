package Exception;

public class Error {

	public static void main(String[] args) {
System.out.println("first line");
try {
    int a[]=new int[1000];
}
catch(Error e){
	System.out.println(e);
}
System.out.println("lastline");
}}