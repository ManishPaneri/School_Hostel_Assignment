
import hostel.HouseAssigned;
import school.Classes;
import school.FoodPreference;
import school.Student;

public class MainApplication {
    public static void main(String args[]) {
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
        houseAssigned.printReport();
    }
}