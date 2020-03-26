package Heroes;

import Weapons.Axe;
import Weapons.Club;
import Weapons.Hammer;
import Weapons.Sword;

public class Dwarf extends Fighter {

    public Dwarf(String name, Axe axe, Sword sword, Club club, Hammer hammer, int health){
        super(name, axe, sword, club, hammer, health);
    }
}
