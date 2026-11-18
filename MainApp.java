/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Student
 */
public class MainApp { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1D array for names
        String[] names = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };
        
        // 2D array for sales (3 products, 3 months)
        int[][] sales = new int[3][3];

        // Input loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + names[i] + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }

        // Instantiate objects
        Product product = new Product(sales, names);
        PrintProduct printer = new PrintProduct();
        
        // Print Report
        printer.PrintReport(product);
        
        scanner.close();
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    

