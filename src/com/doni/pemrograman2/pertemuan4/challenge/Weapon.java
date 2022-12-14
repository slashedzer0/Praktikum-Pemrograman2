package com.doni.pemrograman2.pertemuan4.challenge;

public class Weapon extends Item {
    private Float damage;

    public Weapon(String name, int price, Float damage) {
        super(name, price);
        this.damage = damage;
    }

    public void extraInfo() {
        System.out.println("Damage: " + damage);
    }

    public Float getDamage() {
        return damage;
    }

    public void setDamage(Float damage) {
        this.damage = damage;
    }
}
