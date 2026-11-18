/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class PrintProduct { 
    public void PrintReport(Product product) {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*******************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
        // Cast to int to match screenshot
        System.out.println("AVERAGE PRODUCT SALES: " + (int)product.GetAverageProductSold()); 
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
    

