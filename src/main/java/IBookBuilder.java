public interface IBookBuilder {
    void setTitle(String title);
    void setAuthor(String author);
    void setGenre(String genre);
    void setPublished_year(int published_year);
    Book build();
}
