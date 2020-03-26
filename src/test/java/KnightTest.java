import Heroes.Knight;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Hammer;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Axe axe;
    Sword sword;
    Hammer hammer;
    Club club;

    @Before
    public void before(){
        axe = new Axe();
        sword = new Sword();
        hammer = new Hammer();
        club = new Club();
        knight = new Knight("Nancy", axe, sword, club, hammer, 100);
    }

    @Test
    public void getName(){
        assertEquals("Nancy", knight.getName());
    }

    @Test
    public void getHealth(){
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void getAxe(){
        assertEquals(axe, knight.getAxe());
    }

    @Test
    public void getSword(){
        assertEquals(sword, knight.getSword());
    }

    @Test
    public void getClub(){
        assertEquals(club, knight.getClub());
    }

    @Test
    public void getHammer(){
        assertEquals(hammer, knight.getHammer());
    }
}
