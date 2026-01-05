package houseplanner.layout;

import houseplanner.model.House;

public class SimpleLayoutGenerator implements LayoutGenerator {
	 @Override
	    public void generateLayout(House house) {
	        System.out.println("Generating simple layout...");
	        System.out.println("Total rooms: " + house.getRooms().size());
	    }
}
