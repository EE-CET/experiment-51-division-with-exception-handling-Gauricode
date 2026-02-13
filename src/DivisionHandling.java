import java.util.Scanner;

public class DivisionHandling {
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	try{
		System.out.println(n1/n2);
	}
	catch(ArithmeticException e){
		System.out.println("Divide by zero error");
	}
        // TODO: Read two integers a and b
        
        // TODO: Enclose the division in a try block
        
        // TODO: Catch ArithmeticException
       } 
}
