# finalproject 
# Project Title and purpose

TriviaQuizGame

TrivaQuizGame is a game that I made using eclipse. The purpose of the game is simple: to have the user take a multiple choice quiz on trivia that they may or may not know. The quiz contains twenty one questions, and once the user has finished the quiz their score out of twenty one is displayed. There is an answer key at the bottom of the page when the game runs, and a message is displayed for when the user's score is greater than seventy percent, and another message is displayed if the score is below seventy percent.

### Difficulties or opportunities you encountered along the way.

The toughest part was making it so the user could actually have input for the questions. In Processing there was a keyPressed method that could be used for user input but I wasn't able to figure that out. Instead, I went to Eclipse to use the scanner class because the scanner class couldn't be used in Processing. Being able to use the scanner class in Eclipse was a lot easier for me, and in the end I was able to figure it out so that the user could actually answer the questions.

### Most interesting piece of your code and explanation for what it does.

public static void takeQuiz(Question [] questions) {
		int score = 0;
		
		Scanner KeyboardInput = new Scanner(System.in);
		for(int i =0; i<questions.length; i++) {
	      System.out.println(questions[i].question);
	      String answer = KeyboardInput.nextLine();
	      if(answer.equals(questions[i].answer)) {
	    	score++;
	    }
		}
		
 This is the code that actually lets the user answer the questions. It starts out with the variable "score". There is scanner system used for keyboard input so that the person taking the quiz can answer the quesions. Then it runs through the array "questions" and prints them. As the user answers the questions, the program compares the input to the answers that were coded, and after everything has been answered the program counts up the score. In some lines of code not displayed above, the the total score is printed along with answer key.     
      
## Built With

* [Eclipse](https://www.eclipse.org/) - The IDE used

## Authors

* **Eclipse Foundation** 

## Acknowledgments

* 𝓣𝓱𝓮 Thomas Reinartz, Mr. Erik Berg, Mike Dane from Giraffe Academy on Youtube(for help with setting up the arrays and scanner) 

