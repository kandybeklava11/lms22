import java.util.*;

public class Meyhoods implements Findable,Sortable{
    Scanner scanner=new Scanner(System.in);
    @Override
    public  List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie dd:movies) {
            System.out.println(dd);
        }
        return movies;
    }

//    @Override
//    public void findMovieByName(List<Movie> movies) {
//        System.out.println("Write movie name");
//        String searchQuery=scanner.nextLine();
//        List<Movie> foundMovies=new ArrayList<>();
//        for (Movie movie:movies) {
//            if(movie.getName().equalsIgnoreCase(searchQuery)){
//                foundMovies.add(movie);
//            }
//        }
//        if(foundMovies.isEmpty()){
//            System.out.println("Фильмы с указанным запросом не найдены.");
//        }else{
//            System.out.println("Результаты поиска:");
//            for (Movie movie:foundMovies) {
//                System.out.println(movie);
//
//    }
//
//        }
//    }

    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        System.out.println("Write movie's name");
        String searchQuery = scanner.nextLine(); // Замените на ваш запрос поиска
        List<Movie> foundMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getName().toLowerCase().contains(searchQuery.toLowerCase())) {
                foundMovies.add(movie);
            }
        }

        if (foundMovies.isEmpty()) {
            System.out.println("Фильмы с указанным запросом не найдены.");
        } else {
            System.out.println("Результаты поиска:");
            for (Movie movie : foundMovies) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Write actor name");
        String actorName = scanner.nextLine(); // Замените на имя актера
        List<Movie> foundMovies = new ArrayList<>();

        for (Movie movie : movies) {
            for (Cast cast : movie.getCast()) {
                if (cast.getActorFullName().toLowerCase().contains(actorName.toLowerCase())) {
                    foundMovies.add(movie);
                    break; // Прекратить поиск в фильме, если актер найден
                }
            }
        }

        if (foundMovies.isEmpty()) {
            System.out.println("Фильмы с указанным актером не найдены.");
        } else {
            System.out.println("Результаты поиска:");
            for (Movie movie : foundMovies) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Write movie's year");
        int year = scanner.nextInt(); // Замените на год
        List<Movie> foundMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getYear() == year) {
                foundMovies.add(movie);
            }
        }

        if (foundMovies.isEmpty()) {
            System.out.println("Фильмы с указанным годом не найдены.");
        } else {
            System.out.println("Результаты поиска:");
            for (Movie movie : foundMovies) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Write movie's director");
        String directorName = scanner.nextLine(); // Замените на имя режиссера
        List<Movie> foundMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getDirector().getName().toLowerCase().contains(directorName.toLowerCase())) {
                foundMovies.add(movie);
            }
        }

        if (foundMovies.isEmpty()) {
            System.out.println("Фильмы с указанным режиссером не найдены.");
        } else {
            System.out.println("Результаты поиска:");
            for (Movie movie : foundMovies) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {
        System.out.println("Write movie's genre");
        String genre = scanner.nextLine(); // Замените на жанр
        List<Movie> foundMovies = new ArrayList<>();

        for (Movie movie : movies) {
            if (movie.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                foundMovies.add(movie);
            }
        }

        if (foundMovies.isEmpty()) {
            System.out.println("Фильмы с указанным жанром не найдены.");
        } else {
            System.out.println("Результаты поиска:");
            for (Movie movie : foundMovies) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Write movie's role");
        String role = scanner.nextLine(); // Замените на роль
        List<Movie> foundMovies = new ArrayList<>();

        for (Movie movie : movies) {
            for (Cast cast : movie.getCast()) {
                if (cast.getRole().toLowerCase().contains(role.toLowerCase())) {
                    foundMovies.add(movie);
                    break; // Прекратить поиск в фильме, если роль найдена
                }
            }
        }

        if (foundMovies.isEmpty()) {
            System.out.println("Фильмы с указанной ролью не найдены.");
        } else {
            System.out.println("Результаты поиска:");
            for (Movie movie : foundMovies) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void sortByMovieName(List<Movie> movies, boolean ascending) {
        Comparator<Movie> comparator = Comparator.comparing(Movie::getName);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Collections.sort(movies, comparator);

        System.out.println("Сортировка по названию фильма:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByYear(List<Movie> movies, boolean ascending) {
        Comparator<Movie> comparator = Comparator.comparingInt(Movie::getYear);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Collections.sort(movies, comparator);

        System.out.println("Сортировка по году выпуска:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies, boolean ascending) {
        Comparator<Movie> comparator = Comparator.comparing(movie -> movie.getDirector().getName());
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Collections.sort(movies, comparator);

        System.out.println("Сортировка по режиссеру:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }



    }
}


