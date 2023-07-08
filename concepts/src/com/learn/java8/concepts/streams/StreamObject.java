package com.learn.java8.concepts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamObject {

    public static void main(String[] args) {
        Person person1 = new Person(1, "John", 33);
        Person person2 = new Person(2, "William", 31);
        Person person3 = new Person(3, "Steve", 49);

        List<Person> employees = new ArrayList<>();
        employees.add(person1);
        employees.add(person2);
        employees.add(person3);

        employees.stream().filter(person -> person.getAge() > 45).forEach(person -> System.out.println(person.getAge()));

        // Map(K,V) Map<age,Person>
        Map<Integer, Person> map = employees.stream().collect(Collectors.toMap(Person::getAge, person -> person));
        System.out.println(map);

        map.keySet().forEach(key -> System.out.println(key + ":" + map.get(key).getName()));
    }
}


class Person {

    private Integer id;
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}