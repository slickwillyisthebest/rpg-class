

void main() throws IOException {
    String line = null;
    combatant a = new swordsman("alexander", 100, 10);
    combatant b = new brawler("graham", 300, 15);
    combatant c = new pacifist("ethan", 12, 4);
    combatant d = new zombie("ghoul", 40, 50);

    System.out.println(System.getProperty("user.dir"));

    ArrayList<special> specialists = new ArrayList<>();
    specialists.add((special) a);
    specialists.add((special) b);
    specialists.add((special) d);


    for (special s : specialists) {
        System.out.println(s.useSpecialAttack());
        System.out.println(s.useSpecialBuff());
        System.out.println(s.useSpecialDefense());
    }


    FileWriter writer = new FileWriter("save.txt");
    ArrayList<combatant> party = new ArrayList<>();
    party.add(a);
    party.add(b);
    party.add(c);
    party.add(d);
    for (combatant t : party) {
        System.out.println(t.attack());
        System.out.println(t.easyWayOut());
        writer.write(t.toCsv() + "\n");
    }
    writer.close();
try {
    Scanner fileScanner = new Scanner(new File("save.txt"));
    while (fileScanner.hasNextLine()) {
        line = fileScanner.nextLine();



    String[] parts = line.split(",");

    if (parts.length != 4) {
        System.out.println("Skipping malformed line: " + line);
        continue;
    }
    String combatant = parts[0];
    String name = parts[1];
    int hp;
    int stamina;
    try {
        hp = Integer.parseInt(parts[2].trim());
        stamina = Integer.parseInt(parts[3].trim());
    }
    catch(NumberFormatException e){
        System.out.println("your code is rotted");
        continue;
    }
    if (combatant.equals("swordsman")) {
            party.add(new swordsman(name, hp, stamina));
        }
    if (combatant.equals("brawler")) {
        party.add(new brawler(name, hp, stamina));
    }
    if (combatant.equals("zombie")) {
        party.add(new zombie(name, hp, stamina));
    }
    }
    fileScanner.close();
    }
catch(FileNotFoundException e )  {
    System.out.println("your code is rotted");

    }





    }





