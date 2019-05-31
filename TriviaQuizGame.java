import java.util.Scanner;

public class TriviaQuizGame {

	public static void main(String [] args) {
		
	String q1 = "Question 1:\n\nWho was the fifth president?\n"
	          +"(a)James Madison\n(b)James Monroe\n(c)John Quincy Adams\n(d)Andrew Jackson";
	
	String q2 = "\nQuestion 2:\n\nWhat year did humans first land on the moon?\n"
			  +"(a)1969\n(b)1970\n(c)1961\n(d)1968";
	
	
	String q3 = "\nQuestion 3:\n\nHow many World Series have been played?\n"
			  +"(a)50\n(b)83\n(c)114\n(d)102";
	
	String q4 = "\nQuestion 4:\n\nWho wrote the National Anthem?\n"
			  +"(a)Francis Scott Key\n(b)Benjamin Franklin\n(c)George Washington\n(d)Mark Twain";
	
	String q5 = "\nQuestion 5:\n\nTrue of False: William Henry Harrison held office for only a month\n"
			  +"(a)True\n(b)False";
	
	String q6 = "\nQuestion 6:\n\nWhat are the first ten amendments called?\n"
			  +"(a)The Declaration of Independence\n(b)The Articles of confederation\n(c)The Federalist Papers\n(d)The Bill of Rights";
	
	String q7 = "\nQuestion 7:\n\nHow many periods are played in hockey?\n"
			  +"(a)4\n(b)3\n(c)8\n(d)infinite";
	
	String q8 = "\nQuestion 8:\n\nWhich artist has won the most Grammy Awards?\n"
			  + "(a)U2\n(b)Beyonce\n(c)Michael Jackson\n(d)Georg Solti";
	
	String q9 = "\nQuestion 9:\n\nAs of 2017, what is the highest grossing film of all time?\n"
			  + "(a)Titanic\n(b)Avatar\n(c)The Force Awakens\n(d)Jurassic World";
	
	String q10 = "\nQuestion 10:\n\nTrue or False: The Patriots have more Superbowl wins than everyone else\n"
			   + "(a)True\n(b)False";
	
	String q11 ="\nQuestion 11:\n\nWho plays John Wick in the critically acclaimed film triliogy of John Wick?\n"
			   +"(a)Vin Diesel\n(b)Tom Cruise\n(c)Keanu Reeves\n(d)Abraham Lincoln";
	
	String q12 ="\nQuestion 12:\n\nHow many representatives are there in the United States House of Representatives?\n"
			   +"(a)435\n(b)100\n(c)200\n(d)535";
	
	String q13 ="\nQuestion 13:\n\nWho is the villian or bad guy in Friday the 13th?\n"
			   +"(a)Freddy Krueger\n(b)Jason Vorhees\n(c)Michael Myers\n(d)Leatherface";
	
	String q14 ="\nQuestion 14:\n\nWho was the 26th president?\n"
			   +"(a)Benjamin Harisson\n(b)James Garfield\n(c)Theodore Roosevlet\n(d)Franklin Delano Rooselvelt";
	
   String q15 ="\nQuestion 15:\n\nWhat city is dubbbed the Motor City?\n"
   		      +"(a)Alambama\n(b)Bel Air\n(c)Chicago\n(d)Detroit";
   
   String q16 ="\nQuestion 16:\n\nHow many countries are in the United Nations?\n"
		      +"(a)193\n(b)147\n(c)25\n(d)8";
   
   String q17 ="\nQuestion 17:\n\nWho signed the Louisiana Purchase?\n"
		      +"(a)Barack Obama\n(b)Thomas Jefferson\n(c)Donald Trump\n(d)John Wick";
	
   String q18 ="\nQuestion 18:\n\nHow many NBA Finals have the Chicago Bulls won?\n"
		      +"(a)0\n(b)10\n(c)6\n(d)3";
   
   String q19 ="\nQuestion 19:\n\nWhat is richest company in the world?\n"
		      +"(a)Microsoft\n(b)AT&T\n(c)Walmart\n(d)Sony";
   
   String q20 ="\nQuestion 20:\n\nWhat is the area code of Detroit, MI?\n"
		      +"(a)305\n(b)207\n(c)450\n(d)313";
		   
   String q21 ="\nQuestion 21:\n\nWhat is the area code of Minneapolis, MN?\n"
		      +"(a)612\n(b)305\n(c)952\n(d)651";
	
	Question [] questions = {
			new Question(q1, "b"),
            new Question(q2, "a"),
            new Question(q3, "c"),
            new Question(q4, "a"),
            new Question(q5, "a"),
            new Question(q6, "d"),
            new Question(q7, "b"),
            new Question(q8, "d"),
            new Question(q9, "b"),
            new Question(q10, "b"),
            new Question(q11, "c"),
            new Question(q12, "a"),
            new Question(q13, "b"),
            new Question(q14, "d"),
            new Question(q15, "d"),
            new Question(q16, "a"),
            new Question(q17, "b"),
            new Question(q18, "c"),
            new Question(q19, "c"),
            new Question(q20, "d"),
            new Question(q21, "a")
	};

			takeQuiz(questions);
			
			
	}	

	
	public static void takeQuiz(Question [] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		for(int i =0; i<questions.length; i++) {
	      System.out.println(questions[i].question);
	      String answer = keyboardInput.nextLine();
	      if(answer.equals(questions[i].answer)) {
	    	score++;
	    }
		}
		
    System.out.println("Score:" + score + "/" + questions.length);
    System.out.println("\nAnswers:\n\n1)\n2)\n3)\n4)\n5)\n6)\n7)\n8)\n9)\n10)\n11)\n12)\n13)\n14)\n15)\n16)\n17)\n18)\n19)\n20)\n21)");
	}
    public static void celebrateScore(int n, int score) {
    	int n1 = score;
    	
    	if(n1>=5) {
    	System.out.println("Very nice job");
    	
    	}else {
    		
    	}
    	if(n1<5) {
        System.out.println("Better luck next time");
    		
    

	}
}}

    
  




