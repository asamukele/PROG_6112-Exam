/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class ProductCalculationsTest {
    


    // ... (You can leave the empty setUp and tearDown methods if you want) ...

    // TODO add test methods here.
 // TODO add test methods here.
    
    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        // 1. Set up the test data
        double testPrice = 3500.0;
        
        // 2. Create the object using your class
        ProductCalculations calc = new ProductCalculations(testPrice);
        
        // 3. Check if the result matches what we expect (3500 * 0.15 = 525.0)
        assertEquals(525.0, calc.GetVat(), 0.001);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        // 1. Set up the test data
        double testPrice = 3500.0;
        
        // 2. Create the object
        ProductCalculations calc = new ProductCalculations(testPrice);
        
        // 3. Check the total (3500 + 525 + 175 = 4200.0)
        assertEquals(4200.0, calc.GetTotal(), 0.001);
    }
    
} // This final curly brace closes the public class ProductCalculationsTest
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

