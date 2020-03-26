package ouc.isclab.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ouc.isclab.microservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
