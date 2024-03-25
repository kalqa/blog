package pl.javaready.authorarticlecud;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// todo prepare creating posts
public class AuthorArticleCudFacade {

    Map<Long, Article> db = new HashMap<>();
    Long id = 0L;

    public void saveArticle(ArticleCreateDto dto) {
        Article article = new Article(
                id++,
                dto.header(),
                dto.content(),
                dto.category()
        );
        db.put(article.id(), article);
    }

    public Set<ArticleDto> findAllArticles() {
        return db.values()
                .stream()
                .map(article -> new ArticleDto(
                        article.id(),
                        article.header(),
                        article.category(),
                        article.content()
                ))
                .collect(Collectors.toSet());
    }

//    public Set<Article> findAllArticlesBadWay() {
//        return new HashSet<>(db.values());
//    }
}
