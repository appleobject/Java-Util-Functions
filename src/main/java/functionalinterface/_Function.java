package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function
{
    public static void main(String[] args) {
        // Function:- Takes one argument and produces one result
        int result  = incrementByOneFunction(22);
        System.out.println(result);

        int result2 = incrementByOneFunction.apply(24);
        int multiply = multiplyBy2.apply(result2);
        System.out.println(multiply);


        System.out.println("Using the : andThen()...");
        Function<Integer, Integer> addBy1AndThenMutiplyBy2 = incrementByOneFunction.andThen(multiplyBy2);
        Integer apply = addBy1AndThenMutiplyBy2.apply(21);
        System.out.println(apply);
        System.out.print("The incrementUsingBiFunction implements Bifunction.. \n");
        System.out.println(
                incrementUsingBiFunction(3,4)
        );


        System.out.println("BiFunctions...");
        // BiFunction:- Takes two arguments and produces one result;

        System.out.println(
                oddOut.apply(3, 4)
        );
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy2 = number -> number * 2;

    static int incrementByOneFunction(int num)
    {
        return num + 1;
    }

    static BiFunction<Integer, Integer, Integer> oddOut = (num,numOne)-> (num + 1) * numOne;


    static int incrementUsingBiFunction(int num, int numOne)
    {
        return (num + 1) * numOne;
    }
}
