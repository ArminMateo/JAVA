import java.util.Scanner;
import java.lang.Math;
public class Calculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);


		String mode;  // Calculator mode
		String operator = "";  // The math operator symbol 
		String userChoice = ""; // used to ask the user if they want to use the calculator again
		boolean pickYesOrNo = true; // Check to see if the user wants to continue the program
		double result = 0.0; // This holds the answer based on the calculations.
		int num = 0;


		do {

			///Choose the calculator mode ///

			System.out.println("Enter the calculator mode: Standard/Scientific?");
			mode = scnr.next();


			/// Standard Mode /// 

			if (mode.equalsIgnoreCase("Standard")) {

				System.out.println("The calculator will operate in standard mode.");

				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, "

                + "'/' for division");

				operator = scnr.next();


				/// Validate the operator ///

				while(!operator.equals("+") && !operator.equals("-")&& !operator.equals("*")&& !operator.equals("/")) {

					System.out.println("Invalid operator "+ operator);

					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, " 
							+ "'/' for division");

					operator = scnr.next();

				}


				/// ADDITION /// 

				if (operator.equals("+")) {

					System.out.println("How many numbers do you want to add?");

					result = 0;
					num = scnr.nextInt();
					System.out.println("Enter " + num + " numbers");
					for (int i = 0; i < num; i++) {
						double Number = scnr.nextDouble();

						result  = result + Number;  

					}

					System.out.println("Result: " + result);

				}


                   /// SUBTRACTION ///
				if (operator.equals("-")) {

					System.out.println("How many numbers do you want to subtract?");

					result = -1;
					num = scnr.nextInt();
					System.out.println("Enter " + num + " numbers");

					result = scnr.nextDouble();



					for (int i = 0; i < num-1; i++) {
						double Number = scnr.nextDouble();

						result  = result - Number;  

					}

					System.out.println("Result: " + result); 
				}



				///MULTIPLICATION////

				if (operator.equals("*")) {

					System.out.println("How many numbers do you want to multiply?");

					result = 1;
					num = scnr.nextInt();
					System.out.println("Enter " + num + " numbers");


					for (int i = 0; i < num; i++) {
						double Number = scnr.nextDouble();

						result  = result * Number;  
					}

					System.out.println("Result: " + result); 


				}



				///DIVISION///
				if (operator.equals("/")) {

					System.out.println("How many numbers do you want to divide?");

					result = -1;
					num = scnr.nextInt();
					System.out.println("Enter " + num + " numbers");

					result = scnr.nextDouble();



					for (int i = 0; i < num-1; i++) {
						double Number = scnr.nextDouble();

						result  = result / Number;  

					}

					System.out.println("Result: " + result); 

				}



			}        ///End of Standard///





			///Scientific Mode///

			else{

				System.out.println("The calculator will operate in scientific mode.");

				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, "
						+ "'/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");

				operator = scnr.next();

				/// Validate the operator ///

				while (!operator.equals("+") && !operator.equals("-")&& !operator.equals("*")&& !operator.equals("/") 
						&& !operator.equals("sin") && !operator.equals("cos") && !operator.equals("tan")) {

					System.out.println("Invalid operator " + operator);

					System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, "
							+ "'/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");

					operator = scnr.next();

				}

				//ADDITION/// 

				if (operator.equals("+")) {


					System.out.println("How many numbers do you want to add?");

					result = 0;
					num = scnr.nextInt();
					System.out.println("Enter " + num + " numbers");
					for (int i = 0; i < num; i++) {
						double Number = scnr.nextDouble();

						result  = result + Number;  

					}

					System.out.println("Result: " + result);

				}

				 /// SUBTRACTION ///

				if (operator.equals("-")) {

					System.out.println("How many numbers do you want to subtract?");

					result = -1;
					num = scnr.nextInt();
					System.out.println("Enter " + num + " numbers");

					result = scnr.nextDouble();



					for (int i = 0; i < num-1; i++) {
						double Number = scnr.nextDouble();

						result  = result - Number;  

					}

					System.out.println("Result: " + result); 
				}



				///MULTIPLICATION////

				if (operator.equals("*")) {
					result = 1;
					System.out.println("How many numbers do you want to multiply?");


					num = scnr.nextInt();
					System.out.println("Enter " + num + " numbers");


					for (int i = 0; i < num; i++) {
						double Number = scnr.nextDouble();

						result  = result * Number;  
					}

					System.out.println("Result: " + result); 


				}


				/// //DIVISION///
				if (operator.equals("/")) {

					System.out.println("How many numbers do you want to divide?");

					result = -1;
					num = scnr.nextInt();
					System.out.println("Enter " + num + " numbers");

					result = scnr.nextDouble();



					for (int i = 0; i < num-1; i++) {
						double Number = scnr.nextDouble();

						result  = result / Number;  

					}

					System.out.println("Result: " + result); 

				}



				/// SINE ///
				if (operator.equals("sin")) {

					System.out.println("Enter a number in radians to find the sine");

					double radian = scnr.nextDouble();


					result = Math.sin(radian);

					System.out.println("Result: " + result);
				}  



				/// COSINE ///

				if (operator.equals("cos")) {

					System.out.println("Enter a number in radians to find the cosine");

					double radian = scnr.nextDouble();


					result = Math.cos(radian);

					System.out.println("Result: " + result);

				}


				/// TANGENT ///

				if (operator.equals("tan")) {

					System.out.println("Enter a number in radians to find the tangent");

					double radian = scnr.nextDouble();


					result = Math.tan(radian);




					System.out.println("Result: " + result);
				}

			}  /// End of scientific mode /// 


			/// If the user wants to continue using the calculator (program) ///
			
			System.out.println("Do you want to start over? (Y/N)");
			userChoice =  scnr.next();

			if(userChoice.equalsIgnoreCase("Y"))
			{
				pickYesOrNo = true;
			}
			else
			{
				if(userChoice.equalsIgnoreCase("N"))
					pickYesOrNo = false;}	
		}

		while(pickYesOrNo);

		System.out.println("Goodbye");

		scnr.close();
	}
}
