package  hostel;


import org.junit.Assert;
import org.junit.Test;
import school.FoodPreference;

public class TestHouse {

    @Test
    public void NullHouseTestCase(){
        House house = new House(null, 0, null);
        Assert.assertNotNull(house);
        Assert.assertNull(house.getName());
        Assert.assertNotNull(house.getFoodPreference());
        Assert.assertEquals(0, house.getCapacity());
    }

    @Test
    public void HouseValidTestCase(){
        House house = new House("A", 10, FoodPreference.NV.name());
        Assert.assertNotNull(house);
        Assert.assertEquals("A", house.getName());
        Assert.assertEquals(FoodPreference.NV.name(), house.getFoodPreference());
        Assert.assertEquals(10, house.getCapacity());
    }
}
