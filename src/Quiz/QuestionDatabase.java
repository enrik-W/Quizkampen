package Quiz;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionDatabase {
    private ArrayList<QuestionBuilder> questionsList = new ArrayList<>();

    public QuestionDatabase() {
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
        questionsList.add(new QuestionBuilder("Kampsport",
                "Från vilket land kommer kampsporten Karate?",
                "Japan",
                "Kina",
                "Thailand",
                "Korea"));
        questionsList.add(new QuestionBuilder("Kampsport",
                "Vad betyder Taekwondo?",
                "Foten och handens väg",
                "Tom hand",
                "Sparken och slagets väg",
                "Den mjuka vägen"));
        questionsList.add(new QuestionBuilder("Kampsport",
                "Vad var Bruce Lees riktiga namn?",
                "Jun Fan Lee",
                "Jet Lee",
                "Jackie Chan",
                "Donnie Yen"));
        questionsList.add(new QuestionBuilder("Kampsport,",
                "Vilket alternativ är inte ett vapen som används inom kampsport?",
                "Taebo",
                "Nunchaku",
                "Bo",
                "Sai"));

       // Collections.shuffle(questionsList);
    }

    public ArrayList<QuestionBuilder> getQuestionsList() {
        return questionsList;
    }

    public QuestionBuilder getQuestion(int index) {
        return questionsList.get(index);
    }
}
