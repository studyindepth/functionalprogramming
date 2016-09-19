package io.github.toandv.java.fp.compose;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * @author toandv
 * @since 9/18/2016.
 */
public class Composing {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(25, 170.0, 65.0),
                new Person(25, 165.4, 55.3),
                new Person(25, 170.0, 70.0),
                new Person(26, 175.2, 67D),
                new Person(30, 172.1, 67.3),
                new Person(23, 177.0, 80.4),
                new Person(30, 160.6, 67.2)
        );

        // filter
        Predicate<Person> ageGE25 = p -> p.age >= 25 && p.age <= 40;
        Predicate<Person> heightGE170 = p -> p.height >= 170 && p.height <= 180;
        Predicate<Person> weightGE60 = p -> p.weight >= 60 && p.weight <= 75;
        Predicate<Person> isNormal = ageGE25.and(heightGE170).and(weightGE60);

        // compare
        Comparator<Person> sortByAgeAsc = Comparator.comparing((Person p) -> p.age, (a1, a2) -> a1.compareTo(a2));
        Comparator<Person> sortByAgeAscAndHeightAsc = sortByAgeAsc
                .thenComparing((Person p) -> p.height, (h1, h2) -> h1.compareTo(h2));
    }

    static class Person {

        final Integer age;
        final Double height;
        final Double weight;

        public Person(Integer age, Double height, Double weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Person(" +
                    "a=" + age +
                    ",h=" + height +
                    ",w=" + weight +
                    ')';
        }
    }
}
