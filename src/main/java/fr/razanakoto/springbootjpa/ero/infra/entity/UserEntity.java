package fr.razanakoto.springbootjpa.ero.infra.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tusers")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_partenaire")
    private String idPartenaire;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @ManyToMany(mappedBy = "userList", cascade = CascadeType.PERSIST)
    private List<ParcoursEntity> parcoursList;

    public String getIdPartenaire() {
        return idPartenaire;
    }

    public void setIdPartenaire(String idPart) {
        this.idPartenaire = idPart;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<ParcoursEntity> getParcoursList() {
        return parcoursList;
    }

    public void setParcoursList(List<ParcoursEntity> parcoursList) {
        this.parcoursList = parcoursList;
    }
}
