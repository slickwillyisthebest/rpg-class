public class brawler extends combatant implements special {
    public brawler(String Name, int hp, int stamina) {
        super(Name, hp, stamina);
    }

    @Override
    public String attack() {
        return getName() + " takes a swing.";
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String easyWayOut() {
        return getName() + " ran straight into the enemy and died.";
    }

    @Override
    public String useSpecialAttack() {
        return getName() + " tackles his enemy and hits their head with his elbow.";
    }

    @Override
    public String useSpecialBuff() {
        return getName() + " beats his chest and yells.";
    }

    @Override
    public String useSpecialDefense() {
        return getName() + " puts his arms up and is prepared to die if he lets it go.";
    }
    public String knuckles () {
        return getName() + "puts on brass knuckles.";
    }
}
