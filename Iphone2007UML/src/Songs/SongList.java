package Songs;

import java.util.ArrayList;
import java.util.List;

import Artists.Artist;

public class SongList {
    public List<Song> songList;

    public SongList() {
        this.songList = new ArrayList<>();
    }

    public void addSongToList(String title, int songDuration, Artist artist) {
        songList.add(new Song(title, songDuration, artist));
    }

    public void deleteItemByTitle(String title) {
		List<Song> itemToRemove = new ArrayList<>();
		for (Song song : songList) {
			if (song.getTitle().equalsIgnoreCase(title)) {
				itemToRemove.add(song);
			}
		}
		songList.removeAll(itemToRemove);
	}

    public void printSongs() {
		for (Song song : songList) {
			song.printSongInfo();
		}
	}

    // Método para testar a classe
    // public static void main(String[] args) {
    //     SongList list = new SongList();
    //     Artist artist = new Artist("Gabriel");
    //     list.addSongToList("Nome da Música", 226, artist);
    //     list.printSongs();
    //     list.deleteItemByTitle("Nome da Música");
    //     list.printSongs();
    // }

}
