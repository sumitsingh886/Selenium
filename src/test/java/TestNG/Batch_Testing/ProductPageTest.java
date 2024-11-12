package TestNG.Batch_Testing;

import org.testng.annotations.Test;

public class ProductPageTest {
    @Test
    public void addProductToWishList(){
        System.out.println("Add Product To Wishlist Passed");
    }
    @Test
    public void addProductToCart(){
        System.out.println("Add Product To Cart Passed");
    }
    @Test
    public void selectQuantity(){
        System.out.println("Select Quantity Passed");
    }
}
