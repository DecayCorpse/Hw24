import java.util.Objects;

public class User implements Cloneable {
    private int age = 11;
    private String UserName = "Ivan";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && UserName.equals(user.UserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, UserName);
    }

    @Override
    public String toString() {
        return "User[" +
                "age - " + age +
                ", UserName - '" + UserName + '\'' +
                ']';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
