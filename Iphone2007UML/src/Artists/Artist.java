package Artists;

public class Artist implements Comparable<Artist> {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Artist a) {
        return name.compareToIgnoreCase(a.getName());
    }
}
