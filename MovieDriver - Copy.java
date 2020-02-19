import java.util.Scanner;

public class MovieDriver {
	
	public static void main (String [] agrs) {
		Scanner input = new Scanner (System.in);
		
	//Variables 	
		final String var1= "y";
		final String var2= "n";
		int movieSales;
		String leaving;
		String movieName;
		String movieRating;
		boolean exit1=false;
		boolean exit2=false;
		
	// Loop for performing as many instances of a Constructing a movie as the user wants 	
	do {
		//Resetting 'would you like to enter a new movie'
		exit1=false;
		
	//input for Movie name	
	System.out.println("Enter the name of the Movie:");
	movieName= input.nextLine();
	
	
	//input for movie rating
	System.out.println("Enter the rating of the movie: \n \'e\' \n \'pg13\' \n \'r\'");
	movieRating= input.nextLine();
	
	//input for tickets sold;
	System.out.println("Enter the number of ticket sales");
	movieSales = input.nextInt();
	//Fixing skip error when jumping from nextLine to nextINT 
	leaving = input.nextLine();
	//Creating instance of a Moive
	Movie movieStats= new Movie(movieName,movieRating,movieSales);
	
	//Printing out movies information
	System.out.println(movieStats.toString());
	
	//Loop for asking user if they want to create a new instance of a Movie
		do {
			System.out.println("Would you like to enter a new movie?  \n Enter \'y\' for yes \n Enter \'n\' for no");
			leaving =input.nextLine();
			leaving.toLowerCase();
	
			if(leaving.equals(var2)) {
				exit1=true;
				exit2=true;
			}
			else if(leaving.equals(var1)){
				System.out.println("Now resetting Program: \n \n ");
				exit1=true;
			}
			else {
				System.out.println("INVALID INPUT");
			}
		}while (exit1==false );
	
	}while(exit2==false);
	
	System.out.println("Program now ending.\n \nCreator: Carlos Gutierrez\nLab:3");
	
	
		
	}

}
