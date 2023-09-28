package PlayLists;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Artists.Artist;
import Songs.SongList;

public class Playlists {
    public Set<Playlist> playlists;

    public Playlists() {
        this.playlists = new HashSet<>();
    }

    public void addPlaylistToList(Playlist playlist) {
        playlists.add(playlist);
    }

    public void deleteItemByName(String name) {
		Set<Playlist> itemToRemove = new HashSet<>();
		for (Playlist playlist : playlists) {
			if (playlist.name.equalsIgnoreCase(name)) {
				itemToRemove.add(playlist);
			}
		}
		playlists.removeAll(itemToRemove);
	}

    public void printPlaylists() {
		Set<Playlist> playlistSortedByName = new TreeSet<>(playlists);
        System.out.println("Informações das playlists");
        System.out.println("");
        for (Playlist p : playlistSortedByName) {
            System.out.println("Nome da Playlist: " + p.name);
            p.printSongsInfo();
            System.out.println("");
        }
	}

    // Método para testar a classe
    public static void main(String[] args) {
        // crio a lista de playlists
        Playlists plays = new Playlists();

        //playlist 1
        Playlist play1 = new Playlist("MDB");
        Artist newArtist = new Artist("Pedra Leticia");
        SongList songList1 = new SongList();
        songList1.addSongToList("Creuza", 178, newArtist);
        songList1.addSongToList("Anos Atrás", 120, newArtist);
        play1.addSongListToPlaylist(songList1);

        //playlist 2 
        Playlist play2 = new Playlist("Zimbra");
        Artist newArtist2 = new Artist("Zimbra");
        SongList songList2 = new SongList();
        songList2.addSongToList("Já Sei", 208, newArtist2);
        songList2.addSongToList("Missão Apollo", 183, newArtist2);
        play2.addSongListToPlaylist(songList2);

        // adicionando as duas playlists na minha lista de playlist 
        plays.addPlaylistToList(play1);
        plays.addPlaylistToList(play2);
        plays.printPlaylists();
    }
}
