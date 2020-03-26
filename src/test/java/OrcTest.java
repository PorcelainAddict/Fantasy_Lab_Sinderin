import ForcesOfEvil.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc("Slugathor", 80);
    }

    @Test
    public void getName(){
        assertEquals("Slugathor", orc.getName());
    }

    @Test
    public void getHealth(){
        assertEquals(80, orc.getHealth());
    }
}
