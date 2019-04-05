package cal;

public class Main{
	
	public static void main(String[] args){
		
		Model M = new Model();
		View V 	= new View();

		Controller C = new Controller();
		C.addModel(M);
		C.addView(V);
		C.initModel(0.0, 0.0);

		V.addController(C);

	}
}