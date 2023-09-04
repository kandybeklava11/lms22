import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        /*
        Random random = new Random();
        int secretNumber = random.nextInt(1, 10);
        System.out.println("dai chislo");
        Scanner scanner = new Scanner(System.in);
        int meninSanym = scanner.nextInt();
        int popytka = 0;

        if (meninSanym == secretNumber) {
            System.out.println("you winnn");
        } else if (meninSanym < secretNumber) {
            System.out.println(" slishkom malenkoe chislo");
        } else if (meninSanym > secretNumber) {
            System.out.println("slishkom bolshoe chislo");
            System.out.println(++popytka);
        }
        meninSanym = scanner.nextInt();

        if (meninSanym == secretNumber) {
            System.out.println("you winnn");
        } else if (meninSanym < secretNumber) {
            System.out.println(" slishkom malenkoe chislo");
        } else if (meninSanym > secretNumber) {
            System.out.println("slishkom bolshoe chislo");
            System.out.println(++popytka);
        }
        meninSanym = scanner.nextInt();
        if (meninSanym == secretNumber) {
            System.out.println("you winnn");
        } else if (meninSanym < secretNumber) {
            System.out.println(" slishkom malenkoe chislo");
        } else if (meninSanym > secretNumber) {
            System.out.println("slishkom bolshoe chislo");
            System.out.println(++popytka);
        }

         */
        ///////////////////////////////////////////////////////////////////
        Cast cast = new Cast("Denial Dedclif", " Hury Potter");
        Cast cast2 = new Cast("Emma Uotson", " Germiona");
        Cast cast3 = new Cast("Ruppert Grint", " Ron Uizli");
        Director director = new Director("Chris ", "Colambus");
        List<Cast> castList = new ArrayList<>();
        castList.add(cast);
        castList.add(cast2);
        castList.add(cast3);
        //Movie movie = new Movie("Hary Potter", 1998, "Fantasy", director, castList);
///////////////////////////////////////////////////////////////////////////
        Cast cast4 = new Cast("Metu Makkonahi", " Kuper");
        Cast cast5 = new Cast("Enn Heteueit", " Amelia Brend");
        Cast cast6 = new Cast("Jesika Chastein", " Myorf");
        Director director2 = new Director("Christofer ", "Nollan");
        List<Cast> castList2 = new ArrayList<>();
        castList2.add(cast4);
        castList2.add(cast5);
        castList2.add(cast6);
        //Movie movie2 = new Movie("Interstellar", 2014, "Fantastic", director2, castList2);
        ////////////////////////////////////////////////////////////////////
        Cast cast7 = new Cast("Cillian Murphy", " J.Ronert Oppenheimer ");
        Cast cast8 = new Cast("Florence Pew", " Jean Tatlock");
        Cast cast9 = new Cast("Robert Downey Jr ", "Lewis Strauss");
        Director director3 = new Director("Christofer jr", "Nollan");
        List<Cast> castList3 = new ArrayList<>();
        castList3.add(cast7);
        castList3.add(cast8);
        castList3.add(cast9);
       // Movie movie3 = new Movie("Oppenheimer", 2023, "Drama", director3, castList3);
///////////////////////////////////////////////////////////////////////////
        Cast cast10 = new Cast("Omar si", " Dries ");
        Cast cast11 = new Cast("Francois Cluzet", " Philip");
        Cast cast12 = new Cast("Audrey Fleureau ", "Magali  ");
        Director director4 = new Director("Edric ", " Toledano");
        List<Cast> castList4 = new ArrayList<>();
        castList4.add(cast10);
        castList4.add(cast11);
        castList4.add(cast12);
        // Movie movie4 = new Movie("1+1", 2011, "Drama,Comedy", director4, castList4);
///////////////////////////////////////////////////////////////////////////
        Cast cast13 = new Cast("Macaulay Culkin", " Kevin ");
        Cast cast14 = new Cast("Joe Peshi", " Gari ");
        Cast cast15 = new Cast("Daniel Stern ", "Marvin  ");
        Director director5 = new Director("Chris ", " Columbus");
        List<Cast> castList5 = new ArrayList<>();
        castList5.add(cast13);
        castList5.add(cast14);
        castList5.add(cast15);
        // Movie movie4 = new Movie("Alone at home", 1990, "Drama,Comedy", director5, castList5);
///////////////////////////////////////////////////////////////////////////
        // Создание списка фильмов
        List<Movie> moviesList = new ArrayList<>();
        Movie movie = new Movie("Hary Potter", 1998, "Fantasy", director, castList);
        Movie movie2 = new Movie("Interstellar", 2014, "Fantastic", director2, castList2);
        Movie movie3 = new Movie("Oppenheimer", 2023, "Drama", director3, castList3);
        Movie movie4 = new Movie("1+1", 2011, "Drama,Comedy", director4, castList4);
        Movie movie5 = new Movie("Alone at home", 1990, "kids Comedy", director5, castList5);
        // Добавление фильмов в список
        moviesList.add(movie);
        moviesList.add(movie2);
        moviesList.add(movie3);
        moviesList.add(movie4);
        moviesList.add(movie5);
        Scanner scanner = new Scanner(System.in);
        int vybor = 0;
        do {
            System.out.println();
            System.out.println("Выберите один из вариантов:");
            System.out.println("1.Get all movies");
            System.out.println("2.Find movie by full name or part name ");
            System.out.println("3.Find movie by actor name ");
            System.out.println("4.Find movie by year ");
            System.out.println("5.Find movie by director ");
            System.out.println("6.Find movie by genre ");
            System.out.println("7.Find movie by role ");
            System.out.println("8.Sort by movie name, A to Z ");
            System.out.println("9.Sort by movie name, Z to A ");
            System.out.println("10.Sort by year, Old to New ");
            System.out.println("11.Sort by year, New to Old ");
            System.out.println("12.Sort by director, A to Z ");
            System.out.println("13.Sort by director, Z to A ");
            Meyhoods meyhoods = new Meyhoods();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    meyhoods.getAllMovies(moviesList);
                    break;
                case 2:
                    meyhoods.findMovieByFullNameOrPartName(moviesList);
                    break;
                case 3:
                    meyhoods.findMovieByActorName(moviesList);
                    break;
                case 4:
                    meyhoods.findMovieByYear(moviesList);
                    break;
                case 5:
                    meyhoods.findMovieByDirector(moviesList);
                    break;
                case 6:
                    meyhoods.findMovieByGenre(moviesList);
                    break;
                case 7:
                    meyhoods.findMovieByRole(moviesList);
                    break;
                case 8:
                    meyhoods.sortByMovieName(moviesList, true);
                    break;
                case 9:
                    meyhoods.sortByMovieName(moviesList, false);
                    break;
                case 10:
                    meyhoods.sortByYear(moviesList, true);
                    break;
                case 11:
                    meyhoods.sortByYear(moviesList, false);
                    break;
                case 12:
                    meyhoods.sortByDirector(moviesList, true);
                    break;
                case 13:
                    meyhoods.sortByDirector(moviesList, false);
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        } while (vybor != 14);
    }
    }
