package models;

import interfaces.Playback;

import java.util.*;

public class PremiumList implements Playback {

    private String name;
    private List<Song> myList;

    public PremiumList(String name) {
        this.name = name;
    }


    @Override
    public String play() {
        return chooseSong("reproducir").toString();
    }

    @Override
    public void addSong(Song song) {
        if (myList == null) {
            myList = new LinkedList<>();
        }
    }

    @Override
    public void deleteSong() {
        Song chosenSong = chooseSong("eliminar");
        if (chosenSong!=null)
        {
            myList.remove(chosenSong);
        }
    }

    @Override
    public String showList() {
        StringBuilder songsList = new StringBuilder();
        int index = 0;
        for (Song song : myList) {
            songsList.append(++index).append(" - ").append(song.getName()).append("\n");
        }
        return songsList.toString();
    }

    @Override
    public void changeSong() {
        showMessagePremium();
    }

    private void showMessagePremium() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    private Song chooseSong(String action) {
        Song chosenSong=null;
        String indexSong;
        Scanner scanner = new Scanner(System.in);
        System.out.println(showList());
        System.out.print("Seleccione el numero de canción que desea " + action + ": ");
        indexSong = scanner.nextLine();
        if (validateNumber(indexSong))
        {
            int index = Integer.parseInt(indexSong);
            if(index<=myList.size()&&index>0){
                chosenSong = myList.get(index-1);
            }
            else {
                System.out.println("El número ingresado no corresponde a una canción");
            }
        }
        System.out.println("Debe ingresar un número");
        return chosenSong;
    }

    private boolean validateNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
