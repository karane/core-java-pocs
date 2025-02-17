package org.karane;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class MovieRentalWebsite {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", "Sci-Fi", 8.8),
            new Movie("Interstellar", "Sci-Fi", 8.6),
            new Movie("The Dark Knight", "Action", 9.0),
            new Movie("Fight Club", "Drama", 8.8),
            new Movie("The Matrix", "Sci-Fi", 8.7),
            new Movie("Titanic", "Romance", 7.8)
        );
        
        // Predicate: Define a filter condition for Sci-Fi movies
        Predicate<Movie> sciFiFilter = movie -> movie.getGenre().equals("Sci-Fi");
        
        // Using Streams: Filter Sci-Fi movies and collect them into a list
        List<Movie> sciFiMovies = movies.stream()
                                        .filter(sciFiFilter)
                                        .collect(Collectors.toList());
        
        System.out.println("Sci-Fi Movies:");
        sciFiMovies.forEach(System.out::println);
        
        // Using Map: Get a list of movie titles
        List<String> movieTitles = movies.stream()
                                         .map(Movie::getTitle)
                                         .map(title -> "\t" + title)
                                         .collect(Collectors.toList());
        
        System.out.println("\nAll Movie Titles:");
        movieTitles.forEach(System.out::println);
        
        // Using Filter and Map together: Get titles of movies with rating > 8.5
        List<String> highRatedMovies = movies.stream()
                                             .filter(movie -> movie.getRating() > 8.5)
                                             .map(Movie::getTitle)
                                             .map(title -> "\t" + title)
                                             .collect(Collectors.toList());
        
        System.out.println("\nHighly Rated Movies (Rating > 8.5):");
        highRatedMovies.forEach(System.out::println);
        
        // Convert List to Array
        Movie[] movieArray = movies.toArray(new Movie[0]);
        System.out.println("\nMovie Array:");
        Arrays.stream(movieArray)
                .map(movie -> "\t" + movie)
                .forEach(System.out::println);
        
        // Supplier Example: Provide a default movie
        Supplier<Movie> defaultMovieSupplier = () -> new Movie("Default Movie", "Unknown", 0.0);
        System.out.println("\nDefault Movie: " + defaultMovieSupplier.get());

        // Using IntSupplier to generate a random rating
        IntSupplier randomRatingSupplier = () -> new Random().nextInt(10) + 1;
        System.out.println("\nRandom Rating: " + randomRatingSupplier.getAsInt());
        
        // Consumer Example: Print movie details
        Consumer<Movie> moviePrinter = movie -> System.out.println("\tMovie: " + movie.getTitle() + " (" + movie.getGenre() + ")");
        System.out.println("\nUsing Consumer to print movies:");
        movies.forEach(moviePrinter);
        
        // UnaryOperator Example: Increase rating of movies by 1
        UnaryOperator<Movie> increaseRating = movie -> new Movie(movie.getTitle(), movie.getGenre(), movie.getRating() + 1);
        List<Movie> updatedMovies = movies.stream()
                                          .map(increaseRating)
                                          .collect(Collectors.toList());
        System.out.println("\nMovies with increased ratings:");
        updatedMovies.forEach(System.out::println);
        
        // BinaryOperator Example: Get the movie with the highest rating
        BinaryOperator<Movie> highestRatedMovie = (m1, m2) -> m1.getRating() > m2.getRating() ? m1 : m2;
        Movie topMovie = movies.stream()
                .reduce(highestRatedMovie)
                .orElse(defaultMovieSupplier.get());
        System.out.println("\nHighest Rated Movie: " + topMovie);

        // Using Function to extract genre
        Function<Movie, String> genreExtractor = Movie::getGenre;
        System.out.println("\nGenres of Movies:");
        movies.stream()
                .map(genreExtractor)
                .map(g -> "\t" + g)
                .forEach(System.out::println);

        // Using BiFunction to create a new Movie with modified rating
        BiFunction<Movie, Double, Movie> modifyRating = (movie, newRating) -> new Movie(movie.getTitle(), movie.getGenre(), newRating);
        System.out.println("\nMovies with modified ratings:");
        movies.stream()
                .map(m -> modifyRating.apply(m, m.getRating() + 0.5))
                .map(m -> "\t" + m.toString())
                .forEach(System.out::println);

        // Collectors Example: Group movies by genre
        Map<String, List<Movie>> moviesByGenre = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println("\nMovies grouped by Genre:");
        moviesByGenre.forEach((genre, movieList) -> {
            System.out.println("\t" + genre + ": " + movieList);
        });

        // Collectors Example: Count movies by genre
        Map<String, Long> movieCountByGenre = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println("\nMovie count by Genre:");
        movieCountByGenre.forEach((genre, count) -> {
            System.out.println("\t" + genre + ": " + count);
        });

        // Collectors Example: Get the highest-rated movie per genre
        Map<String, Optional<Movie>> highestRatedByGenre = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,
                                        Collectors.maxBy(Comparator.comparingDouble(Movie::getRating))
                                    )
                );
        System.out.println("\nHighest Rated Movie per Genre:");
        highestRatedByGenre.forEach(
                (genre, movie) -> {
                    System.out.println("\t" + genre + ": " + movie.orElse(null));
                    }
                );

        // Collectors Example: Summarizing statistics of ratings
        DoubleSummaryStatistics ratingStats = movies.stream()
                .collect(Collectors.summarizingDouble(Movie::getRating));
        System.out.println("\nMovie Rating Statistics:");
        System.out.println("\tAverage Rating: " + ratingStats.getAverage());
        System.out.println("\tHighest Rating: " + ratingStats.getMax());
        System.out.println("\tLowest Rating: " + ratingStats.getMin());

        // Collectors Example: Joining movie titles into a single string
        String movieTitlesJoined = movies.stream()
                .map(Movie::getTitle)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("\nJoined Movie Titles: \n\t" + movieTitlesJoined);
    }
}
