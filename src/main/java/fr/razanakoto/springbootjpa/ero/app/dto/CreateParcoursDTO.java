package fr.razanakoto.springbootjpa.ero.app.dto;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class CreateParcoursDTO {

    @NotEmpty
    private String idParcours;
    @NotEmpty
    private List<UserDTO> userList;

    @NotEmpty
    private String name;

    public String getIdParcours() {
        return idParcours;
    }

    public void setIdParcours(String idParcours) {
        this.idParcours = idParcours;
    }

    public List<UserDTO> getUserList() {
        return userList;
    }

    public void setUserList(List<UserDTO> userList) {
        this.userList = userList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
