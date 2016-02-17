import java.util.ArrayList;

public class DwarfArmy {

	private static final int MAX_DWARVES = 5;
	private ArrayList<Dwarf> mDwarves;
	private int mNumDwarves;

	public DwarfArmy(int numDwarves) {

		// allocate array
		mDwarves = new ArrayList<Dwarf>(MAX_DWARVES);

		mNumDwarves = numDwarves;

		// initialize each member of the array
		for (int i = 0; i < numDwarves; i++) {
			Dwarf newDwarf = new Dwarf();
			mDwarves.add(newDwarf);
		}
	}

	Dwarf ChooseLivingDwarf() {
		Dwarf chosen = null;

		while (chosen == null && mDwarves.size() > 0) {
			int dwarfIdx = (int) (Math.random() * (mDwarves.size()));

			if (mDwarves.get(dwarfIdx).IsAlive()) {
				chosen = mDwarves.get(dwarfIdx);
				mDwarves.get(dwarfIdx).PrintStats();
			} else {
				mDwarves.remove(dwarfIdx);
			}
		}

		return chosen;
	}

	public void DwarfArmyAttack(ElfArmy elfToAttack) {
		for (int dwarfIdx = 0; dwarfIdx < mDwarves.size(); dwarfIdx++) {
			Dwarf dwarf = mDwarves.get(dwarfIdx);
			Elf elf = elfToAttack.ChooseLivingElf();
			elf.TakeDamage(dwarf.GetAttack());
			System.out.println(dwarf.GetName() + " Attacked " + elf.GetName() + " with Attack.");
		}
	}

	public void PrintArmyStats() {
		for (int i = 0; i < mDwarves.size(); ++i) {
			mDwarves.get(i).PrintStats();
			System.out.println("-----------------------------");
		}
	}

	public void TakeDamage(int damage) {
		int damageEach = damage / mNumDwarves;
		for (int i = 0; i < mNumDwarves; i++) {
			mDwarves.get(i).TakeDamage(damageEach);
		}
	}
}
