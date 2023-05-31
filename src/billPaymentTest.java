import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class billPaymentTest {
    Acc_Driver account1;
    @Before
    public void setUp() throws Exception {
        account1=new Acc_Driver("12",1000);
        account1.addBill("water bill",100);
    }

    @Test
    public void payBillTest1() {
        account1.payBill("water bill");
        int out=account1.findBill("water bill");
        int expected=-1;
        assertEquals(expected,out);
    }

    @Test
    public void payBillTest2(){
        int out=account1.findBill("water bill");
        int expected=0;
        assertEquals(expected,out);
    }
    @Test
    public void payBillTest3(){
        int out=account1.findBill("Electric");
        int expected=0;
        assertNotEquals(expected,out);
    }
}