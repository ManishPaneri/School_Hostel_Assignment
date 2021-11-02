package school;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void NullCheckStudent(){
        Student student = new Student(null, null, null);
        Assert.assertNotNull(student);
        Assert.assertNull(student.getRollNumber());
        Assert.assertNull(student.getClasses());
        Assert.assertNull(student.getFoodPreference());
    }

    @Test
    public void ValidStudentTestCase(){
        Classes  A = new Classes("A");
        String rollNumber = "1";
        Student student = new Student(rollNumber, A, FoodPreference.V.name());
        Assert.assertNotNull(student);
        Assert.assertEquals(rollNumber, student.getRollNumber());
        Assert.assertEquals(A, student.getClasses());
        Assert.assertEquals(FoodPreference.V.name(), student.getFoodPreference());
    }

}
