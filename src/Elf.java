
public class Elf {
	private int mHealth;
	private int mAttackPower;
	private int mDefence;
	private String mName;
	private boolean mBleeding = false;
	private boolean mSundered = false;
	private int mBleedDmg = 2;
	private int mBleedDur = 4;
	private int mSunderAmt = 5;
	private int mSunderDur = 5;
	private String mRace = "elf";
	
	public Elf(){
		mName = NameGenerator.generateName(mRace);
		RandomElf();
	}
	
	public void RandomElf(){
		mHealth = 1 + (int)(Math.random()*90 +150);
		mAttackPower = 1 + (int)(Math.random()*10 +30);
		mDefence = 1 + (int)(Math.random()*5 + 18);
	}
	
	public void Shoot(Dwarf dwarfToAttack){
		System.out.println(mName + " Attacked " +
				dwarfToAttack.GetName() + " with Shoot.");
		dwarfToAttack.SetBleeding(true);
		dwarfToAttack.TakeDamage(mAttackPower);
	}
	
	public void SongOfElves(){
		System.out.println("Yénillor mornë tulintë i quettar");
		AddAttack(12);
		AddHealth(35);
		AddDefence(14);
		System.out.println("New Health Amount: " + GetHealth());
		System.out.println("New Attack Amount: " + GetAttack());
		System.out.println("New Defence Amount: " + GetDefence());
	}
	
	public void PrintStats(){
		System.out.println(mName + " The Elf's Stats are.");
		System.out.println("Health is: " + mHealth);
		System.out.println("Attack is: " + mAttackPower);
		System.out.println("Defence is: " + mDefence);
	}
	
	public void TakeDamage(int damage){
		int armor = mDefence; 
		if(IsSundered()){
			armor -= mSunderAmt;
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

