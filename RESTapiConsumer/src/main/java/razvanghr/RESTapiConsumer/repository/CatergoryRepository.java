package razvanghr.RESTapiConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import razvanghr.RESTapiConsumer.model.Category;

public interface CatergoryRepository extends JpaRepository<Category , Long> {
}
