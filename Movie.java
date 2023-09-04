import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String genre;
    private Director director;
    private List<Cast> cast;

    public Movie(String name, int year, String genre, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public Director getDirector() {
        return director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    @Override
    public String toString() {

        return "\n==========================MOVIE============================"+"\n"+
                "Movie" +
                "\nName = " + name+"." +
                "\nYear = " + year+"." +
                "\nGenre = " + genre+"." +
                "\nDirector = " + director+"." +
                "\nCast = " +cast;


    }
}

