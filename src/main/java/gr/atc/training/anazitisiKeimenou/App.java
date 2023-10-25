package gr.atc.training.anazitisiKeimenou;

public class App {
    
    
	public static void main(String[] args) {
		if (args.length !=2 ) {
			System.out.println("Args number not valid.");
			return;
		}
		
		
		String path = args[0];
		System.out.println(path);
		String lexi=args[1];
		System.out.println(lexi);
		EpexergasiaKeimenou ek = new EpexergasiaKeimenou();
		ek.readFile(path,lexi); // kaloume ti methodo gia na diavasoume to arxeio
	
}
}
