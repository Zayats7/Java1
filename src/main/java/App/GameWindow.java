package App;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame
{
    private int winWidth = 800;
    private int winHeight = 600;
    private int winPosX = 350;
    private int winPosY = 100;

    private GameMap map;
    private JPanel gui;

    private JPanel gameControls;
    private JButton btnStartGame;
    private JButton btnExitGame;

    private JPanel gameInfo;
    private JLabel mapSizeInfo;
    private JLabel countEnemyInfo;
    private JLabel gameRoundInfo;

    private JPanel playerInfo;
    private JLabel playerHealthInfo;
    private JLabel playerStepsInfo;

    private JPanel playerActions;
    private JButton moveUp;
    private JButton moveDown;
    private JButton moveLeft;
    private JButton moveRight;
    private JButton moveLeftUp;
    private JButton moveRightUp;
    private JButton moveLeftDown;
    private JButton moveRightDown;

    private JScrollPane containerForGameLog;
    private JTextArea gameLog;

    GameWindow()
    {
        prepareWindow();

        map = new GameMap();

        prepareGui();

        add(gui, BorderLayout.EAST);
        add(map);

        setVisible(true);
    }

    private void prepareGui()
    {
        gui = new JPanel();
        gui.setLayout(new GridLayout(5, 1));

        prepareGameControls();
        prepareGameInfo();
        preparePlayerInfo();
        preparePlayerActions();
        prepareGameActionsLog();

        gui.add(gameControls);
        gui.add(gameInfo);
        gui.add(playerInfo);
        gui.add(playerActions);
        gui.add(containerForGameLog);
    }

    private void prepareGameControls()
    {
        gameControls = new JPanel();
        gameControls.setLayout(new GridLayout(2, 1));
        gameControls.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        btnStartGame = new JButton("Start Game!");
        btnExitGame = new JButton("Exit Game!");

        gameControls.add(btnStartGame);
        gameControls.add(btnExitGame);
    }

    private void prepareGameInfo()
    {
        gameInfo = new JPanel();
        gameInfo.setLayout(new GridLayout(4, 1));
        gameInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        gameRoundInfo = new JLabel("Current Round: ");
        mapSizeInfo = new JLabel("Current map size: ");
        countEnemyInfo = new JLabel("Current enemy count: ");

        gameInfo.add(new JLabel("== Game Info =="));
        gameInfo.add(gameRoundInfo);
        gameInfo.add(mapSizeInfo);
        gameInfo.add(countEnemyInfo);
    }

    private void preparePlayerInfo()
    {
        playerInfo = new JPanel();
        playerInfo.setLayout(new GridLayout(3, 1));
        playerInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        playerHealthInfo = new JLabel("Health: - ");
        playerStepsInfo = new JLabel("Steps: -");

        playerInfo.add(new JLabel("== Player Info =="));
        playerInfo.add(playerHealthInfo);
        playerInfo.add(playerStepsInfo);
    }

    private void preparePlayerActions()
    {
        playerActions = new JPanel();
        playerActions.setLayout(new GridLayout(4,1));
        playerActions.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        moveUp = new JButton("UP");
        moveDown = new JButton("DOWN");
        moveLeft = new JButton("LEFT");
        moveRight = new JButton("RIGHT");
        moveLeftUp = new JButton("LEFT-UP");
        moveRightUp = new JButton("RIGHT-UP");
        moveLeftDown = new JButton("LEFT-DOWN");
        moveRightDown = new JButton("RIGHT-DOWN");

        playerActions.add(moveUp);
        playerActions.add(moveDown);
        playerActions.add(moveLeft);
        playerActions.add(moveRight);
        playerActions.add(moveLeftUp);
        playerActions.add(moveRightUp);
        playerActions.add(moveLeftDown);
        playerActions.add(moveRightDown);
    }

    private void prepareGameActionsLog()
    {
        gameLog = new JTextArea();
       containerForGameLog = new JScrollPane(gameLog,
               JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
               JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        gameLog.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        containerForGameLog.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    private void prepareWindow()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setTitle("Graphical App - Game");
        setResizable(false);
    }

}
