package razvanghr.RESTapiConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import razvanghr.RESTapiConsumer.model.Product;

public interface ProductRepository extends JpaRepository<Product , Long> {

}
