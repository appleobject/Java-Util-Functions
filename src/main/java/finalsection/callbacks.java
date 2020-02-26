package finalsection;

import java.util.function.Consumer;

public class callbacks
{
    public static void main(String[] args)
    {
        hello("Scott",null,(value)->{
            System.out.println("no lastName provided..."+value);
        });

        hello2("maggie",null,()-> System.out.println("no lastName provided...!"));

    }

  static void hello(String firstName, String lastName, Consumer<String> callBack)
  {
      System.out.println(firstName);
      if (lastName != null)
      {
          System.out.println(lastName);
      }
      else
      {
          callBack.accept(firstName);
      }
  }

  static void hello2(String firstName, String lastName, Runnable callback)
  {
      System.out.println(firstName);
      if (lastName != null)
      {
          System.out.println(lastName);
      }
      else
      {
          callback.run();
      }
  }
}
