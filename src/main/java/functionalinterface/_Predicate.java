package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate...");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("090000000000"));
        System.out.println("With Predicate functional interface...");
        System.out.println(isPhoneNumberValidPredicate.test("070000000001"));
        System.out.println(isPhoneNumberValidPredicate.test("070000000001"));
        // Chaining Predicate 
        System.out.println(
                "is the phone number valid and contains number 3 " +
                isPhoneNumberValidPredicate.or(isPhoneNumber5).test("0700000000787")
        );



    }
    // Normal java function
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    }

    // Predicate functional interface
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> isPhoneNumber3 = phoneNumberOne-> phoneNumberOne.contains("3");

    static Predicate<String> isPhoneNumber5 = phoneNumberFive -> phoneNumberFive.contains("5");

}