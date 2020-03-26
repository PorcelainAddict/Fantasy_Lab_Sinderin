import Heroes.Dwarf;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Hammer;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
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
        dwarf = new Dwarf("Nancy", axe, sword, club, hammer, 100);
    }

    @Test
    public void getName(){
        assertEquals("Nancy", dwarf.getName());
    }

    @Test
    public void getHealth(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void getAxe(){
        assertEquals(axe, dwarf.getAxe());
    }

    @Test
    public void getSword(){
        assertEquals(sword, dwarf.getSword());
    }

    @Test
    public void getClub(){
        assertEquals(club, dwarf.getClub());
    }

    @Test
    public void getHammer(){
        assertEquals(hammer, dwarf.getHammer());
    }
}
