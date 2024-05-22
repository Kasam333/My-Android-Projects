package com.example.baytalmal.model;

import java.util.ArrayList;
import java.util.List;

public class Chapters {
    String chaptername;
    List<Topics>topicsList=new ArrayList<>();

    public Chapters(String chaptername, List<Topics> topicsList) {
        this.chaptername = chaptername;
        this.topicsList = topicsList;
    }

    public String getChaptername() {
        return chaptername;
    }

    public List<Topics> getTopicsList() {
        return topicsList;
    }
}
