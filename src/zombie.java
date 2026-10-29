public class zombie extends combatant implements special {
    public zombie(String Name, int hp, int stamina){
        super(Name,hp, stamina);
    }
    @Override
    public String attack() {
        return getName() + " claws at its prey.";
    }
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String easyWayOut() {
        return getName()+" gave it's head to the opponent.";

    }
    public String summoning(){
        return getName()+" summons a friend to help.";
    }

    @Override public String useSpecialAttack(){
        return getName()+" wildly throws itself";
    }
    @Override public String useSpecialBuff(){
        return getName()+" reverts to its most primal, violent form.";
    }
    @Override public String useSpecialDefense(){
        return getName()+" starts preparing for a strong defense.";
    }
}