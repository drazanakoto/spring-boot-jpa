package fr.razanakoto.springbootjpa.ero.infra.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tparc")
public class ParcoursEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_parcours")
    private String idParcours;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tusers_tparc",
            joinColumns = @JoinColumn(name = "id_tparc"),
            inverseJoinColumns = @JoinColumn(name = "id_tusers")
    )
    private List<UserEntity> userList;

    public String getIdParcours() {
        return idParcours;
    }

    public void setIdParcours(String idParcours) {
        this.idParcours = idParcours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserEntity> getUserList() {
        return userList;
    }

    public void setUserList(List<UserEntity> userList) {
        this.userList = userList;
    }
}
