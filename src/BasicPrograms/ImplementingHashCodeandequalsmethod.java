package BasicPrograms;

import java.util.HashSet;
import java.util.Objects;

public class ImplementingHashCodeandequalsmethod {

    private int id;
    private String name;

    public ImplementingHashCodeandequalsmethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // same reference
            return true;
        if (obj == null || getClass() != obj.getClass()) // null or diff class
            return false;

        // Typecast to current class
        ImplementingHashCodeandequalsmethod that = (ImplementingHashCodeandequalsmethod) obj;

        // Compare fields
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "ImplementingHashCodeandequalsmethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ImplementingHashCodeandequalsmethod obj1 = new ImplementingHashCodeandequalsmethod(1, "Roshan");
        ImplementingHashCodeandequalsmethod obj2 = new ImplementingHashCodeandequalsmethod(1, "Roshan");
        ImplementingHashCodeandequalsmethod obj3 = new ImplementingHashCodeandequalsmethod(2, "Ghadge");

        // Equals & hashCode check
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // true
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3)); // false
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        System.out.println("obj3.hashCode(): " + obj3.hashCode());

        // HashSet demo
        HashSet<ImplementingHashCodeandequalsmethod> set = new HashSet<>();
        set.add(obj1);
        set.add(obj2); // Duplicate, won’t be added
        set.add(obj3);

        System.out.println("HashSet elements: " + set);
    }
}
