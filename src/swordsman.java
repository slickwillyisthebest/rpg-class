public class swordsman extends combatant {
    private int stamina;
    public swordsman(String Name, int hp, int stamina){
        super(Name,hp);
        this.stamina=stamina;
    }
    @Override
    public String attack(){
        return getName() + "swings their sword.";
    }
    public String heavyAttack(){
        return getName() + "brings their sword above their head and swings it down with all their might.";
    }
    public String parry(){
        return getName() + "parries that blow.";
    }
}
