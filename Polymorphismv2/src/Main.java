public class Main {
    public static void main(String[] args) {
        // Polymorphism simply means many forms

        // Polymorphism lets us write code to call a method, but at run time, this method's
        // behavior can be different for different objects.

        // This means the behavior that occurs, while the program is executing, depends on the runtime
        // type of the object

        Movie movie = new Movie("Star Wars");
        movie.watchMovie();

        Movie movie2 = new Adventure("Adventure Film");
        movie2.watchMovie();

        Movie movie3 = new Comedy("How I met your mother");
        movie3.watchMovie();

        Movie movie4 = new ScienceFiction("Interstellar");
        movie4.watchMovie();

        Adventure adventure = (Adventure) new  Movie("New Adventure Film");
        adventure.getClass().getName();


    }
}