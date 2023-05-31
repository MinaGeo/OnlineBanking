import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemsTest {
    Items item1,item2;
    @Before
    public void setUp() throws Exception {
        item1=new Items("pen","it1",100,5);
        item2=new Items("checkbook","it2",1000,1);
    }

    @Test
    public void TestBuy1() {
        item1.buy();
        int out=item1.getCount();
        int expected=4;
        assertEquals(expected,out);
    }
    @Test
    public void TestBuy2(){
        item2.buy();
        item2.buy();
        int out=item2.getCount();
        int expected=0;
        assertEquals(expected,out);

    }
}