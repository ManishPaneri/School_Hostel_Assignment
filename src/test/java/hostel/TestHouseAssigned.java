package hostel;

import org.junit.Assert;
import org.junit.Test;
import school.Classes;
import school.FoodPreference;
import school.Student;

import java.util.List;
import java.util.Map;

public class TestHouseAssigned {
    @Test
    public void boardingHousesTestCase(){
        Classes A = new Classes("A");
        String HouseName = "ANV";
        HouseAssigned houseAssigned = new HouseAssigned();
        houseAssigned.boardingHouses(HouseName,10, A.getClassName(),FoodPreference.NV.name());
        Assert.assertNotNull(houseAssigned.getUnAssignedStudent());
        Assert.assertEquals(0, houseAssigned.getUnAssignedStudent().size());
        Assert.assertEquals(1, houseAssigned.getHouses().size());
        Assert.assertNotNull(houseAssigned.getHouses());
        Assert.assertEquals( 1, houseAssigned.getHouses().size());
    }


    @Test
    public void emptyUnAssignedStudentTestCase(){
        Classes A = new Classes("A");
        Classes B = new Classes("B");
        HouseAssigned houseAssigned = new HouseAssigned();
        int numberOfHouses = 4;
        int maxCapacity = 12;
        int capacity = maxCapacity / numberOfHouses;
        houseAssigned.boardingHouses("AV", capacity, A.getClassName(), FoodPreference.V.name());
        houseAssigned.boardingHouses("ANV", capacity, A.getClassName(), FoodPreference.NV.name());
        houseAssigned.boardingHouses("BV", capacity, B.getClassName(), FoodPreference.V.name());
        houseAssigned.boardingHouses("BNV", capacity, B.getClassName(), FoodPreference.NV.name());
        houseAssigned.assignedStudent(new Student("1", B, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("2", A, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("3", A, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("4", B, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("5", B, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("6", A, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("7", A, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("8", A, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("9", B, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("10", B, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("11", A, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("12", B, FoodPreference.NV.name()));
        Assert.assertNotNull(houseAssigned.unAssignedStudent);
        Assert.assertNotNull(houseAssigned.getHouses());
        Assert.assertEquals(0, houseAssigned.unAssignedStudent.size());
        Assert.assertEquals(4, houseAssigned.getHouses().size());
        for (Map.Entry<House, List<Student>> entry : houseAssigned.getHouses().entrySet()) {
            Assert.assertEquals(3, entry.getValue().size());
        }
    }

    @Test
    public void unAssignedStudentIsAvailableTestCase(){
        Classes A = new Classes("A");
        Classes B = new Classes("B");
        HouseAssigned houseAssigned = new HouseAssigned();
        int numberOfHouses = 4;
        int maxCapacity = 12;
        int capacity = maxCapacity / numberOfHouses;
        houseAssigned.boardingHouses("AV", capacity, A.getClassName(), FoodPreference.V.name());
        houseAssigned.boardingHouses("ANV", capacity, A.getClassName(), FoodPreference.NV.name());
        houseAssigned.boardingHouses("BV", capacity, B.getClassName(), FoodPreference.V.name());
        houseAssigned.boardingHouses("BNV", capacity, B.getClassName(), FoodPreference.NV.name());
        houseAssigned.assignedStudent(new Student("1", B, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("2", A, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("3", A, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("4", B, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("5", B, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("6", A, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("7", A, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("8", A, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("9", B, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("10", B, FoodPreference.V.name()));
        houseAssigned.assignedStudent(new Student("11", A, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("12", B, FoodPreference.NV.name()));
        houseAssigned.assignedStudent(new Student("13", A, FoodPreference.NV.name()));
        Assert.assertNotNull(houseAssigned.unAssignedStudent);
        Assert.assertNotNull(houseAssigned.getHouses());
        Assert.assertEquals(1, houseAssigned.unAssignedStudent.size());
        Assert.assertEquals(4, houseAssigned.getHouses().size());
        for (Map.Entry<House, List<Student>> entry : houseAssigned.getHouses().entrySet()) {
            Assert.assertEquals(3, entry.getValue().size());
        }
    }
}
