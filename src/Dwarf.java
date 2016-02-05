
public class Dwarf {
	private int mHealth;
	private int mAttackPower;
	private int mDefense;
	private String mName;
	// private boolean mBleeding = false;
	private int mBleedDmg = 5;
	private int mBleedDur = 0;
	private String mRace = "dwarf";
	private final int BLEED_DURATION = 4;

	public Dwarf() {
		mName = NameGenerator.generateName(mRace);
		RandomDwarf();
	}

	public void RandomDwarf() {
		mHealth = 1 + (int) (Math.random() * 89 + 1750);
		mAttackPower = 1 + (int) (Math.random() * 9 + 25);
		mDefense = 1 + (int) (Math.random() * 4 + 22);
	}

	public void Smash(Elf elfToAttack) {
		System.out.println(mName + " Attacked " + elfToAttack.GetName() + " with smash.");
		elfToAttack.SetSundered();
		elfToAttack.TakeDamage(mAttackPower);
	}

	public void BattleCry() {
		System.out.println(mName + " Screams RAWRGGG DWARF SMAUSH!!!");
		AddAttack(10);
		AddHealth(50);
		AddDefence(8);
		System.out.println("New Health Amount: " + GetHealth());
		System.out.println("New Attack Amount: " + GetAttack());
		System.out.println("New Defence Amount: " + GetDefence());
	}

	public void PrintStats() {
		System.out.println(mName + " The Dwarf's Stats are.");
		System.out.println("Health is: " + mHealth);
		System.out.println("Attack is: " + mAttackPower);
		System.out.println("Defence is: " + mDefense);
	}

	public void TakeDamage(int damage) {
		damage -= mDefense;
		if (damage > 0) {
			mHealth -= damage;
			System.out.println(mName + " Took " + damage + " Damage");
		}
	}

	public void Update() {
		Bleeding();
	}

	public void RandomBleed() {
		int bleed = 1 + (int) (Math.random() * 19);
		System.out.println("rolled bleed: " + bleed);
		if (bleed > 13) {
			SetBleeding();
		}
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

	public int GetHealth() {
		return mHealth;
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

	public int GetDefence() {
		return mDefense;
	}

	public void SetDefence(int defence) {
		mDefense = defence;
	}

	public int AddDefence(int defence) {
		mDefense += defence;
		return defence;
	}

	public String GetName() {
		return mName;
	}

	public void SetName(String name) {
		mName = name;
	}
}
