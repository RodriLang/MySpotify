package models;

/*
        Para ello deberemos generar
        una clase Canción la cual posee un nombre, la duración de la canción,
        género (el cual solo podrá ser ROCK, TRAP, JAZZ, HIP HOP, POP, METAL y
        CLASICA), el Álbum al que pertenece y a veces un artista invitado si es que
        tiene.
*/
public class Song {

    private String name;
    private Double duration;
    private Genre genre;
    private Album album;
    private Artist invitedArtist;


    public Song() {
    }

    @Override
    public String toString() {
        String dataSong =
                "Canción: " + name +
                        "\n Duración: " + duration +
                        "\n Género: " + genre +
                        "\n Álbum: " + album;
        if (invitedArtist != null) {
            dataSong.concat("\n Artista invitado: " + invitedArtist.getName());
        }
        return dataSong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getInvitedArtist() {
        return invitedArtist;
    }

    public void setInvitedArtist(Artist invitedArtist) {
        this.invitedArtist = invitedArtist;
    }
}
