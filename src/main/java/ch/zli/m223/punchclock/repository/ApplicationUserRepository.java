package ch.zli.m223.punchclock.repository;
//code from: https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/
import ch.zli.m223.punchclock.domain.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}