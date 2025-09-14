public class Book {

    private String title;
    private String author;
    private String genre;
    private int published_year;


    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public int getPublished_year() {
        return published_year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }
    public class NovelBookBuilder implements IBookBuilder{
        private Book book = new Book();
        @Override public void setTitle(String title){
        book.setTitle(title);}
        @Override public void setAuthor(String author){
        book.setAuthor(author);}
        @Override public void setGenre(String genre){
        book.setGenre(genre);}
        @Override public void setPublished_year(int published_year){
        book.setPublished_year(published_year);}

        @Override
        public Book build() {
            return book;
        }
    }
}
