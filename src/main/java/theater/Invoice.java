package theater;

import java.util.List;

/**
 * Class representing an invoice for a customer.
 */
public class Invoice {

    private final String customer;
    private final List<Performance> performances;

    /**
     * Creates a new invoice.
     *
     * @param customer name of the customer
     * @param performances performances included in the invoice
     */
    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    /**
     * Returns the customer name.
     *
     * @return the customer name
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Returns a list of performances.
     *
     * @return the list of performances
     */
    public List<Performance> getPerformances() {
        return performances;
    }
}
