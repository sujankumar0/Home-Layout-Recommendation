package homelayout;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Family Size:");
        int familySize = sc.nextInt();

        System.out.println("Enter Budget (Low / Medium / High):");
        String budget = sc.next();

        System.out.println("Enter Plot Size (in sq.ft):");
        int plotSize = sc.nextInt();

        UserInput user = new UserInput(familySize, budget, plotSize);

        String imagePath = LayoutRecommendation.recommendLayout(user);

        // Swing Window
        JFrame frame = new JFrame("Recommended Home Layout");
        ImageIcon icon = new ImageIcon(imagePath);
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sc.close();
    }
}

