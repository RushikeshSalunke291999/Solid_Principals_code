package Pattern1.v1;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .setId(1001L)
                .setName("Smartphone X1")
                .setDescription("Flagship-level smartphone with AMOLED display and 5G.")
                .setBrand("Acme")
                .setCategory("Electronics")
                .setStock_Kepping_it("SKU-X1-BLK-128")
                .setPrice(49999.0)
                .setDiscount(0.10)
                .setTax(0.18)
                .setFinalPrice(49999.0 * (1 - 0.10) * (1 + 0.18))
                .setCurrency("INR")
                .setQuantityAvailable(150)
                .setAvailable(true)
                .setWarehouseLocation("Mumbai-01")
                .setReorderLevel(25)
                .setImages(Arrays.asList(
                        "https://cdn.example.com/products/x1/img1.jpg",
                        "https://cdn.example.com/products/x1/img2.jpg"
                ))
                .setThumbnail("https://cdn.example.com/products/x1/thumb.jpg")
                .setVideoUrl("https://youtu.be/demo-x1")
                .setColorOptions(Arrays.asList("Black", "Blue"))
                .setSizeOptions(Arrays.asList("128GB", "256GB"))
                .setRating(4.5)
                .setReviewCount(1275)
                .setTags(Arrays.asList("smartphone", "android", "5g"))
                .setCreatedAt(LocalDateTime.now().minusDays(3))
                .setUpdatedAt(LocalDateTime.now())
                .setAddedBy("Rushikesh")
                .setWeight(0.185)// kg
                .setDimensions("15.1x7.2x0.8 cm")
                .setShippingCost(149.0)
                .setDeliveryTime("2-4 business days")
                .setReturnable(true)
                .setModelNumber("X1-2025")
                .setWarrantyPeriod("12 months")
                .setPowerConsumption("18W fast charge")
                .setMaterial("Aluminum, Glass")
                .setCustomAttributes(Map.of(
                        "Battery", "5000mAh",
                        "OS", "Android 14",
                        "Connectivity", "5G, Wi‑Fi 6",
                        "InBox", "Charger, Cable, Case"
                )).builder();

        System.out.println(p.toString());
    }
}