
public class ElfArmy extends UnitArmy {
	
	private static int MAX_ELVES = 10;

	public ElfArmy(int numElves) {
		super(numElves, MAX_ELVES);

		// initialize each member of the array
		for (int i = 0; i < mNumUnits; i++) {
			mUnits.add(new Elf());
		}
	}
}
