package Quiz;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SelectCategory {
    private final ArrayList<String> categoryList = new ArrayList<>();

    JPanel panel = new JPanel();

    public void categoryPresenter() {
        categoryList.add("Matematik");
        categoryList.add("Marvel-filmer");
        categoryList.add("Kampsport");

        JButton cat1 = new JButton(categoryList.get(0));
        cat1.setBackground(new Color(30, 100, 150));
        cat1.setAlignmentX(Component.CENTER_ALIGNMENT);
        cat1.setPreferredSize(new Dimension(150, 75));
        panel.add(cat1);

        JButton cat2 = new JButton(categoryList.get(1));
        cat2.setBackground(new Color(30, 100, 150));
        cat2.setAlignmentX(Component.CENTER_ALIGNMENT);
        cat2.setPreferredSize(new Dimension(150, 75));
        panel.add(cat2);

        JButton cat3 = new JButton(categoryList.get(2));
        cat3.setBackground(new Color(30, 100, 150));
        cat3.setAlignmentX(Component.CENTER_ALIGNMENT);
        cat3.setPreferredSize(new Dimension(150, 75));
        panel.add(cat3);

        cat1.addActionListener(e -> {
            startNewGame(categoryList.get(0));
        });
        cat2.addActionListener(e -> {
            startNewGame(categoryList.get(1));
        });
        cat3.addActionListener(e -> {
            startNewGame(categoryList.get(2));
        });
    }

    JPanel getPanel() {
        return panel;
    }

    private void startNewGame(String category) {

    }
}
