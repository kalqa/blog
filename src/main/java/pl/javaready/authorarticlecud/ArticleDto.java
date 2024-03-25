package pl.javaready.authorarticlecud;

import lombok.Builder;

@Builder
public record ArticleDto(
        Long id,
        String header,
        String category,
        String content
) {
}
