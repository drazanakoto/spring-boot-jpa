package fr.razanakoto.springbootjpa.ero.app.controller;


import fr.razanakoto.springbootjpa.ero.app.dto.CreateParcoursDTO;
import fr.razanakoto.springbootjpa.ero.app.dto.UserDTO;
import fr.razanakoto.springbootjpa.ero.core.model.Parcours;
import fr.razanakoto.springbootjpa.ero.core.model.User;
import fr.razanakoto.springbootjpa.ero.core.usecases.CreateParcoursService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ParcoursController {

    @Autowired
    private CreateParcoursService service;

    @PostMapping("parcours")
    public void create(@Valid @RequestBody CreateParcoursDTO dto) {
        service.create(mapCreateParcoursDTOToParcours(dto));
    }


    private Parcours mapCreateParcoursDTOToParcours(CreateParcoursDTO dto) {
        var users = dto.getUserList()
                .stream()
                .map(this::mapUserDTOToUser)
                .toList();
        
        return new Parcours(
                dto.getIdParcours(),
                dto.getName(),
                users
        );
    }

    private User mapUserDTOToUser(UserDTO dto) {
        return new User(
                dto.getIdPartenaire(),
                dto.getFirstname(),
                dto.getLastname()
        );
    }
}
