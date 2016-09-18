package io.github.toandv.java.fp.compose;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author toandv
 * @since 9/18/2016.
 */
public class Composing {
    public static void main(String[] args) {
        Predicate<Person> ageGE25 = p -> p.age >= 25 && p.age <= 40;
        Predicate<Person> heightGE170 = p -> p.height >= 170 && p.height <= 180;
        Predicate<Person> weightGE60 = p -> p.weight >= 60 && p.weight <= 75;

        Predicate<Person> isNormal = ageGE25.and(heightGE170).and(weightGE60);

        List<Person> people = Arrays.asList(
                new Person(25, 170, 65),
                new Person(25, 165, 55),
                new Person(26, 175, 67),
                new Person(30, 172, 67),
                new Person(23, 177, 80),
                new Person(30, 160, 67)
        );

        List<Person> normalPeople = people.stream().filter(isNormal).collect(Collectors.toList());
        System.out.println(normalPeople);
    }

    static class Person {
        int age;
        double height;
        double weight;

        public Person(int age, double height, double weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }
}
