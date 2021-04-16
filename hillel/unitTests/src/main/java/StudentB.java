import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StudentB {
    private int id;
    private String firstName;
    private String lastName;
    private String age;
    private String sex;
    private String pasportData;

    public String getFullName () {
        return firstName + " " + lastName;
    }
}
