package textMoc;

import java.util.List;
import java.util.OptionalDouble;

public class CalculateAverage {

    private Users users;

    public CalculateAverage(Users users) {
        this.users = users;
    }

    public OptionalDouble calculate(){
        return users.getDataFromDB().stream().mapToInt(Integer::intValue).average();
    }

}


