package com.noyon.noyon;

public class Employee {

    private String name;
    private String desig;
    private String contact;

    public Employee(String name, String desig, String contact) {
        this.name = name;
        this.desig = desig;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", desig='" + desig + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
