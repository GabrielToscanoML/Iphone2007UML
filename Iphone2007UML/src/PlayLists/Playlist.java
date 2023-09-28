package PlayLists;

import Songs.SongList;

public class Playlist implements Comparable<Playlist> {
    public String name;
    public SongList songList;

    public Playlist(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Playlist p) {
         return name.compareToIgnoreCase(p.name);
    }

    public void addSongListToPlaylist(SongList songlist) {
        songList = songlist;
    }

    public void printSongsInfo() {
        songList.printSongs();
    }

}
