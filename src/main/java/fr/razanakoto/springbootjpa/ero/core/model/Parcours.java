package fr.razanakoto.springbootjpa.ero.core.model;

import java.util.List;

public record Parcours(String idParcours, String name, List<User> userList) {
}
