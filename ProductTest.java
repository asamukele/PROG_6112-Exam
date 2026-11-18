/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        String[] names = {"Product A", "Product B", "Product C"};
        Product p = new Product(sales, names);
        
        assertEquals(153, p.GetTotalProductsSold());
    }
    
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
        String[] names = {"Product A", "Product B", "Product C"};
        Product p = new Product(sales, names);
        
        assertEquals(51.0, p.GetAverageProductSold(), 0.001);
    }
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

