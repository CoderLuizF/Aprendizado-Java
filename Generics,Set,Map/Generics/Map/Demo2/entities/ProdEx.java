package entities;

import java.util.Objects;

public class ProdEx {

    private String name;
    private Double price;

    public ProdEx(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProdEx prodEx = (ProdEx) o;
        return Objects.equals(name, prodEx.name) && Objects.equals(price, prodEx.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
