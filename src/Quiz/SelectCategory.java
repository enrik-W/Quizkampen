package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class SelectCategory extends JFrame implements ActionListener {
    public static void main(String[] args) {


        LocalQuestionDatabase questionDatabase = new LocalQuestionDatabase();
        ArrayList<String> categoriesToShow = new ArrayList<String>(3);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        InformationBuilder information = new InformationBuilder();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        frame.setVisible(true);
        frame.pack();
        frame.setSize(500, 600);
        frame.add(panel);
        frame.setTitle("Quizkampen");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color panelColor = new Color(30, 120, 200);
        Color buttonColor = new Color(60, 80, 120);

        panel.setVisible(true);
        panel.setBackground(panelColor);

        JLabel jLabel = new JLabel("Välj kategori", SwingConstants.CENTER);

        jLabel.setOpaque(true);
        jLabel.setBackground(Color.white);
        jLabel.setPreferredSize(new Dimension(200, 150));
        jLabel.setFont(new Font("Arial", Font.BOLD, 16));

        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(jLabel, gbc);


        ArrayList<QuestionBuilder> categoryList = questionDatabase.getQuestionList();

        for (int i = 0; i < categoryList.size(); i += 4) {
            categoriesToShow.add(categoryList.get(i).getCategory());
        }
        Collections.shuffle(categoriesToShow);

        JButton cat1 = new JButton(categoriesToShow.get(0));
        cat1.setBackground(new Color(30, 110, 130));
        cat1.setAlignmentX(Component.CENTER_ALIGNMENT);
        cat1.setPreferredSize(new Dimension(250, 150));
        panel.add(cat1);

        JButton cat2 = new JButton(categoriesToShow.get(1));
        cat2.setBackground(new Color(30, 110, 130));
        cat2.setAlignmentX(Component.CENTER_ALIGNMENT);
        cat2.setPreferredSize(new Dimension(250, 150));
        panel.add(cat2);

        JButton cat3 = new JButton(categoriesToShow.get(2));
        cat3.setBackground(new Color(30, 110, 130));
        cat3.setAlignmentX(Component.CENTER_ALIGNMENT);
        cat3.setPreferredSize(new Dimension(250, 150));
        panel.add(cat3);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }


    //private void startNewGame (String category){
    //GUIGamePanel game = new GUIGamePanel();}

    // Choose category
    //SelectCategory category = new SelectCategory();
    // category.buttonBuilder();
}


