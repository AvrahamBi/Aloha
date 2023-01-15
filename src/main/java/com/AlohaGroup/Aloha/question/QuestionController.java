package com.AlohaGroup.Aloha.question;

import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/questions")
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }

/*    @GetMapping
    public List<Question> getQuestions(){
        List<Question> a  = this.questionService.getQuestions();

        return a;
    }*/

    @GetMapping
    public List<Question> getQuestions(){
        //Faker faker = new Faker();
        String id = "12546"; //faker.idNumber().valid();
        String content = "dfkjgnttn"; //faker.familyGuy().quote();
        List<String> answers = List.of("Yes", "No");
        Question q  = new Question(id, content, answers, 1);
        return List.of(q);
    }



}
