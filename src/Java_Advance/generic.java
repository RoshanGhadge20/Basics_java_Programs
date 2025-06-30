package Java_Advance;

public class generic<T> {
    T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public static void main(String[] args) {

        generic<String> obj = new generic<>();

        obj.set("Setup");
        System.out.println(obj.get());
    }

}
