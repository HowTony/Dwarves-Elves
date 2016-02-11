public class Unit {
	protected int mHealth;
	protected int mAttackPower;
	protected int mDefense;
	protected int mBleedDmg = 5;
	protected int mBleedDur = 0;
	protected int mSunderAmt = 4;
	protected int mSunderDur = 0;
	protected final int BLEED_DURATION = 4;
	protected final int SUNDER_DURATION = 5;
	protected String mName;
	protected String mRace;

	public void Update() {
		Bleeding();
		System.out.println(mName + " Current Bleed timer: " + mBleedDur);
		Sundered();
		System.out.println(mName + " Current Sunder timer: " + mSunderDur);
	}

	public void RandomUnit() {
		mName = NameGenerator.generateName(mRace);
		mHealth = 1 + (int) (Math.random() * 49 + 1750);
		mAttackPower = 1 + (int) (Math.random() * 4 + 25);
		mDefense = 1 + (int) (Math.random() * 4 + 20);
	}

	public void TakeDamage(int damage) {
		int tempArmor = mDefense;
		if (IsSundered()) {
			tempArmor -= mSunderAmt;
			System.out.println("armor: " + tempArmor);
		}
		int damageTaken = damage - tempArmor;
		if (damageTaken > 0) {
			mHealth -= damageTaken;
			System.out.println(GetName() + " Took " + damageTaken + " Damage");
		}
	}

	public void RandomBleed() {
		if (!(IsBleeding())) {
			int bleed = 1 + (int) (Math.random() * 19);
			System.out.println("rolled bleed: " + bleed);
			if (bleed > 13) {
				SetBleeding();
				System.out.println("BLEED SUCCESS");
			}
		}
	}

	public void RandomSunder() {
		if (!(IsSundered())) {
			int sunder = 1 + (int) (Math.random() * 19);
			System.out.println("rolled sunder: " + sunder);
			if (sunder > 13) {
				SetSundered();
				System.out.println("SUNDER SUCCESS");
			}
		}
	}

	public void PrintStats() {
		System.out.println(mName + " The " + mRace + "'s Stats are.");
		System.out.println("Health is: " + mHealth);
		System.out.println("Attack is: " + mAttackPower);
		System.out.println("defense is: " + mDefense);
	}

	public int GetHealth() {
		return mHealth;
	}

	public void SetBleeding() {
		mBleedDur = BLEED_DURATION;
	}

	public boolean IsBleeding() {
		return mBleedDur > 0;
	}

	public void Bleeding() {
		if (IsBleeding()) {
			mHealth -= mBleedDmg;
			System.out.println(mName + " Took " + (mBleedDmg) + " Bleed Damage");
			mBleedDur -= 1;
		}
	}

	public void Sundered() {
		if (IsSundered()) {
			mSunderDur -= 1;
		}
	}

	public boolean IsSundered() {
		return mSunderDur > 0;
	}

	public void SetSundered() {
		mSunderDur = SUNDER_DURATION;
	}

	public void SetHealth(int health) {
		mHealth = health;
	}

	public int AddHealth(int health) {
		mHealth += health;
		return health;
	}

	public int GetAttack() {
		return mAttackPower;
	}

	public void SetAttack(int attack) {
		mAttackPower = attack;
	}

	public int AddAttack(int attack) {
		mAttackPower += attack;
		return attack;
	}

	public int GetDefense() {
		return mDefense;
	}

	public void Setdefense(int defense) {
		mDefense = defense;
	}

	public int Adddefense(int defense) {
		mDefense += defense;
		return defense;
	}

	public String GetName() {
		return mName;
	}

	public void SetName(String name) {
		mName = name;
	}
}
