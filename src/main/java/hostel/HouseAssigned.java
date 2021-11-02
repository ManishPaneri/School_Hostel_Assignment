package hostel;



import school.Student;

import java.util.*;
import java.util.stream.Collectors;

public class HouseAssigned {

    private HashMap<House, List<Student>> houses = new HashMap<>();

    private HashMap<String, List<House>> classVsHouse = new HashMap<>();

    List<Student> unAssignedStudent = new ArrayList<>();

    public void boardingHouses(String name, int capacity, String className, String foodPreference){
            House house = new House(name, capacity, foodPreference);
            houses.put(house, new ArrayList<>());
            if(classVsHouse.get(className)!=null){
                classVsHouse.get(className).add(house);
            }else{
                List<House> houseList = new ArrayList<>();
                houseList.add(house);
                classVsHouse.put(className, houseList);
            }
    }


    public void assignedStudent(Student student) {
        String className = student.getClasses().getClassName();
        if(classVsHouse.get(className)!= null){
            List<House> houseList = classVsHouse.get(className);
            for(House house: houseList){
                if(isAvailableHouse(house) && house.getFoodPreference().equals(student.getFoodPreference())){
                    if(this.houses.get(house)!= null){
                        this.houses.get(house).add(student);
                    }else {
                        List<Student> students = new ArrayList<>();
                        students.add(student);
                        this.houses.put(house,students);
                    }
                    return;
                }
            }
            this.unAssignedStudent.add(student);
        }
    }


    private boolean isAvailableHouse(House house){
        int capacity = house.getCapacity();
        if(houses.get(house)!=null){
            int size = houses.get(house).size();
            if(size<capacity){
                return true;
            }
            return  false;
        }
        return false;
    }


    public HashMap<House, List<Student>> getHouses(){
        return this.houses;
    }

    public List<Student> getUnAssignedStudent() {
        return unAssignedStudent;
    }


    public void printReport(){
        for (Map.Entry<House, List<Student>> entry : this.getHouses().entrySet()) {
            System.out.println(entry.getKey().getName() + " " + entry.getValue().stream().map(Student::getRollNumber)
                    .collect(Collectors.toList()));
        }

        System.out.println("NA " + this.getUnAssignedStudent().stream().map(Student::getRollNumber)
                .collect(Collectors.toList()));
    }
}
