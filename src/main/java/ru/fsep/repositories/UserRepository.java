package ru.fsep.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.fsep.models.User;

/**
 * 07.08.2017
 *
 * @author Robert Bagramov.
 */
public interface UserRepository extends MongoRepository<User, Long> {
    User getUserById(Long id);
}
