public class Elf extends Unit {

	public Elf() {
		mRace = "Elf";
		RandomUnit();
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
		PrintStats();
	}
}
