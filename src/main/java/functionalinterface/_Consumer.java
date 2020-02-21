package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer
{
    public static void main(String[] args) {
        // Normal java function. invoke
        Customer obj = new Customer("Maria", "9999");
        greetCustomer( obj);

        // Normal java function V2
        System.out.println("Normal Java function...");
        greetCustomerV2(obj,true);

        // Consumer Functional Interface. //invoke
        System.out.println( "Consumer interface....");
        customerConsumer.accept(new Customer("Adewale","4040"));

        //BiConsumer Functional Interface
        customerConsumerV2.accept(obj,false);

    }

    //BiConsumer functional interface - accept(2-arguments)

    static BiConsumer<Customer, Boolean> customerConsumerV2 = (customer, showPhoneNumber) -> {
        System.out.println(
                customer.customerName + " Thank you for " +
                        "registering with your phone number "+ (showPhoneNumber? customer.customerPhoneNumber: "****"));
    };



    //Declarative approach on Consumer Functional interface
    static Consumer<Customer> customerConsumer = customer -> {
        System.out.println(
                customer.customerName + " Thank you for " +
            "registering with your phone number "+ customer.customerPhoneNumber);
    };


    // Imperative approach
    static void greetCustomer(Customer customer)
    {
        System.out.println(
                customer.customerName +" Thank you for registering with your number :  "
                        +customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber)
    {
        System.out.println(
                customer.customerName +" Thank you for registering with your number :  "
                        +(showPhoneNumber? customer.customerPhoneNumber: "****"));
    }


    static class Customer
    {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}

