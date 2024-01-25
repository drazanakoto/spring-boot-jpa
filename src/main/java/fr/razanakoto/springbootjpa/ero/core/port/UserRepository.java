package fr.razanakoto.springbootjpa.ero.core.port;

import fr.razanakoto.springbootjpa.ero.core.model.User;

public interface UserRepository {
    void save(User user);
}
