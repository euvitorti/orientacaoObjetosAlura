package br.com.alura.mymusics.models;

public class Favorite {
    public void inlude(Audio audio) {
        if (audio.getClassification() >= 10){
            System.out.printf("%s is amazing!", audio.getTitle());
        } else {
            System.out.println("It's good!");
        }
    }
}
