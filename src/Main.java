//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss(200, 50, new Weapon());
        boss.weapon.setWeaponType(WeaponType.BLADED_WEAPONS);
        boss.weapon.setNameWeapon("Daggers");
        boss.printInfo();
        System.out.println("-------------------------------");
        Skeleton skeleton = new Skeleton(200, 10, new Weapon(), 6);
        skeleton.weapon.setWeaponType(WeaponType.BLADED_WEAPONS);
        skeleton.weapon.setNameWeapon("Hammer");
        skeleton.printInfo();
        System.out.println("-------------------------------");
        Skeleton skeleton1 = new Skeleton(300, 15, new Weapon(), 7);
        skeleton1.weapon.setWeaponType(WeaponType.THROWING_WEAPONS);
        skeleton1.weapon.setNameWeapon("Kingal");
        skeleton1.printInfo();
    }
}