public class Weapon {
    private WeaponType weaponType;
    private String nameWeapon;

    public Weapon(WeaponType weaponType, String nameWeapon) {
        this.weaponType = weaponType;
        this.nameWeapon = nameWeapon;
    }

    public Weapon() {
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }
}
