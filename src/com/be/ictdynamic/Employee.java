package com.be.ictdynamic;

/**
 * Class Employee.
 *
 * @author Wim Van den Brande
 * @since 13/01/2016 - 19:18
 */
public class Employee {
    private String name;
    private String commune;

    public Employee(String name, String commune) {
        this.name = name;
        this.commune = commune;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }
}
