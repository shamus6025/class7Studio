package Main;

public class TakeQuiz {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultiChoiceQuestion = new MultipleChoiceQuestion("What is the square root of 81?" +
                "\nA: 420\nB: 9\nC: 69\nPlease just type a single letter as an answer", "B");
        myQuiz.addQuestion(myMultiChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select following towns that are in New Jersey:\nA: Trenton\nB: Toronto\nC: Cape May", "A, C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("The Mets are going to win the World Series This Year?  \n True or False?", "True");
        myQuiz.addQuestion(myTrueFalseQuestion );


        myQuiz.runQuiz();
    }
}
