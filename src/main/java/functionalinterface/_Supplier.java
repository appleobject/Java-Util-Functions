package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier
{
    public static void main(String[] args)
    {
        System.out.println(getDBConnectionUrl());
        System.out.println("Supplier...");
        System.out.println(getDBConnectionUrlSuppliers.get());

    }

    static String getDBConnectionUrl()
    {
        return "JDBC://localhost:5432/users";
    }

    // Supplier Functional Interface
    static Supplier<List<String>> getDBConnectionUrlSuppliers = ()->
            List.of(
                    "JDBC://localhost:5431/users",
                    "JDBC://localhost:5431/customers",
                    "JDBC://localhost:5431/dispatchers"
            );
}
