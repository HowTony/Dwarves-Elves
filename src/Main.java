import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Dwarf d = new Dwarf();
		Elf e = new Elf();
		boolean battle = true;
		Scanner key = new Scanner(System.in);
		DwarfArmy da = new DwarfArmy(5);
		ElfArmy ea = new ElfArmy(5);

		do{
			System.out.println("To progress battle type g then hit enter.");
			String userInput = key.next();
				
			if(userInput.equals("g")){
				System.out.println();
				d.Smash(e);
				System.out.println();
				e.Shoot(d);
				System.out.println();
				e.GetStats();
//				System.out.println();
				d.GetStats();
				d.Update();
				e.Update();

				
				
				
			}
			if(d.GetHealth() <= 0 || e.GetHealth() <= 0){
				System.out.println("BATTLE OVER");
				System.out.println("Would you like another battle? (yes/no)");
				String battleAgain = key.next();
				if(battleAgain.equals("yes")){
					battle = true;
				}
				else{
					battle = false;
				}
			}
		}while(battle == true);
		
		System.out.println("GOOD BYE!");
			
		
	}
}
