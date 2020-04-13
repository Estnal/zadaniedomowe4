public class Main {
    public static void main(String[] args) {
        Category cat1 = new Category("Słodycze", "Coś na słodko");
        Product prod1 = new Product("Czekolada Wedel ", 10, "Dobra czekolada", cat1);
        Product prod2 = new Product("Baton Snikers", 5, "Dobry baton", cat1);

        Category cat2 = new Category("Chrupki", "Coś na przekąskę");
        Product prod3 = new Product("Chrupki Cheetos", 5, "Dobre chrupki", cat2);

        Product prod4 = new Product("Mydło", 6, "Higiena ciała", null);

        SpecialOffer sp1 = new SpecialOffer(prod1, "Czyszczenie magazynów", "Od 12.04 Do 13.04", 0.2);

        prod1.showInfo();
        prod2.showInfo();
        prod3.showInfo();
        prod4.showInfoWithoutCategory();
    }
}
