import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.*;

public class Ausdruck {
	public static void main(String[] args) throws PrinterException {
		PrinterJob pjob = PrinterJob.getPrinterJob();
		if ( pjob.printDialog() == false )   
			return;
		pjob.setPrintable( new EinText() );
		pjob.print();
	}
}