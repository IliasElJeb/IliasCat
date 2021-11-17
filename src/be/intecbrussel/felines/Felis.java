package be.intecbrussel.felines;

import java.util.Objects;

public class Felis extends Animal {

    private static int vaccitationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;


    public void miauw() {

    }

    public void miauw(int times) {

    }


    public static int getVaccitationCount() {

        return vaccitationCount;
    }

    public static void setVaccitationCount(int vaccitationCount) {
        Felis.vaccitationCount = vaccitationCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return getShelterNo() == felis.getShelterNo() && getBadgeNo() == felis.getBadgeNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShelterNo(), getBadgeNo());
    }


    public int getShelterNo() {
        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        this.shelterNo = shelterNo;
    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        this.badgeNo = badgeNo;

    }



}
