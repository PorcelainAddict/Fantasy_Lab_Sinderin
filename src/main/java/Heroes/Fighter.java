package Heroes;

import Weapons.Axe;
import Weapons.Club;
import Weapons.Hammer;
import Weapons.Sword;

public abstract class Fighter implements IWeapon  {

    private String name;
    private Axe axe;
    private Sword sword;
    private Club club;
    private Hammer hammer;
    private int health;

    public Fighter(String name, Axe axe, Sword sword, Club club, Hammer hammer, int health){
        this.name = name;
        this.axe = axe;
        this.sword = sword;
        this.club = club;
        this.hammer = hammer;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Axe getAxe() {
        return axe;
    }

    public Sword getSword() {
        return sword;
    }

    public Club getClub() {
        return club;
    }

    public Hammer getHammer() {
        return hammer;
    }

    public void attack(Axe axe, Sword sword, Club club, Hammer hammer){

    }
}
