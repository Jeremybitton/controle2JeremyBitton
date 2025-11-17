package sio.devoir2magazine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sio.devoir2magazine.dto.ArticlePigiste;
import sio.devoir2magazine.entities.Article;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer>
{

    @Query("select new sio.devoir2magazine.dto.ArticlePigiste(a.id,a.titreArticle,a.nbFeuillets,p.nomPigiste) from Article a join a.numPig p where a.numPig.id =:numPig")
    List<ArticlePigiste> findArticlesByNumPigs(@Param("numPig") int numPig);


}
