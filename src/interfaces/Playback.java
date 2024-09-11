package interfaces;

import models.Song;

/*        2) Crear una interfaz llamada Reproducción, que tendrá los siguientes
        métodos:
        - Reproducir: Debe mostrar la canción en reproducción, junto
        con el nombre del álbum, género y nombre del artista junto con
        el artista invitado si es que hay.
        - AñadirCancion: recibe una canción por parámetro y la guarda
        en la lista en reproducción.
        - EliminarCancion: mostrará las canciones de la lista en
        reproducción y permitirá elegir una para eliminar.
        - VerMiLista: Nos permite ver nuestra lista de reproducción.
*/
public interface Playback {
    String play();
    void addSong(Song song);
    void deleteSong();
    String showList();
    void changeSong();
}
