package razvanghr.RESTapiConsumer.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import razvanghr.RESTapiConsumer.service.ProductService;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveData(){
       try{
           productService.saveToDb();
           return ResponseEntity.ok().body("Saved to database");
       }catch (Exception ex){
           return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
       }
    }
}
