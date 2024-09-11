package models;

import interfaces.Playback;

import java.util.Stack;

public class BasicList implements Playback {

    private String name;
    private Stack<Song> myList;

    public BasicList(String name) {
        this.name = name;
    }


    @Override
    public String play() {
        Song onPlay = myList.pop();
        moveToEnd(onPlay);
        return onPlay.toString();
    }

    @Override
    public void addSong(Song song) {
        if (myList == null) {
            myList = new Stack<>();
        }
    }

    @Override
    public void deleteSong() {
        showMessagePremium();
    }

    @Override
    public String showList() {
        StringBuilder songsList= new StringBuilder();
        int index=0;
        for (Song song: myList) {
            songsList.append(++index).append(" - ").append(song.getName()).append("\n");
        }
        return songsList.toString();
    }

    @Override
    public void changeSong() {
        showMessagePremium();
    }

    private void moveToEnd(Song songPlayed){
        Stack<Song> aux = new Stack<>();
        aux.addAll(myList);
        myList.removeAllElements();
        myList.add(songPlayed);
        myList.addAll(aux);
    }
    private void showMessagePremium(){
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
