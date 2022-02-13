package OnlineShop;

import java.util.Arrays;

public class ProductRepo {

    private final int lengthProductList = 8;
    private Product[] products;

    public ProductRepo() {
        this.products = new Product[lengthProductList];
    }

    public void list(){

    }

    public void get(){

    }


    public Product[] add(Product newPro) {
        int i = 0;
        while (products[i] != null) {
            ++i;
            // exit here, if end of list is reached
            if (i == lengthProductList) {
                System.out.println("Die Liste der Artikel ist voll. Es kann kein weiterer Artikel mehr aufgenommen werden");
                return products;
            }
        }
        products[i] = newPro;
        return products;
    }

    public Product[] delete(Product deadPro) {
        int i = 0;
        while (i < lengthProductList) {
            if (products[i] == deadPro) {
                products[i] = null;
                return products;}
            ++i;}
        return products;
    }

    // Shows an item in console
    public void showProduct(Product productToShow) {
        for (int i = 0; i < lengthProductList; i++) {
            if (productToShow == products[i]) {
                System.out.println("\nArtikel " + products[i] + " wurde gefunden.");
                break;
            } else if (i == lengthProductList - 1) {
                System.out.println("\nArtikel " + productToShow + " wurde in der Produktliste nicht gefunden.");
            }
        }
    }
    // Lists all items in console
    public void showAllProducts(ProductRepo xy) {
        System.out.println("\r\nDie Liste lautet:");
        for (int i = 0; i < products.length; i++)
            if (products[i] != null) {
                System.out.println(products[i]);
            }
    }

    // Feeds list of items into a variable
    public String handOut(ProductRepo xy) {
        String result = "Liste der Artikel: ";
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                result += (products[i] + ", ");
            }
        }
        return result;
    }


    @Override
    public String toString() {
        return Arrays.toString(products);
    }
}

