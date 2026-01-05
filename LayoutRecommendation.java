package homelayout;

public class LayoutRecommendation {
	
	public static String recommendLayout(UserInput user) {

        if (user.familySize <= 2 && user.plotSize < 800) {
            return "images/1bhk.jpg";
        } 
        else if (user.familySize <= 4 && user.plotSize >= 800 && user.plotSize <= 1500) {
            return "images/2bhk.jpg";
        } 
        else {
            return "images/3bhk.jpg";
        }
    }
}

