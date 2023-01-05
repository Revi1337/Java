package stream_8_1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = getPeople();

        // Imperative approach ❌
        System.out.println("Imperative approach ❌");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        females.forEach(System.out::println);
        System.out.println();


        // Declarative approach ✅
        System.out.println("Declarative approach ✅");

        // Filter (Predicate)
        List<Person> females2 = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        // Sort (Comparator)
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());

        // All Match (Predicate) : 스트림안의 모든 요소들이 조건애 만족하면 true 를 리턴함
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 1);

        // Any Match (Predicate) : 스트림안의 모든 요소들 중 하나라도 조건이 만족하면 true 를 리턴함
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 30);

        // None Match (Predicate) : 스트림안의 모든 요소들이 조건을 만족하지 않으면 true 를 리턴함
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Helen White"));

        // MAX (Comparator)
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // MIN (Comparator)
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(System.out::println);
        });

        // Chaining
        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .ifPresent(System.out::println);

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex BOz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
