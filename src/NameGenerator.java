import java.util.Random;

public class NameGenerator {
	
	private final static String DWARF_TAG = "dwarf";
	private final static String ELF_TAG = "elf";

	private final static String[] DWARF_START_NAME = { "Bil", "Bal", "Gil", "Ga", "Gall",
	         "Fal", "Brell", "Gim", "Klo", "Far", "Nor", "Durr", "Gim", "Dor",
	         "Gom", "Mad", "Ket", "Sim", "Dal", "Her", "Fim", "Haum", "Bni",
	         "Bof", "Dwo", "Run", "Bar", "Gimll" };
	 
	private final static String[] DWARF_END_NAME = { "amir", "amor", "ar", "aim", "mee", "gin",
	         "aum", "alur", "fre", "in", "ur", "til", "rim", "intil", "grim",
	         "ri", "lak", "goli", "gol", "artil" };
	 
	private final static String[] ELF_START_NAME = { "Theod", "Wyn", "Corn", "Kery", "Ilth",
	         "Jon", "Wyl", "Mha", "Iymb", "Zabb", "Naer", "Mard", "Tas", "Or",
	         "Aumr", "Al", "Deldr", "Folm", "Ell", "Dru", "Purth", "Ehl", "Elb",
	         "Fal", "Jupp", "Kat", "Tord", "Nham" };
	 
	private final static String[] ELF_END_NAME = { "mon", "aith", "yth", "uryn", "ik", "chyr",
	         "enal", "ryl", "as", "tho", "eiym", "ar", "ist", "auth", "ok",
	         "ach", "arwyn", "uin", "indar", "ark" , "uin", "amede" , "ion", "authin" ,
	         "alael", "ynnar" , "aldir", "aelar", "ashal" };

	private static Random rand = new Random();

	public static String generateName(String race) {
		if(race.equals(DWARF_TAG)){
			return DWARF_START_NAME[rand.nextInt(DWARF_START_NAME.length)] + 
		 			DWARF_END_NAME[rand.nextInt(DWARF_END_NAME.length)];
		}
		else if(race.equals(ELF_TAG)){
			return ELF_START_NAME[rand.nextInt(ELF_START_NAME.length)] + 
					ELF_END_NAME[rand.nextInt(ELF_END_NAME.length)];
		}
		else
			 return "GOD";
		}
	
}
