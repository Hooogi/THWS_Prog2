package lect_15;

public class Quizbogen {
    Quiz[] questions;

    public Quizbogen(Quiz[] questions){
        this.questions = questions;
    }

    public String generateQuizString(){
        String quizString ="";
        for(int i = 0; i< questions.length; i++){
            quizString += questions[i].createQuestionsString();
        }
        return quizString;
    }
}
