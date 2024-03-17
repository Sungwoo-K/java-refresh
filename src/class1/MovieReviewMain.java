package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "java";
        movie1.review = "It's very good!!";

        MovieReview movie2 = new MovieReview();
        movie2.title = "kotlin";
        movie2.review = "It's very good!!";

        MovieReview[] movies = new MovieReview[]{movie1, movie2};

        for (MovieReview movie : movies) {
            System.out.println(movie.title + "/" + movie.review);
        }
    }
}
