package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidatorResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidatorResult>
{

    static CustomerRegistrationValidator isEmailValid()
    {
        System.out.println("Running email validation...");
        return customer -> customer.getEmail().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneValid()
    {
        return customer -> customer.getPhoneNumber().startsWith("+234") ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAnAdult()
    {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }
    // This is where the magic happens in combinator-pattern :-
    // Create more logic to your method in your interface and add it to where you invoke them in your Main()
    default CustomerRegistrationValidator and (CustomerRegistrationValidator other)
    {
        return customer -> {
            ValidatorResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;

        };
    }



    enum ValidatorResult
    {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT

    }

}
