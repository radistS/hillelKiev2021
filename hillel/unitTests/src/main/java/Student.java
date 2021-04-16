
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String age;
    private String sex;
    private String pasportData;

    public String getFullName () {
        return firstName + " " + lastName;}
}
