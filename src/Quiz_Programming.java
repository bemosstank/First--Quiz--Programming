import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Quiz_Programming {

	// Start of the program
	public static void main(String[] args) {
		Scanner userInput1 = new Scanner (System.in);
		Scanner userInput2 = new Scanner(System.in);
		ArrayList<Integer> List = new ArrayList<>();
		ArrayList<String> userInput = new ArrayList<>();



		int gamePoints=150;




		System.out.println("You will get 150 points in the beginning");
		System.out.println( "Points:" + " " + gamePoints + " pts");


		System.out.println("Enter your First Name:");


		String userInputting1 = userInput1.nextLine();


		System.out.println( "First name:" + " " + userInputting1);


		System.out.println("Enter your Last Name:");


		String userInputting2 = userInput1.nextLine();


		System.out.println("Last name:" + " " + userInputting2);

		while(true) {
			System.out.println("Enter First Passowrd:");
			String firstPassword = userInput1.nextLine();

			System.out.println("Enter Last Passowrd:");
			String secondPassowrd = userInput1.nextLine();

			if(firstPassword.equals(secondPassowrd)) {
				System.out.println("Match Password");
				break;
			}
			else {
				System.out.println("Try Again");
				continue;
			}
		}

		System.out.println("In order to play this football Question, you need to be at a age betweeen 18 to 25");
		System.out.println("Enter your Age:");

		int userInputting3 = userInput1.nextInt();



		System.out.println("This is your Age:" + " " + userInputting3); 

		if (userInputting3 >=18 && userInputting3 <=25) {
			System.out.println("Welcome to My first Football Question");
		}
		else { 
			System.out.println(" You can't play the Quiz");
			System.exit(0);
		}
		System.out.println("In year did Lionel Messi won his seven Ballon D'or ?");
		System.out.println("A " + "2017");
		System.out.println("B " + "2018");
		System.out.println("C " +  "2019");
		System.out.println("D " + "2014");
		String userInputting4 = String.valueOf(userInput2.nextLine());
		if(userInputting4.equals("C") || userInputting4.equals("c") ) {
			gamePoints = gamePoints +50;
			System.out.println("Correct!");
			System.out.println("Points:" + " " + gamePoints  + "pts");

		} else {
			gamePoints = gamePoints-50;
			System.out.println("Wrong!");
			System.out.println("Points:" + " " + gamePoints + "pts");
		}
		System.out.println("Where is Cristiano Ronaldo From?");
		System.out.println("A " + "Argentina");
		System.out.println("B " + "Portugal");
		System.out.println("C " + "Uruguay");
		System.out.println("D " + "Spain");
		String userInputting5 =  String.valueOf(userInput2.nextLine());
		if(userInputting5.equals("B") || userInputting5.equals("b")) {
			gamePoints = gamePoints + 50;
			System.out.println("Correct!");
			System.out.println("Points:" + " " + gamePoints + "pts");
		}else {
			gamePoints= gamePoints-50;
			System.out.println("Wrong!");
			System.out.println("Points:" + " " + gamePoints + "pts");
		}
		System.out.println("When year did Casemiro Joined Man United?");
		System.out.println("A " + "2022");
		System.out.println("B " + "2018");
		System.out.println("C " + "2023");
		System.out.println("D " + "2019");
		String UserInputting6 =  String.valueOf(userInput2.nextLine());
		if(UserInputting6.equals("A") || UserInputting6.equals("a")){
			gamePoints = gamePoints+50;
			System.out.println("Correct!");
			System.out.println("Points:" + " " + gamePoints + "pts");
		}
		else {
			gamePoints = gamePoints-50;
			System.out.println("Wrong!");
			System.out.println("Points:" + " " + gamePoints + "pts");
		}

		System.out.println("When Did Jürgen Klopp joined Liverpool?");
		System.out.println("A " + "2017");
		System.out.println("B " + "2019");
		System.out.println("C " + "2015");
		System.out.println("D " + "2020");
		String UserInputting7 =  String.valueOf(userInput2.nextLine());
		if(UserInputting7.equals("C") || UserInputting7.equals("c") ) {
			gamePoints = gamePoints+50;
			System.out.println("Correct!");
			System.out.println("Points:" + " " + gamePoints + "pts");
		}
		else {
			gamePoints= gamePoints-50;
			System.out.println("Wrong!");
			System.out.println("Points:" + " " + gamePoints+ "pts");
		}

		System.out.println("How many Ballon D'or does Cristiano Ronaldo");
		System.out.println("A " + "8");
		System.out.println("B " + "4");
		System.out.println("C " + "7");
		System.out.println("D " + "5");
		String UserInputting8 = String.valueOf(userInput2.nextLine());
		if(UserInputting8.equals("D") || UserInputting8.equals("d")){
			gamePoints = gamePoints+50;
			System.out.println("Correct!");
			System.out.println("Points:" + " " + gamePoints + "pts");

		}else {
			gamePoints = gamePoints-50;
			System.out.println("Wrong!");
			System.out.println("Points:" + " " + gamePoints + "pts");
		}


		String word1 = "Good Job,";
		String [] text1 = word1.split(",");


		String word2 = "Almost There";
		String[] text2 = word2.split(",");

		String word3 = "You need to try harder";
		String [] text3 = word3.split(" ");


		int [] array1 = {gamePoints};

		Grade( array1, text1, text2, text3 );


		gradeCalculation(gamePoints);   
		userInput.add("Name:" );
		userInput.add(userInputting1);
		userInput.add(userInputting2);

		List.add(gamePoints);


		tableNumber(userInput, gamePoints);

	}	

	private static void gradeCalculation(int number) {
		double calculation = (((double)number+number+number+number+number)/5);
		System.out.println("Total Points: " + calculation +" "+ "pts");
		if (calculation > 300.0 && calculation <=400.0) {
			System.out.println("Grade:" + " A");
		}
		else if(calculation > 250 && calculation <=300) {
			System.out.println("Grade:" + " B");
		}
		else if(calculation >150 && calculation <=250) {
			System.out.println("Grade:" + " C");
		}
		else if(calculation > 50 && calculation <=150) {
			System.out.println("Grade:" + " D");

		}
		else if(calculation < 50) {
			System.out.println("Grade:" + " F");
		}

	}
	public static void tableNumber(ArrayList<String>List, int number) {
		boolean getBothArrayList = List.contains(List.get(2));
		if(getBothArrayList) {
			System.out.print(List.get(1)+ List.get(2) +":" + " " + number);
		}else {
			System.out.println("Not Matched");
		}  	 
	}

	public static void Grade(int [] array1, String [] text1, String [] text2, String[] text3 ) {
		ArrayList<String> list = new ArrayList<>();


		String row;

		int fileConvertedToNumber1 = 0;
		int fileConvertedToNumber2 =0;
		int fileConvertedToNumber3 =0;

		try(Scanner fileScan = new Scanner(Paths.get("data.txt"))){
			while(fileScan.hasNextLine()) {
				row = fileScan.nextLine();

				list.add(row);

				fileConvertedToNumber1 = Integer.valueOf(list.get(0));
				fileConvertedToNumber2 = Integer.valueOf(list.get(1));
				fileConvertedToNumber3 = Integer.valueOf(list.get(2));

			}

		}catch(IOException exe) {
			System.out.println("Error " + exe.getMessage());

		}
		if(array1[0] > 300 && array1[0] <= 400) {

			System.out.println("Points: " + array1[0]+ " " + text1[0] + fileConvertedToNumber1);

		}if(array1[0] > 250 && array1[0] <= 400) {
			System.out.println("Points: " + array1[0]+  " "+  text1[0] + fileConvertedToNumber2);

		}if(array1[0] > 150 && array1[0] <= 250) {
			System.out.println("Points: " + array1[0] + " " + text1[0] + fileConvertedToNumber2);   

		}   
	}
}