package com.AlohaGroup.Aloha.question;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter @Setter @NoArgsConstructor
public class Question {
    private String id;
    private String content;
    private List<String> answers;
    private int correctAns;

    public Question(String id, String content, List<String> answers, int correctAns) {
        this.id = id;
        this.content = content;
        this.answers = answers;
        this.correctAns = correctAns;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", answers=" + answers +
                ", correctAns=" + correctAns +
                '}';
    }
}
