public abstract class combatant {
    protected int hp;
    protected String Name;
    private int stamina;
    public combatant(String Name, int hp, int stamina) {
        this.Name = Name;
    }

    public abstract String attack();
    public abstract String getName();
    public abstract String easyWayOut();
}
