package Artists;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListArtists {
    public Set<Artist> artistsList;

    public ListArtists() {this.artistsList = new HashSet<>();}

    public void addArtistToList(Artist artist) {artistsList.add(artist);}

    public void deleteItemByName(String name) {
		Set<Artist> itemToRemove = new HashSet<>();
		for (Artist artist : artistsList) {
			if (artist.getName().equalsIgnoreCase(name)) {
				itemToRemove.add(artist);
			}
		}
		artistsList.removeAll(itemToRemove);
	}

    public void printArtistList() {
		Set<Artist> artistSortedByName = new TreeSet<>(artistsList);
        for (Artist artist : artistSortedByName) {
            System.out.println("Nome do Artista: " + artist.getName());
        }
	}

    public static void main(String[] args) {
        ListArtists artistList = new ListArtists();
        Artist fabianoCambota = new Artist("Fabiano Cambota");
        Artist zimbra = new Artist("Zimbra");
        artistList.addArtistToList(zimbra);
        artistList.addArtistToList(fabianoCambota);
        artistList.printArtistList();
        artistList.deleteItemByName("Zimbra");
        System.out.println("Imprimindo a lista após remoção de um artista");
        artistList.printArtistList();
    }

}
