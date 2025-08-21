package Z_Pattern1.Builder_Pattern.v1;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Product {

    private Long id;
    private String name;
    private String description;
    private String brand;
    private String category;
    private String Stock_Kepping_it;
    private Double price;
    private Double discount;
    private Double finalPrice;
    private String currency;
    private Double tax;
    private Integer quantityAvailable;
    private Boolean isAvailable;
    private String warehouseLocation;
    private Integer reorderLevel;
    private List<String> images;
    private String thumbnail;
    private String videoUrl;
    private List<String> colorOptions;
    private List<String> sizeOptions;
    private Double rating;
    private Integer reviewCount;
    private List<String> tags;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String addedBy;
    private Double weight;
    private String dimensions; // e.g., "10x5x2 cm"
    private Double shippingCost;
    private String deliveryTime;
    private Boolean isReturnable;
    private String modelNumber;
    private String warrantyPeriod;
    private String powerConsumption;
    private String material;
    private Map<String, String> customAttributes;


    public static class ProductBuilder {
        private Long id;
        private String name;
        private String description;
        private String brand;
        private String category;
        private String Stock_Kepping_it;
        private Double price;
        private Double discount;
        private Double finalPrice;
        private String currency;
        private Double tax;
        private Integer quantityAvailable;
        private Boolean isAvailable;
        private String warehouseLocation;
        private Integer reorderLevel;
        private List<String> images;
        private String thumbnail;
        private String videoUrl;
        private List<String> colorOptions;
        private List<String> sizeOptions;
        private Double rating;
        private Integer reviewCount;
        private List<String> tags;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String addedBy;
        private Double weight;
        private String dimensions; // e.g., "10x5x2 cm"
        private Double shippingCost;
        private String deliveryTime;
        private Boolean isReturnable;
        private String modelNumber;
        private String warrantyPeriod;
        private String powerConsumption;
        private String material;
        private Map<String, String> customAttributes;

        public ProductBuilder() {
        }

        public Product builder() {
            return new Product(this);
        }

        public ProductBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setStock_Kepping_it(String stock_Kepping_it) {
            Stock_Kepping_it = stock_Kepping_it;
            return this;
        }

        public ProductBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder setDiscount(Double discount) {
            this.discount = discount;
            return this;
        }

        public ProductBuilder setFinalPrice(Double finalPrice) {
            this.finalPrice = finalPrice;
            return this;
        }

        public ProductBuilder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public ProductBuilder setTax(Double tax) {
            this.tax = tax;
            return this;
        }

        public ProductBuilder setQuantityAvailable(Integer quantityAvailable) {
            this.quantityAvailable = quantityAvailable;
            return this;
        }

        public ProductBuilder setAvailable(Boolean available) {
            isAvailable = available;
            return this;
        }

        public ProductBuilder setWarehouseLocation(String warehouseLocation) {
            this.warehouseLocation = warehouseLocation;
            return this;
        }

        public ProductBuilder setReorderLevel(Integer reorderLevel) {
            this.reorderLevel = reorderLevel;
            return this;
        }

        public ProductBuilder setImages(List<String> images) {
            this.images = images;
            return this;
        }

        public ProductBuilder setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public ProductBuilder setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }

        public ProductBuilder setColorOptions(List<String> colorOptions) {
            this.colorOptions = colorOptions;
            return this;
        }

        public ProductBuilder setSizeOptions(List<String> sizeOptions) {
            this.sizeOptions = sizeOptions;
            return this;
        }

        public ProductBuilder setRating(Double rating) {
            this.rating = rating;
            return this;
        }

        public ProductBuilder setReviewCount(Integer reviewCount) {
            this.reviewCount = reviewCount;
            return this;
        }

        public ProductBuilder setTags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        public ProductBuilder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public ProductBuilder setUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public ProductBuilder setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public ProductBuilder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        public ProductBuilder setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public ProductBuilder setShippingCost(Double shippingCost) {
            this.shippingCost = shippingCost;
            return this;
        }

        public ProductBuilder setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }

        public ProductBuilder setReturnable(Boolean returnable) {
            isReturnable = returnable;
            return this;
        }

        public ProductBuilder setModelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
            return this;
        }

        public ProductBuilder setWarrantyPeriod(String warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
            return this;
        }

        public ProductBuilder setPowerConsumption(String powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public ProductBuilder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public ProductBuilder setCustomAttributes(Map<String, String> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getBrand() {
            return brand;
        }

        public String getCategory() {
            return category;
        }

        public String getStock_Kepping_it() {
            return Stock_Kepping_it;
        }

        public Double getPrice() {
            return price;
        }

        public Double getDiscount() {
            return discount;
        }

        public Double getFinalPrice() {
            return finalPrice;
        }

        public String getCurrency() {
            return currency;
        }

        public Double getTax() {
            return tax;
        }

        public Integer getQuantityAvailable() {
            return quantityAvailable;
        }

        public Boolean getAvailable() {
            return isAvailable;
        }

        public String getWarehouseLocation() {
            return warehouseLocation;
        }

        public Integer getReorderLevel() {
            return reorderLevel;
        }

        public List<String> getImages() {
            return images;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public List<String> getColorOptions() {
            return colorOptions;
        }

        public List<String> getSizeOptions() {
            return sizeOptions;
        }

        public Double getRating() {
            return rating;
        }

        public Integer getReviewCount() {
            return reviewCount;
        }

        public List<String> getTags() {
            return tags;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public LocalDateTime getUpdatedAt() {
            return updatedAt;
        }

        public String getAddedBy() {
            return addedBy;
        }

        public Double getWeight() {
            return weight;
        }

        public String getDimensions() {
            return dimensions;
        }

        public Double getShippingCost() {
            return shippingCost;
        }

        public String getDeliveryTime() {
            return deliveryTime;
        }

        public Boolean getReturnable() {
            return isReturnable;
        }

        public String getModelNumber() {
            return modelNumber;
        }

        public String getWarrantyPeriod() {
            return warrantyPeriod;
        }

        public String getPowerConsumption() {
            return powerConsumption;
        }

        public String getMaterial() {
            return material;
        }

        public Map<String, String> getCustomAttributes() {
            return customAttributes;
        }
    }

    private Product(ProductBuilder b) {
        if (b.getPrice() > 0) {
            this.price = b.getPrice();
        }
        this.id = b.getId();
        this.name = b.getName();
        this.description = b.getDescription();
        this.brand = b.getBrand();
        this.category = b.getCategory();
        this.Stock_Kepping_it = b.getStock_Kepping_it();
        this.price = b.getPrice();
        this.discount = b.getDiscount();
        this.finalPrice = b.getFinalPrice();
        this.currency = b.getCurrency();
        this.tax = b.getTax();
        this.quantityAvailable = b.getQuantityAvailable();
        this.isAvailable = b.getAvailable();
        this.warehouseLocation = b.getWarehouseLocation();
        this.reorderLevel = b.getReorderLevel();
        this.images = b.getImages();
        this.thumbnail = b.getThumbnail();
        this.videoUrl = b.getVideoUrl();
        this.colorOptions = b.getColorOptions();
        this.sizeOptions = b.getSizeOptions();
        this.rating = b.getRating();
        this.reviewCount = b.getReviewCount();
        this.tags = b.getTags();
        this.createdAt = b.getCreatedAt();
        this.updatedAt = b.getUpdatedAt();
        this.addedBy = b.getAddedBy();
        this.weight = b.getWeight();
        this.dimensions = b.getDimensions();
        this.shippingCost = b.getShippingCost();
        this.deliveryTime = b.getDeliveryTime();
        this.isReturnable = b.getReturnable();
        this.modelNumber = b.getModelNumber();
        this.warrantyPeriod = b.getWarrantyPeriod();
        this.powerConsumption = b.getPowerConsumption();
        this.material = b.getMaterial();
        this.customAttributes = b.getCustomAttributes();
    }

    @Override
    public String toString() {
        return "Product{" +
                " \n id=" + id +
                ",\n name='" + name + '\'' +
                ",\n description='" + description + '\'' +
                ",\n brand='" + brand + '\'' +
                ",\n category='" + category + '\'' +
                ",\n Stock_Keeping_it='" + Stock_Kepping_it + '\'' +
                ",\n price=" + price +
                ",\n discount=" + discount +
                ",\n finalPrice=" + finalPrice +
                ",\n currency='" + currency + '\'' +
                ",\n tax=" + tax +
                ",\n quantityAvailable=" + quantityAvailable +
                ",\n isAvailable=" + isAvailable +
                ",\n warehouseLocation='" + warehouseLocation + '\'' +
                ",\n reorderLevel=" + reorderLevel +
                ",\n images=" + images +
                ",\n thumbnail='" + thumbnail + '\'' +
                ",\n videoUrl='" + videoUrl + '\'' +
                ",\n colorOptions=" + colorOptions +
                ",\n sizeOptions=" + sizeOptions +
                ",\n rating=" + rating +
                ",\n reviewCount=" + reviewCount +
                ",\n tags=" + tags +
                ",\n createdAt=" + createdAt +
                ",\n updatedAt=" + updatedAt +
                ",\n addedBy='" + addedBy + '\'' +
                ",\n weight=" + weight +
                ",\n dimensions='" + dimensions + '\'' +
                ",\n shippingCost=" + shippingCost +
                ",\n deliveryTime='" + deliveryTime + '\'' +
                ",\n isReturnable=" + isReturnable +
                ",\n modelNumber='" + modelNumber + '\'' +
                ",\n warrantyPeriod='" + warrantyPeriod + '\'' +
                ",\n powerConsumption='" + powerConsumption + '\'' +
                ",\n material='" + material + '\'' +
                ",\n customAttributes=" + customAttributes +
                '}';
    }

    public static ProductBuilder getBuilder() {
        return new ProductBuilder();
    }


}
