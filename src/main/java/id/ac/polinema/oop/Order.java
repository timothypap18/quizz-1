package id.ac.polinema.oop;

public class Order {
    private Customer customer;
    private OrderItem[] items;
    private int itemCount;


    private static final int MAX_ITEMS = 10;

    
     @param customer pelanggan yang membuat pesanan
     
    public Order(Customer customer) {
        this.customer = customer;
        this.items = new OrderItem[MAX_ITEMS];
        this.itemCount = 0;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    
     *
     * @param item     menu yang dipesan
     * @param quantity jumlah pesanan
     */
    public void addItem(MenuItem item, int quantity) {
        if (item != null && quantity > 0 && itemCount < items.length) {
            this.items[itemCount] = new OrderItem(item, quantity);
            this.itemCount++;
        }
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i] != null) {
                total += items[i].getSubtotal();
            }
        }
        return total;
    }

    public double getFinalTotal() {
        return getTotal();
    }
}