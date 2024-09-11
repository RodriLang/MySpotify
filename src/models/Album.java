package models;

import java.time.Year;

/*
* Álbum posee el año en que fue publicado, un título y conoce su
        Artista. Artista a su vez posee un nombre, su edad y la nacionalidad.
*/
public class Album {
    private Year publishedYear;
    private String tittle;
    private Artist artist;
}
