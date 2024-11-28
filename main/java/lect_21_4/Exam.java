package lect_21_4;

import java.io.*;
import java.util.ArrayList;

public class Exam {

    ArrayList<Question> questions = new ArrayList<>();

    String readHeaderFromFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("questions.csv"))){
            return br.readLine();
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public Exam readQuestions() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("questions.csv"))) {
            br.readLine();
            do{
                String line = br.readLine();
                if(line == null) break;
                questions.add(Question.toQuestion(line));
            }
            while(true);
        }
        return this;
    }

    public void toTest() throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("test.tex"))){
            bw.write(readHeaderFromFile());
            bw.newLine();
            for(Question question : questions){
                bw.write("\\textbf{"+question.text+"}\\\\");
                bw.newLine();
            }
            bw.write("\\end{document}");
        }
    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        try{
            exam.readQuestions().toTest();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


}
