import java.util.ArrayList;

public class ElfArmy {

	private static final int MAX_ELVES = 5;
	private ArrayList<Elf> mElves;
	private int mNumElves;

	public ElfArmy(int numElves) {

		// allocate array
		mElves = new ArrayList<Elf>(MAX_ELVES);

		mNumElves = numElves;

		// initialize each member of the array
		for (int i = 0; i < numElves; i++) {
			Elf newElf = new Elf(); // initialize each individual element of the
			mElves.add(newElf); // array here
		}
	}

	Elf ChooseLivingElf() {
		Elf chosen = null;

		while (chosen == null && mElves.size() > 0) {
			int elfIdx = (int) (Math.random() * (mElves.size()));

			if (mElves.get(elfIdx).IsAlive()) {
				chosen = mElves.get(elfIdx);
				mElves.get(elfIdx).PrintStats();
			} else {
				mElves.remove(elfIdx);
			}
		}

		return chosen;
	}

	public void ElfArmyAttack(DwarfArmy dwarfToAttack) {
		for (int elfIdx = 0; elfIdx < mElves.size(); elfIdx++) {
			Elf elf = mElves.get(elfIdx);
			Dwarf dwarf = dwarfToAttack.ChooseLivingDwarf();
			dwarf.TakeDamage(elf.GetAttack());
			System.out.println(elf.GetName() + " Attacked " + dwarf.GetName() + " with Attack.");
		}
	}

	public void PrintArmyStats() {
		for (int i = 0; i < mElves.size(); ++i) {
			mElves.get(i).PrintStats();
			System.out.println("-----------------------------");
		}
	}

	public void TakeDamage(int damage) {
		int damageEach = damage / mNumElves;
		for (int i = 0; i < mNumElves; i++) {
			mElves.get(i).TakeDamage(damageEach);
		}
	}
}
