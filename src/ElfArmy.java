public class ElfArmy {
    
    private static final int MAX_ELVES = 5;
    private Elf mElves[];
    private int mnumElves;
    
    public ElfArmy(int numElves) {
        if(numElves > MAX_ELVES) {
            numElves = MAX_ELVES;
        }
        
        mnumElves = numElves;
        
        // allocate array
        mElves = new Elf[numElves];
        
        // initialize each member of the array
        for(int i = 0; i < numElves; i++) {
            mElves[i] = new Elf(); // initialize each individual element of the array here
        }
    }
    public void PrintStrings() {
        for(int i = 0; i < mnumElves; i++) {
            System.out.println(mElves[i]);
        }
    }
    public void PrintArmyStats(){
    	for(int i = 0; i < mnumElves; i++){
    		mElves[i].PrintStats();
    	}
    }
}
