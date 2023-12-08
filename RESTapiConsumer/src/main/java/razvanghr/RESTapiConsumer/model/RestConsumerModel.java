package razvanghr.RESTapiConsumer.model;

import java.util.List;

public class RestConsumerModel {
   private int responseCode;
   private List<Product> products;

    public RestConsumerModel() {
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
