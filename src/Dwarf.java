public class Dwarf extends Unit {
	

	public Dwarf() {
		mRace = "Dwarf";
		RandomUnit();
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
		PrintStats();;
	}
}

/*


mbradber [8:46 PM] 
print out the first line

[8:46] 
and then call super.PrintStats()

[8:46] 
to do the rest of the common stuff

[8:46] 
so in Unit

[8:46] 
in PrintStats

[8:47] 
the first line is specific to the type of race

[8:47] 
just override that in the subclasses, and let them print that line with their own race

tony [8:47 PM] 
yeah i had to make that when i didnt know about protected :wink:

mbradber [8:47 PM] 
then they can call super.PrintStats() to finish the last 3 common lines



*/