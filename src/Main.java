

void main() {
    combatant a = new swordsman("alexander",100,10);
    combatant b = new brawler("ethan", 300, 15);
    combatant c = new pacifist("graham", 12, 4);
    combatant d = new zombie("ghoul", 40, 50);



ArrayList<special> specialists = new ArrayList<>();
    specialists.add((special) a);
    specialists.add((special) b);
    specialists.add((special) d);


    for (special s : specialists){
        System.out.println(s.useSpecialAttack());
        System.out.println(s.useSpecialBuff());
        System.out.println(s.useSpecialDefense());
    }






ArrayList<combatant> party = new ArrayList<>();
party.add(a);
party.add(b);
party.add(c);
party.add(d);
for (combatant t : party ){
    System.out.println(t.attack());
    System.out.println(t.easyWayOut());
}
}

