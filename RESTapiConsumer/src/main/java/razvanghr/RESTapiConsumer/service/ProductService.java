package razvanghr.RESTapiConsumer.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import razvanghr.RESTapiConsumer.exception.SomethingWentWrongException;
import razvanghr.RESTapiConsumer.model.Category;
import razvanghr.RESTapiConsumer.model.Product;
import razvanghr.RESTapiConsumer.model.RestConsumerModel;
import razvanghr.RESTapiConsumer.model.UserType;
import razvanghr.RESTapiConsumer.repository.CatergoryRepository;
import razvanghr.RESTapiConsumer.repository.ProductRepository;
import razvanghr.RESTapiConsumer.repository.UserTypeRepository;


@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CatergoryRepository catergoryRepository;
    private final UserTypeRepository userTypeRepository;



    public ProductService(ProductRepository productRepository, CatergoryRepository catergoryRepository, UserTypeRepository userTypeRepository) {
        this.productRepository = productRepository;
        this.catergoryRepository = catergoryRepository;
        this.userTypeRepository = userTypeRepository;
    }



    public void saveToDb() throws SomethingWentWrongException {
        final String URL = "https://automationexercise.com/api/productsList";
        RestTemplate restTemplate = new RestTemplate();
        RestConsumerModel restConsumerModel = new RestConsumerModel();

        restConsumerModel = restTemplate.getForObject(URL , restConsumerModel.getClass());

        if(restConsumerModel.getProducts().isEmpty() || restConsumerModel.getResponseCode() !=200){
            throw new SomethingWentWrongException("Something went wrong! Please try again later");
        }

        for(Product product : restConsumerModel.getProducts()){
            Category category = product.getCategory();
            UserType userType = category.getUsertype();

            userTypeRepository.save(userType);
            catergoryRepository.save(category);
            productRepository.save(product);
        }
    }



}
