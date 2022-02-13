package OnlineShop;

public class MainShop {
    public static void main(String[] args) {

        ProductRepo products = new ProductRepo();

        // Gibt dem Kunden die Meldung in der Konsole aus, dass sein Artikel gefunden wurde.
        Product paper = new Product(7,"Papier");
        products.add(paper);
        products.showProduct(paper);

        // Gibt dem Kunden die Meldung in der Konsole aus, dass sein Artikel nicht gefunden wurde.
        Product paperClip = new Product("Büroklammern");
        products.showProduct(paperClip);

        // Gibt dem Kunden in der Konsole eine Liste aller Produkte aus.
        products.add(paperClip);
        Product eraser = new Product(9, "Radiergummi");
        products.add(eraser);
        Product pencil = new Product(11, "Bleistift");
        products.add(pencil);
        Product marker = new Product(12, "Marker");
        products.add(marker);
        products.showAllProducts(products);



    }
}
