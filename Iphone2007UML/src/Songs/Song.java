package Songs;

import Artists.Artist;

public class Song {
    private String title;
    private int songDurationSec;
    private Artist artist;

    public Song(String title, int songDurationSec, Artist artist) {
        this.title = title;
        this.songDurationSec = songDurationSec;
        this.artist = artist;
    }

    // getters
    public String getArtist() {return artist.getName();}
    public int getSongDurationSec() {return songDurationSec;}
    public String getTitle() {return title;}

    private String convertSecondsInMinutes(int durationSec) {
        int minutes = (durationSec / 60);
        int seconds = durationSec - (minutes * 60);
        return String.format( "%d:%d", minutes, seconds);
    }

    public void printSongInfo() {
        System.out.println("Title : " + title);
        System.out.println("Duration : " + convertSecondsInMinutes(songDurationSec));
        System.out.println("Artist : " + artist.getName());
    }


    // método main para testar a função
    public static void main(String[] args) {
        Artist artist = new Artist("Gabriel");
        Song song = new Song("NomeMusica", 137, artist);
        song.printSongInfo();
    }
}
