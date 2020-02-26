package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream
{
    public static void main(String[] args)
    {
        List<Person> people = List.of(
                new Person("kvng", Gender.MALE),
                new Person("Rosemary", Gender.FEMALE),
                new Person("Stevie", Gender.MALE),
                new Person("Jesinta", Gender.FEMALE),
                new Person("Aisha",Gender.FEMALE),
                new Person("Bob",Gender.PREFER_NOT_SAY)
        );

        //people.stream()
                //.map(person -> person.name)
               // .mapToInt(String::length)
                //.forEach(System.out::println);
        boolean containsOnlyFemales = people.stream().allMatch(p -> Gender.FEMALE.equals(p.gender));
        System.out.println(containsOnlyFemales);


    }

    static class Person
    {
        private final String name;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender
    {
        MALE,FEMALE, PREFER_NOT_SAY
    }
}
