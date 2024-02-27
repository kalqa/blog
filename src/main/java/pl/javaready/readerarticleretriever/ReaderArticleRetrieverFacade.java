package pl.javaready.readerarticleretriever;

public class ReaderArticleRetrieverFacade {

    public ArticleDto retrieveById(Long id){
        return ArticleDto.builder()
                .content("5 kroków: 1, 2 , 3, ,4")
                .header("jak zostac programistą")
                .id(1L)
                .category("IT")
                .build();
    }
}
