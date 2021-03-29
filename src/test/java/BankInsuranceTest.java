
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankInsuranceTest {
    
    public BankInsuranceTest() {
    }


    @Test
    public void testCalculateLifeInsurance() throws Exception {
        System.out.println("calculateLifeInsurance");
        int age = 20;
        double expResult = 400.0;
        double result = BankInsurance.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
    }
    
   @Test
    public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            BankInsurance.calculateLifeInsurance(4);
        });
    }
    
    @Test
    public void testThatExceptionThrown2() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            BankInsurance.calculateLifeInsurance(111);
        });
    }
}
