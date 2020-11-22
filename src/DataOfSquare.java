import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {
	
	
//	array list that contains the colors
	ArrayList<Color> C =new ArrayList<Color>();
	int color; //2: snake , 1: food, 0:empty
	SquarePanel square;
	public DataOfSquare(int col) {
//		adding color to the arrayList
		C.add(Color.darkGray);//0
		C.add(Color.Blue); //1
		C.add(Color.white); //2
		color=col;
		square = new SquarePanel(C.get(c));
	}
	public void lightMeUp(int c) {
		square.ChangeColor(C.get(c));
	}
}