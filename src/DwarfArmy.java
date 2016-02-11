public class DwarfArmy {
    
    private static final int MAX_DWARVES = 5;
    private Dwarf mDwarves[];
    private int mNumDwarves;
    
    public DwarfArmy(int numDwarves) {
        if(numDwarves > MAX_DWARVES) {
            numDwarves = MAX_DWARVES;
        }
        
        mNumDwarves = numDwarves;
        
        // allocate array
        mDwarves = new Dwarf[numDwarves];
        
        // initialize each member of the array
        for(int i = 0; i < numDwarves; i++) {
            mDwarves[i] = new Dwarf(); // initialize each individual element of the array here
        }
    }
    
    public void PrintArmyStats(){
    	for(int i = 0; i < mNumDwarves; i++){
    		mDwarves[i].GetStats();
    	}
    }
    
   public void TakeDamage(int damage){
	   int damageEach = damage / mNumDwarves;
	   for(int i = 0; i < mNumDwarves; i++){
		   mDwarves[i].TakeDamage(damageEach);
	   }
	   
   }
    
    
}


