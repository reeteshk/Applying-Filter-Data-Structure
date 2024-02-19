public class FilterCriteria {
    private String category;
    private Double minPrice;
    private Double maxPrice;
    private Double minRating;

    // Constructor
    public FilterCriteria(String category, Double minPrice, Double maxPrice, Double minRating) {
        this.category = category;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.minRating = minRating;
    }

    // Getters
    public String getCategory() { return category; }
    public Double getMinPrice() { return minPrice; }
    public Double getMaxPrice() { return maxPrice; }
    public Double getMinRating() { return minRating; }
    
    // Assume setters for each field are here as well
}
