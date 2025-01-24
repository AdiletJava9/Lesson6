public class Boss extends GameEntity {
    public Weapon weapon;

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    public void printInfo() {
        System.out.println("Boss Info:");
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon Type: " + weapon.getWeaponType());
        System.out.println("Weapon Name: " + weapon.getNameWeapon());
    }

}
