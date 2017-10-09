import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.*;

class EinText implements Printable {
	String textAufSeite1 = "Ein langer langer Text...";
	String textAufSeite2 = "Und noch was Geschriebenes...";
	
	private void schreiben(Graphics graphics, String text){
		graphics.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		graphics.drawString(text, 10, 10);
	}

	public int print(Graphics g, PageFormat pf, int pageIndex){
		if(pageIndex == 0){
			schreiben(g,textAufSeite1);
			return Printable.NO_SUCH_PAGE;
		}
		if(pageIndex == 1){
			schreiben(g,textAufSeite2);
			return Printable.NO_SUCH_PAGE;
		}
		return Printable.NO_SUCH_PAGE;
	}
	
}