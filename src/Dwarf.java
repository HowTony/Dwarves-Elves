public class Dwarf extends Unit {
	

	public Dwarf() {
		mRace = "Dwarf";
		RandomUnit();
	}


	public void BattleCry() {
		System.out.println(GetName() + " Screams RAWRGGG DWARF SMAUSH!!!");
		AddAttack(10);
		AddHealth(50);
		Adddefense(8);
		PrintStats();;
	}
}
