package fr.razanakoto.springbootjpa.ero.core.usecases;

import fr.razanakoto.springbootjpa.ero.core.model.Parcours;
import fr.razanakoto.springbootjpa.ero.core.port.ParcoursRepository;

public class CreateParcoursService {

    private final ParcoursRepository repository;

    public CreateParcoursService(ParcoursRepository repository) {
        this.repository = repository;
    }

    public void create(Parcours parcours) {
        repository.save(parcours);
    }
}
