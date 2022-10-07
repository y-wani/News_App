package com.example.newsfinal;

import java.util.ArrayList;

public class mainNews {
    private String status;
    private String totalResults;
    private ArrayList<Modelclass> articles;

    public mainNews(String status, String totalResults, ArrayList<Modelclass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<Modelclass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Modelclass> articles) {
        this.articles = articles;
    }
}
