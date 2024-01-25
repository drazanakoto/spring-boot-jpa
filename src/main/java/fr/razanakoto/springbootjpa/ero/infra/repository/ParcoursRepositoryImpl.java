package fr.razanakoto.springbootjpa.ero.infra.repository;

import fr.razanakoto.springbootjpa.ero.core.model.Parcours;
import fr.razanakoto.springbootjpa.ero.core.model.User;
import fr.razanakoto.springbootjpa.ero.core.port.ParcoursRepository;
import fr.razanakoto.springbootjpa.ero.infra.entity.ParcoursEntity;
import fr.razanakoto.springbootjpa.ero.infra.entity.UserEntity;
import fr.razanakoto.springbootjpa.ero.infra.jpa.ParcoursRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ParcoursRepositoryImpl implements ParcoursRepository {

    @Autowired
    private ParcoursRepositoryJPA jpa;

    @Override
    public void save(Parcours parcours) {
        var entity = mapParcoursToEntity(parcours);
        jpa.save(entity);
    }


    private ParcoursEntity mapParcoursToEntity(Parcours parcours) {
        var entity = new ParcoursEntity();
        entity.setIdParcours(parcours.idParcours());
        entity.setName(parcours.name());
        entity.setUserList(parcours.userList().stream().map(this::mapUserToEntity).toList());
        return entity;
    }

    private UserEntity mapUserToEntity(User user) {
        var entity = new UserEntity();
        entity.setFirstname(user.firstname());
        entity.setLastname(user.lastname());
        entity.setIdPartenaire(user.idPartenaire());
        return entity;
    }
}
