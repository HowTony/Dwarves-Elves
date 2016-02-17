import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Dwarf d = new Dwarf();
		Elf e = new Elf();
		boolean battle = true;
		Scanner key = new Scanner(System.in);
		DwarfArmy da = new DwarfArmy(5);
		ElfArmy ea = new ElfArmy(5);

		do {
			System.out.println("To progress battle type g then hit enter.");
			String userInput = key.next();

			if (userInput.equals("g")) {
				ea.ElfArmyAttack(da);
				da.DwarfArmyAttack(ea);
				System.out.println("-----------------------------");
				da.PrintArmyStats();
				System.out.println("-----------------------------");
				System.out.println("-----------------------------");
				ea.PrintArmyStats();


			}
			if (d.GetHealth() <= 0 || e.GetHealth() <= 0) {
				System.out.println("BATTLE OVER");
				System.out.println("Would you like another battle? (yes/no)");
				String battleAgain = key.next();
				if (battleAgain.equals("yes")) {
					battle = true;
				} else {
					battle = false;
				}
			}
		} while (battle == true);

		System.out.println("GOOD BYE!");

	}
	
	/*ANYWAY

[1:47] 
now that you have that done

[1:47] 
in ElfArmy.AttackArmy(DwarfArmy)

[1:48] 
now you can loop over all your elves

[1:48] 
and for each elf

[1:48] 
choose a random dwarf to attack

[1:48] 
attack that Dwarf (shoot) and that’s it(edited)

	 */
	
}


