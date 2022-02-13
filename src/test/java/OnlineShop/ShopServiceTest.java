package OnlineShop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void addItem_and_printList() {
        // given
        ProductRepo produktliste = new ProductRepo();
        Product mouse = new Product(1, "Maus");
        Product cable = new Product(2, "Kabel");
        produktliste.add(mouse);
        produktliste.add(cable);
        // when
        String result = produktliste.handOut(produktliste);
        //then
        Assertions.assertEquals("Liste der Artikel: Maus (Artikelnr. 1), Kabel (Artikelnr. 2), ", result);
    }

    @Test
    void addItem_and_printList_of_ProductsWithNoId() {
        // given
        ProductRepo produktliste = new ProductRepo();
        Product mouse = new Product("Maus");
        Product cable = new Product("Kabel");
        produktliste.add(mouse);
        produktliste.add(cable);
        // when
        String result = produktliste.handOut(produktliste);
        //then
        Assertions.assertEquals("Liste der Artikel: Maus (Artikelnr. 0), Kabel (Artikelnr. 0), ", result);
    }

    @Test
    void deleteItemInProductList() {
        // given
        ProductRepo produktliste = new ProductRepo();
        Product mouse = new Product(1, "Maus");
        Product cable = new Product(2,"Kabel");
        Product smartphone = new Product(3,"Smartphone");
        produktliste.add(mouse);
        produktliste.add(cable);
        produktliste.add(smartphone);
        produktliste.delete(smartphone);
        // when
        String result = produktliste.handOut(produktliste);
        //then
        Assertions.assertEquals("Liste der Artikel: Maus (Artikelnr. 1), Kabel (Artikelnr. 2), ", result);
    }

    @Test
    void deleteFirstIteminProductList() {
        // given
        ProductRepo produktliste = new ProductRepo();
        Product mouse = new Product(1, "Maus");
        Product cable = new Product(2,"Kabel");
        Product smartphone = new Product(3,"Smartphone");
        Product tablet = new Product(7,"Tablet");
        produktliste.add(mouse);
        produktliste.add(cable);
        produktliste.add(smartphone);
        produktliste.add(tablet);
        produktliste.delete(mouse);
        // when
        String result = produktliste.handOut(produktliste);
        //then
        Assertions.assertEquals("Liste der Artikel: Kabel (Artikelnr. 2), Smartphone (Artikelnr. 3), Tablet (Artikelnr. 7), ", result);
    }

    @Test
    void deleteLastIteminProductList() {
        // given
        ProductRepo produktliste = new ProductRepo();
        Product mouse = new Product(1, "Maus");
        Product cable = new Product(2,"Kabel");
        Product smartphone = new Product(3,"Smartphone");
        Product tablet = new Product(7,"Tablet");
        produktliste.add(mouse);
        produktliste.add(cable);
        produktliste.add(tablet);
        produktliste.add(smartphone);
        produktliste.delete(smartphone);
        // when
        String result = produktliste.handOut(produktliste);
        //then
        Assertions.assertEquals("Liste der Artikel: Maus (Artikelnr. 1), Kabel (Artikelnr. 2), Tablet (Artikelnr. 7), ", result);
    }



    @Test
    void printEmptyList() {
        // given
        ProductRepo produktliste = new ProductRepo();
        // when
        String result = produktliste.handOut(produktliste);
        //then
        Assertions.assertEquals("Liste der Artikel: ", result);
    }


/*
    Dieser Test macht erst Sinn, wenn sich die Länge der Liste über eine Variable steuern lässt...
    @Test
    void listGettingTooLong() {
        // given
        ProductRepo produktliste = new ProductRepo();
        Product mouse = new Product("Maus", 1);
        Product cable = new Product("Kabel", 2);
        Product smartphone = new Product( "Smartphone", 3);
        Product lightbulb = new Product("Birne", 4);
        produktliste.add(mouse);
        produktliste.add(cable);
        produktliste.add(smartphone);
        produktliste.add(lightbulb);
        // when
        String result = produktliste.handOut(produktliste);
        //then
        Assertions.assertEquals("Liste der Artikel: Maus, Kabel, Smartphone, ", result);
    }
*/


    @Test
    // Ich kriege einen AssertionFailed-Fehler, weil sich die Datentypen unterscheiden!?
    void handInOrderWithThreeItems() {
        // given
        String orderId = "Bestellung Nr. 001";
        Product eraser = new Product(47,"Radiergummi");
        Product pencil = new Product(55, "Bleistift");
        Product marker = new Product(13, "Marker");
        Product[] products = {eraser, pencil, marker};
        // when
        Order firstOrder = new Order(orderId, products);
        // String firstOrderCasted = (String) firstOrder; -- klappt leider nicht!?
        // then
       Assertions.assertEquals("Bestellung Nr. 001: Radiergummi (Artikelnr. 47), Bleistift (Artikelnr. 55), Marker (Artikelnr. 13), ", firstOrder);

    }

    @Test
    void showOrders() {
        // given
        OrderRepo orderList = new OrderRepo();
        String orderId = "Bestellung Nr. 003";
        Product eraser = new Product(47,"Radiergummi");
        Product pencil = new Product(55, "Bleistift");
        Product marker = new Product(13, "Marker");
        Product[] products = {eraser, pencil, marker};
        Order firstOrder = new Order(orderId, products);

        String orderId2 = "Bestellung Nr. 005";
        Product batchOfPaper = new Product(17,"Papier");
        Product ruler = new Product(18, "Linear");
        Product postIts = new Product(19, "PostIts");
        Product[] products2 = {batchOfPaper, ruler, postIts, eraser};
        Order secondOrder = new Order(orderId2, products2);
        // when
        orderList.add(firstOrder);
        orderList.add(secondOrder);
        // then
        // Hi André: an dieser Aufgabe hänge ich fürs Erste noch fest: alle Bestellung ausgeben lassen. Für heute ist aber fertig.
        System.out.println(orderList);
    }
}