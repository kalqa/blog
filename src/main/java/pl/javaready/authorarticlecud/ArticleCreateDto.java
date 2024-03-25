package pl.javaready.authorarticlecud;

public record ArticleCreateDto(
        String header,
        String content,
        String category
) {
}
