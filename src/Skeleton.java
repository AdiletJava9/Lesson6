public class Skeleton extends Boss {
    private int countShoot;

    public int getCountShoot() {
        return countShoot;
    }

    public void setCountShoot(int countShoot) {
        this.countShoot = countShoot;
    }

    public Skeleton(int health, int damage, Weapon weapon, int countShoot) {
        super(health, damage, weapon);
        this.countShoot = countShoot;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrow Count: " + countShoot);
    }
}
