package codeLens.backend.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import codeLens.backend.entity.User;
public interface userRepository extends JpaRepository<User, UUID> {
    Optional<User> findByGithubId(Long githubId);
}
