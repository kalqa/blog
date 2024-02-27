package pl.javaready.readerarticleretriever;

public class ReaderArticleRetrieverFacade {

    public ArticleDto retrieveById(Long id){
//        return new ArticleDto(
//                1L,
//                "jak zostac programistą",
//                "5 kroków: 1, 2 , 3, ,4",
//                "IT"
//        );
        return ArticleDto.builder()
                .content("5 kroków: 1, 2 , 3, ,4")
                .header( "jak zostac programistą")
                .id(1L)
                .category("IT")
                .build();
    }
}
