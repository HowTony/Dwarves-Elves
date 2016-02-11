
public class Elf extends Unit{
	private String mRace = "Elf";
	
	public Elf() {
		RandomUnit(mRace);	
	}

	public void Shoot(Dwarf dwarfToAttack) {
		System.out.println(GetName() + " Attacked " + dwarfToAttack.GetName() + " with Shoot.");
		dwarfToAttack.RandomBleed();
		dwarfToAttack.TakeDamage(GetAttack());
	}

	public void SongOfElves() {
		System.out.println("Ynillor morn tulint i quettar");
		AddAttack(12);
		AddHealth(35);
		Adddefense(14);
		GetStats();
	}
	
	public void GetStats(){
		PrintStats(mRace);
	}
	
}