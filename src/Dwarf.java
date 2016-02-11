// Dwarf class Author:Tony
public class Dwarf extends Unit{
	private String mRace = "Dwarf";
	
	public Dwarf() {
		RandomUnit(mRace);
	}
	
	public void Smash(Elf elfToAttack) {
		System.out.println(GetName() + " Attacked " + elfToAttack.GetName() + " with smash.");
		elfToAttack.RandomSunder();
		elfToAttack.TakeDamage(GetAttack());
	}

	public void BattleCry() {
		System.out.println(GetName() + " Screams RAWRGGG DWARF SMAUSH!!!");
		AddAttack(10);
		AddHealth(50);
		Adddefense(8);
		GetStats();
	}
	
	public void GetStats(){
		PrintStats(mRace);
	}

	

	


	
}
