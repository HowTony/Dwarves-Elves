
public class Dwarf {
	private int mHealth;
	private int mAttackPower;
	private int mDefence;
	private String mName;
	private boolean mBleeding = false;
	private boolean mSundered = false;
	private int mBleedDmg = 2;
	private int mBleedDur = 4;
	private int mSunderDur = 5;
	private String mRace = "dwarf";
	
	public Dwarf(){
		mName = NameGenerator.generateName(mRace);
		RandomDwarf();
	}
	
	public void RandomDwarf(){
		mHealth = 1 + (int)(Math.random()*90 +175);
		mAttackPower = 1 + (int)(Math.random()*10 +25);
		mDefence = 1 + (int)(Math.random()*5 + 22);
	}
	
	public void Smash(Elf elfToAttack){
		System.out.println(mName + " Attacked " +
				elfToAttack.GetName() + " with smash.");
		elfToAttack.SetSundered(true);
		elfToAttack.TakeDamage(mAttackPower);
	}
	
	public void BattleCry(){
		System.out.println(mName + " Screams RAWRGGG DWARF SMAUSH!!!");
		AddAttack(10);
		AddHealth(50);
		AddDefence(8);
		System.out.println("New Health Amount: " + GetHealth());
		System.out.println("New Attack Amount: " + GetAttack());
		System.out.println("New Defence Amount: " + GetDefence());
	}
	
	public void PrintStats(){
		System.out.println(mName + " The Dwarf's Stats are.");
		System.out.println("Health is: " + mHealth);
		System.out.println("Attack is: " + mAttackPower);
		System.out.println("Defence is: " + mDefence);
	}
	
	public void TakeDamage(int damage){
		int armor = mDefence; 
		if(IsBleeding()){
			mHealth -= (mBleedDur*mBleedDmg);
			System.out.println(mName + " Took " + (mBleedDur*mBleedDmg) + " Bleed Damage");
		}
		damage -= armor;
		if(damage > 0){
			mHealth -= damage;
			System.out.println(mName + " Took " + damage + " Damage");
		}
	}

	public boolean IsBleeding(){
		return mBleeding;
	}
	
	public boolean IsSundered(){
		return mSundered;
	}
	
	public void SetBleeding(boolean isBleeding){
		mBleeding = isBleeding;
	}
	
	public void SetSundered(boolean isSundered){
		mSundered = isSundered;
	}
	
	public int GetHealth(){
		return mHealth;
	}
	
	public void SetHealth(int health){
		mHealth = health;
	}
	
	public int AddHealth(int health){
		mHealth += health; 
		return health;
	}
	
	public int GetAttack(){
		return mAttackPower;
	}
	
	public void SetAttack(int attack){
		mAttackPower = attack;
	}
	
	public int AddAttack(int attack){
		mAttackPower += attack;
		return attack;
	}
	
	public int GetDefence(){
		return mDefence;
	}
	
	public void SetDefence(int defence){
		mDefence = defence;
	}
	
	public int AddDefence(int defence){
		mDefence += defence;
		return defence;
	}
	
	public String GetName(){
		return mName;
	}
	
	public void SetName(String name){
		mName = name;
	}
}
