public class swordsman extends combatant implements special {
    public swordsman(String Name, int hp, int stamina){
        super(Name,hp, stamina);
    }
    @Override
    public String attack() {
        return getName() + " swings their sword.";
    }
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String easyWayOut() {
        return getName()+" drove their sword through their heart and died.";

    }


    @Override public String useSpecialAttack(){
        return getName()+" channels hate from deep inside and swings his sword with all he has.";
    }
    @Override public String useSpecialBuff(){
        return getName()+" closes his eyes and prepares for some crazy stuff to go down.";
    }
    @Override public String useSpecialDefense(){
        return getName()+" starts preparing for a strong defense.";
    }

    public String heavyAttack(){
        return getName() + "brings their sword above their head and swings it down with all their might.";
    }
    public String parry(){
        return getName() + "parries that blow.";
    }


}
