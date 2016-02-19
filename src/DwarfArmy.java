
public class DwarfArmy extends UnitArmy {
	
	private static int MAX_DWARVES = 15;

	public DwarfArmy(int numDwarves) {
		super(numDwarves, MAX_DWARVES);

		// initialize each member of the array
		for (int i = 0; i < mNumUnits; i++) {
			Dwarf newDwarf = new Dwarf();
			mUnits.add(newDwarf);
		}
	}
}
