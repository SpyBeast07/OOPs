import java.util.*;

public class Movie
{
    String title;
    String studio;
    String rating;

    public Movie(String titl, String studi, String ratin)
    {
        title = titl;
        studio = studi;
        rating = ratin;
        // System.out.println(title + "\n" + studio + "\n" + rating);
    }

    public Movie(String titl, String studi)
    {
        title = titl;
        studio = studi;
        rating = "PG";
        // System.out.println(title + "\n" + studio + "\n" + rating);
    }

    public static Movie[] getPG(Movie[] movies)
    {
        List<Movie> pgMovies = new ArrayList<>();
        for (Movie movie : movies)
        {
            if (movie.rating=="PG")
            {
                pgMovies.add(movie);
            }
        }
        return pgMovies.toArray(new Movie[pgMovies.size()]);
    }    
    

    public static void main(String[] args) 
    {
        Movie mov = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie movi = new Movie("The Super Mario Bros", "Universal Pictures");
        Movie movi1 = new Movie("Spiderman", "Marvel", "PG");

        // Way 1 to make list movies
        // Movie[] movies = new Movie[3];
        // movies[0] = mov;
        // movies[1] = movi;
        // movies[2] = movi1;
        
        // Way 2 to make list movies
        Movie[] movies = {mov, movi, movi1};

        Movie[] pgMovies = Movie.getPG(movies);

        for (Movie movie : pgMovies) 
        {
            System.out.println(movie.title);
        }
    }
}
