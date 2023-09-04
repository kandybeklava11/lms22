import java.util.List;

public interface Sortable {
    void sortByMovieName(List<Movie> movies, boolean ascending);
    void sortByYear(List<Movie> movies, boolean ascending);
    void sortByDirector(List<Movie> movies, boolean ascending);
}
