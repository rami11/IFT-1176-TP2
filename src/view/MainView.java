package view;

import view.menu.AboutMenu;
import view.menu.ApplicationMenu;
import view.menu.FichierMenu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rsn on 2017-06-09.
 */
public class MainView extends JFrame {
    private static final JFrame mainView = new MainView("IFT-1176 (TP2)");

    private MainView(String titre) {

        setLayout(new BorderLayout());
        setTitle(titre);
        setResizable(false);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fichierMenu = new FichierMenu("Fichier");
        JMenu applicationMenu = new ApplicationMenu("Application");
        JMenu aboutMenu = new AboutMenu("À propos");

        menuBar.add(fichierMenu);
        menuBar.add(applicationMenu);
        menuBar.add(aboutMenu);

        JPanel fichierDonneesPanel = new FichiersDonneesPanel();

        add(fichierDonneesPanel, BorderLayout.NORTH);

        ImageIcon udemImage = new ImageIcon("img/logo_udem_medium.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(udemImage);

        add(imageLabel, BorderLayout.CENTER);
    }

    public static JFrame getInstance() {
        return mainView;
    }

    public void showView() {
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
