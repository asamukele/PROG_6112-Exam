/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Product {
    // 2D array: 3 products, 3 months
    private int[][] salesData; 
    private String[] productNames;

    public Product(int[][] salesData, String[] productNames) {
        this.salesData = salesData;
        this.productNames = productNames;
    }

    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        // There are 3 products, so average per product is total / 3
        return (double) total / salesData.length; 
    }

    public String GetMostPopularProduct() {
        int maxSales = 0;
        String popularProduct = "";
        
        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j]; // Sum sales for this specific product
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                popularProduct = productNames[i] + " (" + maxSales + ")";
            }
        }
        return popularProduct;
    }
}
    

