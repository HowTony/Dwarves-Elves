public class Elf extends Unit {

	public Elf() {
		mRace = "Elf";
		RandomUnit();
	}

	public void SongOfElves() {
		System.out.println("Ynillor morn tulint i quettar");
		AddAttack(12);
		AddHealth(35);
		Adddefense(14);
		PrintStats();
	}
}
