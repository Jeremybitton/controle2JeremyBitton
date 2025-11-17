package sio.devoir2magazine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sio.devoir2magazine.entities.Specialite;

import java.util.List;

@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite, Integer>
{
    @Override
    List<Specialite> findAllById(Iterable<Integer> integers);
}
