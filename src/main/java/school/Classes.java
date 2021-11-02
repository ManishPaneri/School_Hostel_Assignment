package school;

import java.util.Objects;

public class Classes {
    private String className;

    public Classes(String name){
        this.className = name;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classes classes = (Classes) o;
        return Objects.equals(className, classes.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className);
    }
}
