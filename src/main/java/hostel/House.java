package hostel;

import java.util.Objects;

public class House {

    private String name;

    private int capacity;

    private String foodPreference;

    public House(String name, int capacity, String foodPreference) {
        this.name = name;
        this.capacity = capacity;
        this.foodPreference = foodPreference;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return name;
    }


    public String getFoodPreference() {
        return foodPreference;
    }

    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(name, house.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
