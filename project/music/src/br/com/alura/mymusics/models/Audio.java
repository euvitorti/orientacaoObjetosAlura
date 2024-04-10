package br.com.alura.mymusics.models;


public class Audio {
    private String title;
    private int totalPlayBack;
    private int totalLikes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalPlayBack() {
        return totalPlayBack;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void like() {
        this.totalLikes++;
    }

    public void playBlack() {
        this.totalPlayBack++;
    }
}
