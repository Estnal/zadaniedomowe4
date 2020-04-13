public class SpecialOffer {
    Product product;
    String offer;
    String time;
    double discount;

    SpecialOffer(Product p, String o, String t, double d) {
        product = p;
        offer = o;
        time = t;
        discount = d;
    }

    double getProductPrize() {
        return product.prize - product.prize * discount;
    }
}
