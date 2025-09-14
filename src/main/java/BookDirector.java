public class BookDirector {
    public Book construct(IBookBuilder builder){
        builder.setAuthor("Mukhtar Auyezov");
        builder.setTitle("Abai Zholy");
        builder.setGenre("poetry");
        builder.setPublished_year(1942);
        return builder.build();
    }
}

