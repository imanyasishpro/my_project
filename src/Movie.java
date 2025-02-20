public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;
    }

    public Movie getMovieType(){

        return switch (this.title.toLowerCase()) {
            case "faf 1, jumamji" ->new Adventure(this.title);
            case "hangover","the dictator" -> new Comedy(this.title);
            case "conjurine","anabel","maya" -> new Horror(this.title);
            default -> new Movie(this.title);
        };
    }

    public String getMovie() {
        return this.title + " is a great movie";
    }

    public String theMovie() {
        return getMovieType().getMovie();
    }
}

class Adventure extends Movie{
    public String title;
    public Adventure(String title){
        super(title);
    }

    @Override
    public String getMovie() {
        return super.getMovie() + " and it is a adventure";
    }
}

class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }

    @Override
    public String getMovie() {
        return super.getMovie() + " and it is a comedy";
    }
}

class Horror extends Movie{
    public Horror(String title){
        super(title);
    }

    @Override
    public String getMovie() {
        return super.getMovie() + " and it is a horror one.";
    }
}