public class ElfArmy {

	private static final int MAX_ELVES = 5;
	private Elf mElves[];
	private int mNumElves;

	public ElfArmy(int numElves) {
		if (numElves > MAX_ELVES) {
			numElves = MAX_ELVES;
		}

		mNumElves = numElves;

		// allocate array
		mElves = new Elf[numElves];

		// initialize each member of the array
		for (int i = 0; i < numElves; i++) {
			mElves[i] = new Elf(); // initialize each individual element of the
									// array here
		}
	}

	public void PrintArmyStats() {
		for (int i = 0; i < mNumElves; i++) {
			mElves[i].GetStats();
		}
	}

	public void TakeDamage(int damage) {
		int damageEach = damage / mNumElves;
		for (int i = 0; i < mNumElves; i++) {
			mElves[i].TakeDamage(damageEach);
		}

	}
}
