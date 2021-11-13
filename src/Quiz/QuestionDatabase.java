package Quiz;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionDatabase {

    public ArrayList<QuestionBuilder> questionsList() {

        ArrayList<QuestionBuilder> questionsList = new ArrayList<>();

        questionsList.add(new QuestionBuilder("Matematik",
                "Vad är summan av 1 + 1?",
                "2",
                "1",
                "5",
                "6"));
        questionsList.add(new QuestionBuilder("Matematik",
                "Vad är summan av 2 + 2?",
                "4",
                "1",
                "5",
                "52"));
        questionsList.add(new QuestionBuilder("Matematik",
                "Vad är produkten av 1 x 2?",
                "2",
                "3",
                "4",
                "5"));
        questionsList.add(new QuestionBuilder("Matematik",
                "Vad är kvoten av 2/2",
                "1",
                "2",
                "5",
                "4"));
        questionsList.add(new QuestionBuilder("Marvel-filmer",
                "Vilken av dessa titlar är INTE namnet på en Marvel-film?",
                "Avengers: Return of the Jedi",
                "Avengers: Age of Ultron",
                "Captain America: The first avenger.",
                "Avengers: Endgame"));
        questionsList.add(new QuestionBuilder("Marvel-filmer",
                "Vad heter skådespelaren som gestaltar Iron man?",
                "Robert Downey Junior",
                "Scarlett Johanson",
                "Paul Rudd",
                "Chris Hemsworth"));
        questionsList.add(new QuestionBuilder("Marvel-filmer",
                "Vad kallas Thors hammare?",
                "Mjolnir",
                "Jarvis",
                "Steve",
                "Gungnir"));
        questionsList.add(new QuestionBuilder("Marvel-filmer",
                "Hur många evighetsstenar behöver Thanos samla för att uppnå sitt mål?",
                "6",
                "5",
                "12",
                "8"));

        Collections.shuffle(questionsList);

        return questionsList;
    }
}
