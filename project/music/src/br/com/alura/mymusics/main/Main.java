package br.com.alura.mymusics.main;

import br.com.alura.mymusics.models.Favorite;
import br.com.alura.mymusics.models.Music;
import br.com.alura.mymusics.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("My house");
        myMusic.setSinger("2PM");

        for (int i = 0; i < 2500; i++) {
            myMusic.playBlack();
        }

        for (int i = 0; i < 3000; i++) {
            myMusic.playBlack();
        }

        for (int i = 0; i < 6500; i++) {
            myMusic.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("BolhaDev");
        podcast.setHost("Marcos Mendes");

        for (int i = 0; i < 783; i++) {
            podcast.playBlack();
        }

        for (int i = 0; i < 136; i++) {
            podcast.playBlack();
        }

        for (int i = 0; i < 200; i++) {
            podcast.like();
        }

        Favorite favorite = new Favorite();
        favorite.inlude(podcast);
        favorite.inlude(myMusic);
    }
}
