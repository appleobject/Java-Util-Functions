package functionalinterface;

import java.util.function.Predicate;

public class _Predicate
{
    public static void main(String[] args)
    {
        System.out.println("Without Predicate...");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("090000000000"));
        System.out.println("With Predicate functional interface...");
        System.out.println(isPhoneNumberValidPredicate.test("070000000001"));
        System.out.println(isPhoneNumberValidPredicate.test("070000000001"));

    }

    static boolean isPhoneNumberValid(String phoneNumber)
    {
        return  phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    }

    // Predicate functional interface
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->

        phoneNumber.startsWith("07") && phoneNumber.length() == 11;

}
