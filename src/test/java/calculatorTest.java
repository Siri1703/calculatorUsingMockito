import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class calculatorTest {
    calculator calc=null;
    calculatorService service = mock(calculatorService.class);
    @BeforeEach
    public void objectCreation()
    {

        calc=new calculator(service);
    }

    @Test
    public void toCalculateAdditionOfTwoNumbers()
    {
        when(service.add(2,3)).thenReturn(5);
        assertEquals(5,calc.addition(2,3));

    }

    @Test
    public void toCalculateSubtractionOfTwoNumbers()
    {
        when(service.subtract(3,4)).thenReturn(-1);
        assertEquals(-1,calc.subtraction(3,4));
    }

    @Test
    public void toCalculateProductOfTwoNumbers()
    {
        when(service.product(3,4)).thenReturn(12);
        assertEquals(12,calc.product(3,4));
    }

   @Test
   public void toCalculateQuotientOfTwoNumbers()
   {
       when(service.division(3,4)).thenReturn(1);
       assertEquals(1,calc.division(3,4));
   }
}
