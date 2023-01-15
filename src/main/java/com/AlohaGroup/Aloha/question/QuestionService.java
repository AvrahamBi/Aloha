package com.AlohaGroup.Aloha.question;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    public QuestionService() {

    }

    public List<Question> getQuestions(){
        Faker faker = new Faker();
        String id = faker.idNumber().valid();
        String content = faker.familyGuy().quote();
        List<String> answers = List.of("Yes", "No");

        return List.of(new Question(id, content, answers, 1));
    } // todo I can send strings but not Question, got 500 error code
}
