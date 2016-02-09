
public class Elf {
	private int mHealth;
	private int mAttackPower;
	private int mDefence;
	private int mSunderAmt = 4;
	private int mSunderDur = 0;
	private String mName;
	private String mRace = "elf";
	private final int SUNDER_DURATION = 5;



	public Elf() {
		mName = NameGenerator.generateName(mRace);
		RandomElf();
	}

	public void RandomElf() {
		mHealth = 1 + (int) (Math.random() * 89 + 1600);
		mAttackPower = 1 + (int) (Math.random() * 9 + 30);
		mDefence = 1 + (int) (Math.random() * 4 + 24);
	}

	public void Shoot(Dwarf dwarfToAttack) {
		System.out.println(mName + " Attacked " + dwarfToAttack.GetName() + " with Shoot.");
		dwarfToAttack.RandomBleed();
		dwarfToAttack.TakeDamage(mAttackPower);
	}

	public void SongOfElves() {
		System.out.println("Ynillor morn tulint i quettar");
		AddAttack(12);
		AddHealth(35);
		AddDefence(14);
		System.out.println("New Health Amount: " + GetHealth());
		System.out.println("New Attack Amount: " + GetAttack());
		System.out.println("New Defence Amount: " + GetDefence());
	}

	public void PrintStats() {
		System.out.println(mName + " The Elf's Stats are.");
		System.out.println("Health is: " + mHealth);
		System.out.println("Attack is: " + mAttackPower);
		System.out.println("Defence is: " + mDefence);
	}

	public void TakeDamage(int damage) {
		int tempArmor = mDefence;
		if (IsSundered()) {
			tempArmor -= mSunderAmt;
			System.out.println("armor: " + tempArmor);
		}
		int damageTaken = damage - tempArmor;
		if(damageTaken > 0) {
			mHealth -= damageTaken;
		}

		System.out.println(mName + " Took " + damageTaken + " Damage");
	}

	public boolean IsSundered() {
		return mSunderDur > 0;
	}

	public void SetSundered() {
		mSunderDur = SUNDER_DURATION;
	}

	public void Update() {
		Sundered();
		System.out.println("Current Sunder timer: " + mSunderDur);
	}
	public void RandomSunder() {
		if(!(IsSundered())){
			int sunder = 1 + (int) (Math.random() * 19);
			System.out.println("rolled sunder: " + sunder);
			if (sunder > 13) {
				SetSundered();
			}
		}
	}

	public void Sundered() {
		if (mSunderDur > 0) {
			mSunderDur -= 1;
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
		return mDefence;
	}

	public void SetDefence(int defence) {
		mDefence = defence;
	}

	public int AddDefence(int defence) {
		mDefence += defence;
		return defence;
	}

	public String GetName() {
		return mName;
	}

	public void SetName(String name) {
		mName = name;
	}
}