package com.hamsempire.jackpotpredictions;

/**
 * Created by Hansen on 23-Jun-17.
 */

public class Model {
    private String title;
    private String body;
    private Long time;



    public Model() {
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Model(String title, String body, Long time) {
        this.title = title;
        this.body = body;
        this.time = time;
    }
}
