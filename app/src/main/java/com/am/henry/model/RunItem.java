package com.am.henry.model;

public class RunItem {

    String Title,Content, Date;
    int pontuacao;

    public RunItem() {
    }

    public RunItem(String title, String content, String date, int pontuacao) {
        Title = title;
        Content = content;
        Date = date;
        this.pontuacao = pontuacao;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
