public class Product {
    String name;
    double prize;
    String description;
    Category category;

    Product(String n, int p, String d, Category c) {
        name = n;
        prize = p;
        description = d;
        category = c;
    }

    void showInfo() {
        System.out.println("Nazwa produktu: " + name + " Cena: " + prize + " Opis produktu: " + description + " Kategoria: " + category.name);
    }

    void showInfoWithoutCategory() {
        System.out.println("Nazwa produktu: " + name + " Cena: " + prize + " Opis produktu: " + description);
    }
}
