package Heroes;

import Weapons.Axe;
import Weapons.Club;
import Weapons.Hammer;
import Weapons.Sword;

public interface IWeapon {

    public void attack(Axe axe, Sword sword, Club club, Hammer hammer);
}
