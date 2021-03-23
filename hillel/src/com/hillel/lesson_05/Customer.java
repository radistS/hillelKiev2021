package com.hillel.lesson_05;

import java.util.Objects;

public class Customer {

    private int id;
    private boolean active;
    private Boolean block;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Boolean getBlock() {
        return block;
    }

    public void setBlock(Boolean block) {
        this.block = block;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                active == customer.active &&
                Objects.equals(block, customer.block) &&
                Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, active, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", active=" + active +
                ", block=" + block +
                ", name='" + name + '\'' +
                '}';
    }
}
