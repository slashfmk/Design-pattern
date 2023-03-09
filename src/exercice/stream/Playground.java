package exercice.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Playground {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie(30, "Scream 2"),
                new Movie(30, "Scream 1"),
                new Movie(75, "Anaconda"),
                new Movie(120, "Titanic")
        );

        /*
         * Functional programming
         * We don't express how things should be done,
         * but what should be done
         */
        var mv = movies.stream()
                .filter(movie -> movie.getLength() > 30)
                .count();

        movies.stream()
                .map(movie -> "[" + movie.getName() + "]")
                .forEach(System.out::println);

        // Take while movie length is < 90 minutes
        movies.stream()
                .takeWhile(movie -> movie.getLength() < 90)
                .forEach(movie -> System.out.println(movie.getName()));

        // Sorting
        movies.stream()
                .sorted(Comparator.comparing(Movie::getName).reversed())
                .forEach( movie -> System.out.println(movie.getName() + " " + movie.getLength() + " minutes"));

        // avoid duplicate movie length
        movies.stream()
                .map(Movie::getLength)
                .distinct()
                .forEach(System.out::println);

        // using peek method to track in case of error
        movies.stream()
                .map(Movie::getLength)
                .peek(movie -> System.out.println("Mapped: " + movie))
                .distinct()
                .peek(movie -> System.out.println("Distinct: " + movie))
                .forEach(System.out::println);

        // get movie with max length
        var longestMovie = movies.stream()
                .max(Comparator.comparing(Movie::getLength))
                .get();

        System.out.println(longestMovie.getName());

        var result = movies.stream()
                .filter( movie -> movie.getLength() > 10)
                .collect(Collectors.toMap(Movie::getName, Movie::getLength));

        System.out.println(result);

        // reduce to a value such as count
        Optional<Integer> sum =  movies.stream()
                .map(Movie::getLength)
                .reduce((a, b) -> a + b);

        System.out.println(sum.orElse(0));

        // those below cannot be chained after being used
        var isMovieLonger = movies.stream()
                .anyMatch( movie -> movie.getLength() > 34);

        System.out.println(isMovieLonger);

    }
}
