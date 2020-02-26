package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main
{
    public static void main(String[] args)
    {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+23470657382",
                LocalDate.of(2000,1,1)
        );

        //System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db

        //Using combinator-pattern
        ValidatorResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAnAdult())
                .apply(customer);
        System.out.println(result);

       if (result != ValidatorResult.SUCCESS)
        {
            throw new IllegalStateException(result.name());
        }

    }
}
