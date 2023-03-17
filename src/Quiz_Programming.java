import java.util.Scanner;
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
            System.out.println("Enter first Passowrd:");
            String firstPassword = userInput1.nextLine();
            
            System.out.println("Enter last Passowrd:");
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
        String UserInputting4 = String.valueOf(userInput2.nextLine());
        if(UserInputting4.equals("C")) {
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
        String UserInputting5 =  String.valueOf(userInput2.nextLine());
        if(UserInputting5.equals("B")) {
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
        if(UserInputting6.equals("A")){
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
        if(UserInputting7.equals("C")) {
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
        if(UserInputting8.equals("D")){
            gamePoints = gamePoints+50;
            System.out.println("Correct!");
            System.out.println("Points:" + " " + gamePoints + "pts");
            
        }else {
             gamePoints = gamePoints-50;
            System.out.println("Wrong!");
            System.out.println("Points:" + " " + gamePoints + "pts");
        }
        
        String[]array1 = {userInputting1, userInputting2};
        int array2[] = {gamePoints};
        arrayOfNumbers(array2);
        
        gradeCalculation(gamePoints);
        userInput.add("Name");
        userInput.add(userInputting1); 
        
        tableNumber(userInput);
        
    }
    
	public static void gradeCalculation(int number) {
        double calculation = (((double)number+number+number+number+number)/5);
        System.out.println("Total Points: " + calculation);
        if (calculation > 300.0 && calculation <=400.0) {
            System.out.println(calculation+ ":" + "Grade:" + " A");
        }
        else if(calculation > 250 && calculation <=300) {
            System.out.println(calculation+ ":" + "Grade:" + " B");
        }
        else if(calculation >150 && calculation <=250) {
            System.out.println(calculation+ ":" + "Grade:" + " C");
        }
        else if(calculation > 50 && calculation <=150) {
            System.out.println(calculation+ ":" + "Grade:" + " D");
            
        }
        else if(calculation < 50) {
            System.out.println(calculation+ ":" + "Grade:" + " F");
        }
        
    }
    public static void tableNumber(ArrayList<String> list) { 			
    	for(String userInput : list) {
    	System.out.println(userInput);    
    }
    	boolean matched = list.contains(list.get(list.size()-1));
    	if (matched) {
    		System.out.println(list.get(1));
    	}
    	else {
    		System.out.println("Not Matched");
    	}
    }
    public static int arrayOfNumbers(int[]numbers) {
    	return 0;
    }
}