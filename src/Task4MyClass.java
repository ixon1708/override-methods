import java.util.Objects;

public class Task4MyClass {
    String name;
    int age;

    //нажимаем Alt + Insert и выбираем в меню equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task4MyClass)) return false;
        Task4MyClass that = (Task4MyClass) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
