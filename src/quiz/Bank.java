package quiz;

public class Bank {
    public void begin(){

        String[] question = {
                "Выберите наиболее подходящий ответ! “What does your husband do?",
                "Yesterday I ................. a bird.",
                "Найдите неправильный глагол: to play, to smile, to laugh, to see.",
                "Укажите существительное, имеющее неправильную форму множественного числа.",
                "Найдите ошибку в трёх формах глагола:",
                "Выберите наиболее подходящий ответ! “What is she doing?”",
                "Karina never minds ................. the movie again.",
                "Можно мне взять Ваш карандаш?",
                "Марта никогда не слышала, как он говорит по-английски.",
                "Я знаю его четыре года."
        };
        String[] var1 = {
                "He is feeding the dog",
                "saw",
                "to play",
                "lady",
                "teach..taught..taught",
                "She is playing with the bunny",
                "to watch",
                "Can I take your pencil?",
                "Martha never heard him spoke English",
                "I know him four years"
        };
        String[] var2 = {
                "He is a doctor",
                "sawed",
                "to smile",
                "gentleman",
                "catch..caught..caught",
                "She is a manager",
                "to be watched",
                "Must I take your pencil?",
                "Martha never heard him to speak English",
                "I have been knowing him for four years"
        };
        String[] var3 = {
                "Yes, he does",
                "see",
                "to laugh",
                "son",
                "bring..braught..braught",
                "She cleans the house every day",
                "watch",
                "Should I take your pencil?",
                "Martha has never heard him speak English",
                "I know him for four years"
        };
        String[] var4 = {
                "Yes, he is",
                "seed",
                "to see",
                "daughter",
                "seek..sought..sought",
                "She is clean the carpet",
                "watching",
                "May I take your pencil?",
                "Martha never heard how he speaks English",
                "I have known him for four years"
        };
        String[] right = {
                "He is a doctor",
                "saw",
                "to see",
                "gentleman",
                "bring..braught..braught",
                "She is playing with the bunny",
                "watching",
                "May I take your pencil?",
                "Martha has never heard him speak English",
                "I have known him for four years"
        };

        Quiz a = new Quiz();
        a.run(question,var1,var2,var3,var4,right);
    }
}
