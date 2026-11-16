public class pacifist extends combatant {
    public pacifist(String Name, int hp, int stamina) {
        super(Name, hp, stamina);
    }

    @Override
    public String attack() {
        return getName() + " chickened out.";
    }

    public String getName() {
        return Name;
    }

    public int getStamina() {
        return stamina;
    }
    public int getHp() {
        return hp;
    }

    @Override
    public String easyWayOut() {
        return getName() + " ran straight into the enemy and died.";
    }
}