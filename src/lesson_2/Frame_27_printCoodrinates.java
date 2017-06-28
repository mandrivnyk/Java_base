package lesson_2;

public class Frame_27_printCoodrinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCoordinates("a","1");
		printCoordinates("a","2");
		printCoordinates("a","3");
		printCoordinates("b","1");
		printCoordinates("b","2");
		
	}
	/**
	 * - TANKS 
	 */
		public static String getQuadrant(String v, String h){		
			String VisyY = "abcdefghi";
			int y = VisyY.indexOf(v) * 64;
			int x = (Integer.valueOf(h)-1)*64;
			return x+"_"+y;		 
		}
		
		public static void printCoordinates(String v, String h){
			String xy = getQuadrant(v,h);
			String x = xy.substring(0, xy.indexOf("_"));
			String y = xy.substring(xy.indexOf("_")+1);
			System.out.println(v+h+":("+y+"px;"+x+"px)");			
		}

}
