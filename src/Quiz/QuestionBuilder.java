package Quiz;

import java.util.ArrayList;

public class QuestionBuilder {
    private String category;
    private String question;
    private String correctAnswer;
    private String answer1;
    private String answer2;
    private String answer3;

    public String getCategory() {
         return category;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

        public QuestionBuilder(String category, String question, String correctAnswer, String answer1, String answer2, String answer3) {
        this.category = category;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }
}
