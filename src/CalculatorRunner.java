//import java.util.Math;
import java.util.Scanner;
public class CalculatorRunner {

	public static void main(String[] args) {
	
		double firstNum;
		double secondNum;
		String operation;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("First Number: ");
		firstNum= scan.nextDouble();
		
		System.out.println("Operation: ");
		Scanner op = new Scanner(System.in);
		operation = op.nextLine();
		
		System.out.println("Second Number: ");
		secondNum = scan.nextDouble();
	
		System.out.println(addition(firstNum, secondNum));
//		multiplication(firstNum,secondNum);
		
		
		
		if(operation.equals("*")) {
			System.out.println(multiplication(firstNum, secondNum));
		}
		else if(operation.equals("+")) {
			System.out.println(addition(firstNum, secondNum));
		}
		else if(operation.equals("-")) {
			System.out.println(subtraction(firstNum, secondNum));
		}
		else if(operation.equals("/")) {
			System.out.println(division(firstNum, secondNum));
		}
		
		else if(operation.equals("%")) {
			System.out.println(modulus(firstNum, secondNum));
		}
		else if(operation.equals("^")) {
			System.out.println(power(firstNum, secondNum));
		}
		else {
			System.out.println("Incorrect arithemetic operation");
		}
		
		
	}


	public static double addition(double first, double second) {
		return first + second;
	}

	public static double multiplication(double first, double second) {
		return first * second;
	}
	
	public static double division(double first, double second) {
		return first/ second;
	}
	
	public static double subtraction(double first, double second) {
		return first - second;
	}
	
	public static double modulus(double first, double second) {
		return first % second;
	}
	
	public static double power(double first, double second) {
		return Math.pow(first, second);
	}
}
