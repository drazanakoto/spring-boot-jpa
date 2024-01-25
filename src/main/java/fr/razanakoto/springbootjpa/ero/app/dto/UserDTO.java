package fr.razanakoto.springbootjpa.ero.app.dto;

import jakarta.validation.constraints.NotEmpty;

public class UserDTO {

    @NotEmpty
    private String idPartenaire;
    @NotEmpty
    private String firstname;
    @NotEmpty
    private String lastname;

    public String getIdPartenaire() {
        return idPartenaire;
    }

    public void setIdPartenaire(String idPartenaire) {
        this.idPartenaire = idPartenaire;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
