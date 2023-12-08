package razvanghr.RESTapiConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import razvanghr.RESTapiConsumer.model.UserType;

public interface UserTypeRepository extends JpaRepository<UserType , Long> {
}
