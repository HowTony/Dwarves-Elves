import java.util.ArrayList;

abstract public class UnitArmy {

	protected static final int MAX_UNITS = 5;
	protected ArrayList<Unit> mUnits;
	protected int mNumUnits;

	// public UnitArmy(int numUnits){
	//
	// // allocate array
	// mUnits = new ArrayList<Unit>(MAX_UNITS);
	//
	// mNumUnits = numUnits;
	//
	// // initialize each member of the array
	// for (int i = 0; i < mNumUnits; i++) {
	// Unit newUnit = new Unit();
	// mUnits.add(newUnit);
	// }
	//
	// }

	Unit ChooseLivingUnit() {
		Unit chosen = null;
		while (chosen == null && mUnits.size() > 0) {
			int UnitIdx = (int) (Math.random() * (mUnits.size()));
			if (mUnits.get(UnitIdx).IsAlive()) {
				chosen = mUnits.get(UnitIdx);
				mUnits.get(UnitIdx).PrintStats();
			} else {
				mUnits.remove(UnitIdx);
			}
		}
		return chosen;
	}

	public void ArmyUpdate() {
		for (int UnitIdx = 0; UnitIdx < mUnits.size(); UnitIdx++) {
			mUnits.get(UnitIdx).Update();
		}
	}

	public void IsArmyUnitAlive() {
		for (int UnitIdx = 0; UnitIdx < mUnits.size(); UnitIdx++) {
			if (!(mUnits.get(UnitIdx).IsAlive())) {
				mUnits.remove(UnitIdx);
			}
		}
	}

	// public void UnitArmyAttack(UnitArmy unitToAttack) {
	// for (int unitIdx = 0; unitIdx < mUnits.size(); unitIdx++) {
	// Unit unitAttacking = mUnits.get(unitIdx);
	// Unit unitDefending = unitToAttack.ChooseLivingUnit();
	// unitDefending.TakeDamage(unitAttacking.GetAttack());
	// System.out.println(unitAttacking.GetName() + " Attacked " +
	// unitDefending.GetName() + " with Attack.");
	// }
	// }

	public void PrintArmyStats() {
		for (int i = 0; i < mUnits.size(); ++i) {
			mUnits.get(i).PrintStats();
			System.out.println("-----------------------------");
		}
	}

	public void TakeAreaDamage(int damage) {
		int damageEach = damage / mNumUnits;
		for (int i = 0; i < mNumUnits; i++) {
			mUnits.get(i).TakeDamage(damageEach);
		}
	}
}
