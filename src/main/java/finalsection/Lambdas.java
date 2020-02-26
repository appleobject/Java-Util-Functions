package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas
{
    public static void main(String[] args)
    {
        BiFunction<String,Integer, String> upperCaseName = (name, age)-> {
            //logic
            if (name.isBlank()) throw new IllegalArgumentException("Blank statement...");
            System.out.println(age);
            return name.toUpperCase();



        };

        System.out.println(upperCaseName.apply("Kvng",29));

    }
}
