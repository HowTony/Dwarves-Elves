
public class Main {
	
	public static void main(String[] args) {
		Dwarf d = new Dwarf();
		Elf e = new Elf();

		e.PrintStats();
		System.out.println();
		d.PrintStats();
		System.out.println();
		d.Smash(e);
		System.out.println();
		e.Shoot(d);
		System.out.println("After casting smash\n");
		e.PrintStats();
		System.out.println();
		d.PrintStats();
	}
}
