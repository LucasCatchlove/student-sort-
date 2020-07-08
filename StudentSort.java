/* 
 --------------------------------------------------------
  Assignment 1
  Written by: Lucas Catchlove id: 27145640
  For COMP 248 Section EE – Fall 2016

  ~Student Sort v1.0~

  This program asks the user how many international, 
  in-province, and out-of-province students there are in
  a given class, and then calculates and dispays the total 
  amount of students in the class as well as the percentage 
  (and decimal value) of each type of student there are
  in the class.
  
 --------------------------------------------------------
 */

/* Import statements allow the programmer to make
 use of classes that arent included in the standard packages (i.e. java.lang) */



import java.util.Scanner;
import java.text.DecimalFormat;




public class StudentSort { // Begins the class definition block for the "StudentSort" application.


	public static void main(String[] args) { // Begins the definition of the main method.

		System.out.println("------------------------------\n" + "      Student Sort v1.0\n"				// Welcome message :)
															  + "------------------------------\n");



		DecimalFormat df = new DecimalFormat("#.##"); // The "DecimalFormat" formats decimal numbers.
		Scanner reader = new Scanner(System.in);  // 
		double OutofProv, International, InProv, ClassPop; // Declaring varibles.
		
		 
		// This section prompts the user to enter information about the students in the class.

		System.out.print("How many in-province students are there: ");
		InProv = reader.nextInt();
		System.out.print("How many out-of-province students are there: ");
		OutofProv = reader.nextInt();
		System.out.print("How many international students are there: ");
		International = reader.nextInt();
	

		ClassPop = OutofProv + International + InProv; // calculates total amount of students in the class.

		// Initializng variables that store and calculate information about each type of student.

		double InprovPercent = InProv * 100 / ClassPop;
		double OutofProvPercent = OutofProv * 100 / ClassPop;
		double InternationalPercent = International * 100 / ClassPop;




		// Prints the number of students in the class.

		System.out.println("There are " + ClassPop + " students in the class.\n");

		// Displays the percentages and decimal figures of each type of student in the class
		// the "df.format()" method trims the decimal figures.

		
		System.out.println("In-province students: " + InProv / ClassPop + " ,or ~" + df.format(InprovPercent) + " %\n");
		System.out.println("out-of-province students: " + OutofProv / ClassPop + " ,or ~" + df.format(OutofProvPercent) + " %\n");
		System.out.println("International students: " + International / ClassPop + " ,or ~" + df.format(InternationalPercent) + " %\n");



		System.out.println("Thanks for using Student Sort v1.0!\n"); //Prints farewell message.





	}
}