package lect_15;

public class MultipleChoice extends Quiz{
    String[] possibleAnswers;

    public String createQuestionsString(){
        String question = "";
        question += this.question +"\n";
        for(int i =0; i<possibleAnswers.length; i++){
            question += i+") "+ possibleAnswers[i] + "\n";
        }
        return question;
    }
}
