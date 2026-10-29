public class pacifist extends combatant {
    public pacifist(String Name, int hp, int stamina) {
        super(Name, hp, stamina);
    }

    @Override
    public String attack() {
        return getName() + " chickened out.";
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String easyWayOut() {
        return getName() + " ran straight into the enemy and died.";
    }
}