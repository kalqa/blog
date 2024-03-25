package pl.javaready;

import pl.javaready.authorarticlecud.ArticleCreateDto;
import pl.javaready.authorarticlecud.ArticleDto;
import pl.javaready.authorarticlecud.AuthorArticleCudFacade;
import pl.javaready.readerarticleretriever.ReaderArticleRetrieverFacade;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // author/admin dodaje wpis
        AuthorArticleCudFacade authorArticleCudFacade = new AuthorArticleCudFacade();
        System.out.println("1. Zapisywanie artykułu przez admina ");
        authorArticleCudFacade.saveArticle(
                new ArticleCreateDto(
                        "header1",
                        "content1",
                        "IT"
                )
        );
        authorArticleCudFacade.saveArticle(
                new ArticleCreateDto(
                        "header2",
                        "content2",
                        "IT2"
                )
        );
        authorArticleCudFacade.saveArticle(
                new ArticleCreateDto(
                        "header3",
                        "content2",
                        "IT2"
                )
        );
        authorArticleCudFacade.saveArticle(
                new ArticleCreateDto(
                        "header4",
                        "content2",
                        "IT2"
                )
        );
        System.out.println("2. Artykuł zapisany przez admina ");
        // author/admin dodaje wpis
        Set<ArticleDto> allArticles = authorArticleCudFacade.findAllArticles();
        System.out.println("3. Wszystkie wpisy wyswietlone przez admina: ");
        allArticles.forEach(
                System.out::println
        );

        // czytelnik wyswietla wpis o id 0
        System.out.println("4. Czytelnik wyswietla wpis o id 0");
        ReaderArticleRetrieverFacade readerArticleRetrieverFacade = new ReaderArticleRetrieverFacade(
                authorArticleCudFacade
        );
        pl.javaready.readerarticleretriever.ArticleDto articleDto = readerArticleRetrieverFacade.retrieveById(0L);
        System.out.println(articleDto);
        pl.javaready.readerarticleretriever.ArticleDto articleDto2 = readerArticleRetrieverFacade.retrieveById(1L);
        System.out.println(articleDto2);

    }
}
