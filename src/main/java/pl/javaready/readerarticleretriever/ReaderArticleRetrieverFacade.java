package pl.javaready.readerarticleretriever;

import pl.javaready.authorarticlecud.AuthorArticleCudFacade;

import java.util.stream.Collectors;

public class ReaderArticleRetrieverFacade {

    // todo prepare communication with authorarticlecud module
    AuthorArticleCudFacade authorArticleCudFacade;

    public ReaderArticleRetrieverFacade(AuthorArticleCudFacade authorArticleCudFacade) {
        this.authorArticleCudFacade = authorArticleCudFacade;
    }

    public ArticleDto retrieveById(Long id){
        pl.javaready.authorarticlecud.ArticleDto foundArticle = authorArticleCudFacade.findAllArticles()
                .stream()
                .filter(articleDto -> articleDto.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("not found erorr"));

        return ArticleDto.builder()
                .id(foundArticle.id())
                .header(foundArticle.header())
                .build();
    }
}
