import java.util.Scanner;

/**
 * This program calculates the area for three basic shapes. Rectangles,
 * Triangles, and Circles.
 * 
 * @author Jonah Olson
 * 
 * @version 04-07-2020
 *
 */

public class Geometry {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		displayMenu();
		System.out.print("Enter your choice (1-3): ");
		int userChoice = in.nextInt();
		while (userChoice < 1 || userChoice > 3) {
			System.out.print("Invalid choice. Enter choice (1-3): ");
			userChoice = in.nextInt();
		}
		selectOption(userChoice);
	}

	/**
	 * This method calculates the area of a circle based on user input and returns a
	 * value
	 * 
	 * @return Area for the circle
	 */
	public static double circle() {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the circle's radius? " + "");
		double radius = in.nextDouble();
		double area = (Math.PI * Math.pow(radius, 2));
		return area;
	}

	/**
	 * This method calculates the area of any rectangle and returns a value
	 * 
	 * @return Area for the rectangle
	 */

	public static double rectangle() {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the rectangle's length? ");
		double length = in.nextDouble();
		System.out.print("What is the rectangle's width? ");
		double width = in.nextDouble();
		double area = (length * width);
		return area;
	}

	/**
	 * This method calculates the area of any triangle and returns a value
	 * 
	 * @return Area for the triangle
	 */
	public static double triangle() {
		Scanner in = new Scanner(System.in);
		System.out.print("what is the length of the triangle's base? ");
		double baseLength = in.nextDouble();
		System.out.print("What is the triangle's height? ");
		double triangleHeight = in.nextDouble();
		double area = ((triangleHeight * baseLength) / 2);
		return area;
	}

	/**
	 * This method does not return a value but displays output based on the
	 * parameter and instructions
	 * 
	 * @param area for the specific shape
	 */
	public static void printArea(double area) {
		System.out.printf("The area is %.2f%n", area);
		System.out.println();
		System.out.print("Thank you for using the Geometry Calculator - Goodbye!");

	}

	/**
	 * This method does not return any values but it does validate the user choice
	 * to align with one of the methods for the shapes
	 * 
	 * @param userChoice
	 */
	public static void selectOption(int userChoice) {
		if (userChoice == 1) {
			double areaOfCircle = circle();
			printArea(areaOfCircle);
		} else if (userChoice == 2) {
			double areaOfRectangle = rectangle();
			printArea(areaOfRectangle);
		} else if (userChoice == 3) {
			double areaOfTriangle = triangle();
			printArea(areaOfTriangle);
		}

	}

	/**
	 * The method displays the main menu allowing the user to evaluate their options
	 * and choose accordingly
	 */
	public static void displayMenu() {
		System.out.println("Welcome to the Geometry Caluclator Application");
		System.out.println();
		System.out.println("1. Calculate the area of a Circle");
		System.out.println("2. Calculate the area of a Rectangle");
		System.out.println("3. Calculate the area of a Triangle");
	}
}
