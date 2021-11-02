package school;


import org.junit.Assert;
import org.junit.Test;

public class TestClasses {

    @Test
    public void NullNameClassesCheck(){
       Classes classes =  new Classes(null);
       Assert.assertNull(classes.getClassName());
    }

    @Test
   public void ClassesCheck(){
        Classes classes =  new Classes("A");
        Assert.assertNotNull(classes.getClassName());
        Assert.assertEquals("A", classes.getClassName());
    }
}
