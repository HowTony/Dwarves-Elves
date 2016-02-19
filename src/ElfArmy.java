import java.util.ArrayList;

public class ElfArmy extends UnitArmy {

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
		IsElfUnitDead();
		while (chosen == null && mElves.size() > 0) {
			int elfIdx = (int) (Math.random() * (mElves.size()));
			chosen = mElves.get(elfIdx);
			mElves.get(elfIdx).PrintStats();

		}

		return chosen;
	}

	public void ElfArmyUpdate() {
		for (int elfIdx = 0; elfIdx < mElves.size(); elfIdx++) {
			mElves.get(elfIdx).Update();
		}
	}

	public void IsElfUnitDead() {
		for (int elfIdx = 0; elfIdx < mElves.size(); elfIdx++) {
			if (!(mElves.get(elfIdx).IsAlive())) {
				mElves.remove(elfIdx);
			}
		}
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

	public void TakeAreaDamage(int damage) {
		int damageEach = damage / mNumElves;
		for (int i = 0; i < mNumElves; i++) {
			mElves.get(i).TakeDamage(damageEach);
		}
	}
}
