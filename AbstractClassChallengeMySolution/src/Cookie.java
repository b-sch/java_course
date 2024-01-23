public class Cookie extends ProductForSale{
    public Cookie(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public String showDetails() {
        return String.format("%20s | $%10s | %s", super.getType(), super.getPrice(), super.getDescription());
    }
}
