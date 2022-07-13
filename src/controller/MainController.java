package controller;

import view.MainViewSwing;

public class MainController {
    private MainViewSwing mainViewSwing;

    public MainController(MainViewSwing mainViewSwing) {

    }

    public static void main(String[] args) {
        new MainController(new MainViewSwing());
    }
}
