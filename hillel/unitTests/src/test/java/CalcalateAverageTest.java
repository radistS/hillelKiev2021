import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import textMoc.CalculateAverage;
import textMoc.Users;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalcalateAverageTest {

    private Users users;

    @BeforeEach
    public void setup(){
        users = mock(Users.class);
    }

    @Test
    public void calculateTest(){
        CalculateAverage calc = new CalculateAverage(new Users());
        System.out.println(calc.calculate());
        Assertions.assertEquals(5.0, calc.calculate().getAsDouble());
    }

    @Test
    public void calculateMockTest(){

        when(users.getDataFromDB()).thenReturn(List.of(1,1,1,1,1));
        CalculateAverage calc = new CalculateAverage(users);
        Assertions.assertEquals(1.0, calc.calculate().getAsDouble());
    }


}
