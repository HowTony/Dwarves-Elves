
public class DwarfArmy {
	private int mHealth;
	private int mAttackPower;
	private int mDefence;
	private int mArmySize;
	private String mName;
	private boolean mBleed;
	private String mDwarf = "dwarf";


	

	
	public DwarfArmy() {
	}
//		mHealth = health;
//		mAttackPower = attack;
//		mDefence = defence;
//		mArmySize = army;
//		mName = name;
//	}
	
	
	
	public static int PopulateArrayHealth(){
		int a = 1 + (int)(Math.random()*90 + 175);
		return a;
		
	}
	public static int PopulateArrayAttack(){
		int a = 1 + (int)(Math.random()*20 + 25);
		return a;
		
	}
	public static int PopulateArrayDefence(){
		int a = 1 + (int)(Math.random()*10 + 20);
		return a;
		
	}
	
}



//public static int[][] mDwarfArmy = {
//{PopulateArrayHealth(), PopulateArrayAttack(), PopulateArrayDefence()},
//{PopulateArrayHealth(), PopulateArrayAttack(), PopulateArrayDefence()},
//{PopulateArrayHealth(), PopulateArrayAttack(), PopulateArrayDefence()},
//{PopulateArrayHealth(), PopulateArrayAttack(), PopulateArrayDefence()},
//{PopulateArrayHealth(), PopulateArrayAttack(), PopulateArrayDefence()},
//};

