public abstract class combatant {
    protected int hp;
    protected String Name;
    protected int stamina;
    public combatant(String Name, int hp, int stamina) {
        this.Name = Name;
        this.stamina = stamina;
        this.hp = hp;
    }

    public abstract String attack();
    public abstract String getName();
    public abstract int getStamina();
    public abstract int getHp();
    public abstract String easyWayOut();
    public String toCsv() {
        return getClass().getSimpleName() + ","
                + getName() + ","
                + getHp() + ","
                + getStamina();
    }
}
