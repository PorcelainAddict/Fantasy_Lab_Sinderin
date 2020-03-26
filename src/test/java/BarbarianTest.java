import Heroes.Barbarian;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Hammer;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
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
        barbarian = new Barbarian("Toby", axe, sword, club, hammer, 100);
    }

    @Test
    public void getName(){
        assertEquals("Toby", barbarian.getName());
    }

    @Test
    public void getHealth(){
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void getAxe(){
        assertEquals(axe, barbarian.getAxe());
    }

    @Test
    public void getSword(){
        assertEquals(sword, barbarian.getSword());
    }

    @Test
    public void getClub(){
        assertEquals(club, barbarian.getClub());
    }

    @Test
    public void getHammer(){
        assertEquals(hammer, barbarian.getHammer());
    }

}
