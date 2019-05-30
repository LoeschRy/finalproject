public class TriviaQuizGame{
  
  
  String q1 = "Who was the fifth president?\n"
              +"(a)John Quincy Adams\n(b)William Henry Harrison\n(c)James Monroe\n(d)James Madison";
  
  String q2 = "Who has the most Stanley Cup titles?\n"
              +"(a)Montreal Canadiens\n(b)Toronto Maple Leafs\n(c)Detroit Red Wings\n(d)New York Rangers";
             
  String q3 = "What country has the largest population?\n"
              +"(a)India\n(b)China\n(c)USA\n(d)Brazil";
              
  String q4 = "What is the largest country in the world?\n"
              +"(a)Russia\n(b)Canada\n(c)Brazil\n
              
              
              
  Question[] question ={
    
    new Question(q1, "a"){
    
    }
  }



ArrayList<String> myList=new ArrayList<String>();
String typed="";
String s;
int count;
void setup(){
  size(900, 600);
}

  void draw(){
  background(0);
  text("Type in your data:", 100, 35, 160);
  text(typed, 100, 50, 150);
}

void keyPressed(){
  typed+=key;
  if(key==RETURN||key==ENTER){
    println("it works!");
    s=typed;
    typed="";
  }else if(key==BACKSPACE){
    typed="";
  }
  println(s);
}

public static void takeQuiz(Question [] questions){
   int score = 0;
   
   for(int i =0;i<questions.length;i++){
   System.out.println(questions[i].question);
   if(answer.equals(questions[i].answer)){
     score ++;
    }
 }
 System.out.println("Score:" + score + "/" + question.length);

    }
