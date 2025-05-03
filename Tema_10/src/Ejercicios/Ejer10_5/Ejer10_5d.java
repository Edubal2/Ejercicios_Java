package Ejercicios.Ejer10_5;

class Song {
    String name;
    String artist;
    double rating;
    Boolean favorite;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public String getInfo() {
        return "Nombre: " + name + " Artista: " + artist + " Rating: " + rating + " Favorita: " + favorite;
    }

}

public class Ejer10_5d {
    public static void main(String[] args) {
        Song song = new Song("Whole Lotta Love", "Led Zeppelin");

        song.setRating(9.8);
        song.setFavorite(true);

        System.out.println(song.getInfo());
    }
}

