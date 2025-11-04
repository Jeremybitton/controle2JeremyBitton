package sio.devoir2magazine.services;

import org.springframework.stereotype.Service;
import sio.devoir2magazine.entities.Specialite;
import sio.devoir2magazine.repositories.SpecialiteRepository;

import java.util.List;

@Service
public class SpecialiteService
{
    private SpecialiteRepository specialiteRepository;

    public SpecialiteService(SpecialiteRepository specialiteRepository) {
        this.specialiteRepository = specialiteRepository;
    }

    public List<Specialite> getAllSpecialiteById()
    {
        return specialiteRepository.findAll();
    }
}
