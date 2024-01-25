package fr.razanakoto.springbootjpa.ero.infra.jpa;

import fr.razanakoto.springbootjpa.ero.infra.entity.ParcoursEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcoursRepositoryJPA extends JpaRepository<ParcoursEntity, Integer> {
}
