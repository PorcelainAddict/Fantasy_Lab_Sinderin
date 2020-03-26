import ForcesOfEvil.Orc;
import ForcesOfEvil.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll("Slugathor", 250);
    }

    @Test
    public void getName(){
        assertEquals("Slugathor", troll.getName());
    }

    @Test
    public void getHealth(){
        assertEquals(250, troll.getHealth());
    }
}
