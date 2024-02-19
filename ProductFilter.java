import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {
    
    public static List<Product> filterProducts(List<Product> products, FilterCriteria criteria) {
        return products.stream()
            .filter(product -> criteria.getCategory() == null || product.getCategory().equals(criteria.getCategory()))
            .filter(product -> criteria.getMinPrice() == null || product.getPrice() >= criteria.getMinPrice())
            .filter(product -> criteria.getMaxPrice() == null || product.getPrice() <= criteria.getMaxPrice())
            .filter(product -> criteria.getMinRating() == null || product.getRating() >= criteria.getMinRating())
            .collect(Collectors.toList());
    }
    
    // Main method for demonstration
    public static void main(String[] args) {
        List<Product> productList = List.of(
            new Product("Laptop", "Electronics", 999.99, 4.5),
            new Product("Smartphone", "Electronics", 499.99, 4.0),
            new Product("Coffee Maker", "Home Appliances", 99.99, 4.7),
            new Product("Blender", "Home Appliances", 29.99, 3.8)
        );

        FilterCriteria criteria = new FilterCriteria("Electronics", 100.00, 1000.00, 4.0);
        List<Product> filteredProducts = filterProducts(productList, criteria);

        filteredProducts.forEach(System.out::println);
    }
}
 
