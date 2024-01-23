import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> listOfProductsForSale = new ArrayList<>();
    private static ArrayList<OrderItem> order = new ArrayList<>();

    public static void main(String[] args) {

        ProductForSale coffee1 = new Coffee("Flat white", 5.45d, "a nice coffee");
        ProductForSale coffee2 = new Coffee("Americano", 4.55d, "a nice coffee");
        ProductForSale cookie1 = new Cookie("Chocolate Chip", 3.20d, "very sweet");
        ProductForSale cookie2 = new Cookie("White Choc Chip", 4.00d, "tasty");

        addProductForSale(coffee1);
        addProductForSale(coffee1);
        displayProductDetails(coffee1);
        addItemToOrder(new OrderItem(1, coffee1));
        addItemToOrder(new OrderItem(1, coffee2));
        addItemToOrder(new OrderItem(2, cookie1));
        addItemToOrder(new OrderItem(10, cookie2));

        printOrderedItems();

    }

    public static void addProductForSale(ProductForSale productForSale) {
        if (productForSale != null) {
            if (findProductForSale(productForSale)) {
                System.out.printf("=> Product %S of type %S NOT added to the list of Products for Sale. \n", productForSale.getClass().getSimpleName(), productForSale.getType());
            } else {
                listOfProductsForSale.add(productForSale);
                System.out.printf("=> Successfully added %S of type %S to list of Products for Sale. \n", productForSale.getClass().getSimpleName(), productForSale.getType());
            }
        }
    }

    private static boolean findProductForSale(ProductForSale productForSale) {
        System.out.printf("=> Searching for %S of type %S in the list of Products for Sale... \n", productForSale.getClass().getSimpleName(), productForSale.getType());
        if (productForSale != null) {
            for (ProductForSale currentProductForSale : listOfProductsForSale) {
                if ((currentProductForSale.getPrice() == productForSale.getPrice()) && currentProductForSale.getType().equals(productForSale.getType())) {
                    System.out.printf("=> %S of type %S was found in the list of Products for Sale. \n", productForSale.getClass().getSimpleName(), productForSale.getType());
                    return true;
                }
            }
        }
        System.out.printf("=> %S of type %S was NOT found in the list of Products for Sale. \n", productForSale.getClass().getSimpleName(), productForSale.getType());
        return false;
    }

    public static void displayProductDetails(ProductForSale productForSale) {
        if (findProductForSale(productForSale)) {
            System.out.print(productForSale.showDetails() + "\n");
        }
    }

    public static void addItemToOrder(OrderItem orderItem) {
        if (orderItem != null) {
            order.add(orderItem);
        }
    }

    public static void printOrderedItems() {
        double subTotal = 0.0d;
        System.out.print("Ordered items \n".toUpperCase() + "=".repeat(90));
        for (OrderItem orderedItem : order) {
            System.out.printf("\nName: %-50s || Qty: %2s || Total: $%10.2f", orderedItem.getProductForSale().showDetails(), orderedItem.getQuantity(), orderedItem.getProductForSale().getSalesPrice(orderedItem.getQuantity()));
            subTotal += orderedItem.getProductForSale().getSalesPrice(orderedItem.getQuantity());
        }
        System.out.print("\n" + "=".repeat(90) + String.format("\nSub Total: $%18.2f", subTotal));
    }
}