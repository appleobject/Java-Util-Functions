package functionalinterface;

import java.util.function.Supplier;

public class _Supplier
{
    public static void main(String[] args)
    {
        System.out.println(getDBConnectionUrl());
        System.out.println("Supplier...");
        System.out.println(getDBConnectionUrlSupplier.get());

    }

    static String getDBConnectionUrl()
    {
        return "JDBC://localhost:5432/users";
    }

    // Supplier Functional Interface
    static Supplier<String> getDBConnectionUrlSupplier = ()-> "JDBC://localhost:5431/users";
}
