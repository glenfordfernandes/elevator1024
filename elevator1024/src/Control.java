
public class Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		building bldg = new building(10);
		
		bldg.floors.get(5).fpanel.ecallBtn.press();
		bldg.elevator.elevpanel.ePanel.get(3).fBtnPress();
		bldg.floors.get(7).fpanel.ecallBtn.press();
		bldg.elevator.elevpanel.ePanel.get(9).fBtnPress();
		
	}

}
