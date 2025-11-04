package sio.devoir2magazine.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sio.devoir2magazine.dto.MagazineSpecialite;
import sio.devoir2magazine.entities.Magazine;

import java.util.List;

@Repository
public interface MagazineRepository extends JpaRepository<Magazine, Integer>
{
    @Override
    List<Magazine> findAll();

    @Query("select new sio.devoir2magazine.dto.MagazineSpecialite(m.id,m.nomMag,s.nomSpe) from Magazine m join m.numSpecialite s")
    List<MagazineSpecialite> findMagazineByNumSpecialite();
}
