package com.ensak;
/**
 * Cette classe représente une personne avec un nom et un âge.
 */
public class Person {

    /**
     * Le nom de la personne.
     */
    private String name;

    /**
     * L'âge de la personne.
     */
    private int age;

    /**
     * Constructeur pour créer une instance de Person.
     *
     * @param name Le nom de la personne.
     * @param age  L'âge de la personne.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
