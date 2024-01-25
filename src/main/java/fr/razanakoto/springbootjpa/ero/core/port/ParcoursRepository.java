package fr.razanakoto.springbootjpa.ero.core.port;

import fr.razanakoto.springbootjpa.ero.core.model.Parcours;

public interface ParcoursRepository {
    void save(Parcours parcours);
}
