import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		 Queue que;
		 List<Command> lista = new ArrayList<Command>();
		 lista.add(new Command(new Giant(Type.FEE)));
		 lista.add(new Command(new Giant(Type.PHI)));
		 lista.add(new Command(new Giant(Type.PHEAUX)));
		 lista.add(new Command(new Giant(Type.FEE)));
		 lista.add(new Command(new Giant(Type.PHI)));
		 lista.add(new Command(new Giant(Type.PHEAUX)));
		 
		 for (int i = 0; i < lista.size(); i++) {
			lista.get(i).execute();
			
		}
		 
	}

}
