mport java.util.ArrayList;

class ProductBasket { 
 //attributes to store the list of products 
 private ArrayList<Product> productList = new ArrayList<>(); 
 public ArrayList<Product> getProductList() { 
 return productList; 
 } 
 public void setProductList(ArrayList<Product> productList) { 
 this.productList = productList; 
 } 
 public void addProducts(Product product){ 
 productList.add(product); 
 } 
 //method to check of the two product basket are equal 
 public boolean duplicateBasket(ProductBasket productBasket2){ 
 return this.productList.equals(productBasket2.getProductList()); 
 }
 } 
import java.util.ArrayList; 
class ProductBasket { 
 //attributes to store the list of products 
 private ArrayList<Product> productList = new ArrayList<>(); 
 public ArrayList<Product> getProductList() { 
 return productList; 
 } 
 public void setProductList(ArrayList<Product> productList) { 
 this.productList = productList; 
 } 
 public void addProducts(Product product){ 
 productList.add(product); 
 } 
 //method to check of the two product basket are equal 
 public boolean duplicateBasket(ProductBasket productBasket2){ 
 return this.productList.equals(productBasket2.getProductList()); 
 } 
} 
class CloneTest { 
 public static void main(String[] args) { 
 //create products 
 Product product1 = new Product("Watch",50,2.5f); 
 Product product2 = new Product("Lamp",100,3.4f); 
 Product product3 = new Product("Teddy",45,3.4f); 
 Product product4 = new Product("Frame",67,5.6f); 
 //create object for product basket 
 ProductBasket productBasket1 = new ProductBasket(); 
 productBasket1.addProducts(product1); 
 productBasket1.addProducts(product2); 
 ProductBasket productBasket2 = new ProductBasket(); 
 productBasket2.addProducts(product1); 
 productBasket2.addProducts(product2); 
 //check if two product basket are equal 
 System.out.println(productBasket1.duplicateBasket(productBasket2)); 
 //create another basked with different products 
 ProductBasket productBasket3 = new ProductBasket(); 
 productBasket3.addProducts(product3); 
 productBasket3.addProducts(product4); 
 //check if two product basket are equal 
 System.out.println(productBasket1.duplicateBasket(productBasket3)); 
 } 
} 
import java.util.ArrayList;
class ProductBasket { 
 //attributes to store the list of products 
 private ArrayList<Product> productList = new ArrayList<>(); 
 public ArrayList<Product> getProductList() { 
 return productList; 
 } 
 public void setProductList(ArrayList<Product> productList) { 
 this.productList = productList; 
 } 
 public void addProducts(Product product){ 
 productList.add(product); 
 } 
 //method to check of the two product basket are equal 
 public boolean duplicateBasket(ProductBasket productBasket2){ 
 return this.productList.equals(productBasket2.getProductList()); 
 } 
} 
public class Product { 
 private String name; 
 private int price; 
 private double discount; 
 public Product(String name, int price, double discount) { 
 this.name = name; 
 this.price = price; 
 this.discount = discount; 
 } 
 //method for the getter and setter for the attributes 
 public String getName() { 
 return name; 
 } 
 public void setName(String name) { 
 this.name = name; 
 } 
 public int getPrice() {
 return price;
 } 
 public void setPrice(int price) { 
 this.price = price; 
 } 
 public double getDiscount() { 
 return discount; 
 } 
 public void setDiscount(double discount) { 
 this.discount = discount; 
 } 
}