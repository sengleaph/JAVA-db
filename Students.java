
package JVDB;

public class Students {
    public static String getAge;
    private Integer id;
    private String name;
    private static String gender;
    private Integer age;
    private float score;

    public Students() {
    }

    public Students(Integer id, String name, String gender, Integer age, float score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public static Integer getId() {
        return 0;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static String getName() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        Students.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static float getScore() {
        return 0;
    }

    public void setScore(float score) {
        this.score = score;
    }
}