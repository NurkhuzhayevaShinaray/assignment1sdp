public class BookDirector {
    public Book construct(IBookBuilder builder){
        builder.setAuthor("Mukhtar Auyezov");
        builder.setGenre("poetry");
        return builder.build();
    }
}

