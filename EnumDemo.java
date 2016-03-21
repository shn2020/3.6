import javax.swing.JOptionPane;
public class EnumDemo {
	private enum Month {January,February,March,April,May,June,July,August,September,October,November,December}
	
	public static void main(String[] args) {
		Month [] choices =  {Month.January,Month.February,Month.March,Month.April,
				Month.May,Month.June,Month.July,Month.August,Month.September,Month.October,
				Month.November,Month.December};
		Month month = (Month) JOptionPane.showInputDialog(null,"Select you month","Month",
				JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
	
		while (month != null) {
			switch (month) {
			case December: case January: case February:   printMonth(" Do you want to build a snow man!"); break;
			case March: case April: case May: printMonth(" Happy Spring days!"); break;
			case June: case July: case August: printMonth("It's summer time!"); break;
			case September: case October: case November : printMonth("Welcome to the foliage season!"); break;
			}
		 month = (Month) JOptionPane.showInputDialog(null,"Select you month","Month",
					JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);	
		}

		JOptionPane.showMessageDialog(null,"Goodbye!");
	}
	
	public static void printMonth(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
}