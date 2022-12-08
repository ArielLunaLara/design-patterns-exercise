package oop.inheritance;

import oop.inheritance.data.SupportedTerminal;

public class Main {

    public static void main(String[] args) {
        Application1 application = new Application1(SupportedTerminal.INGENICO);

        while (true) {
            run(application);
        }
    }

    public static void run(Application1 application) {
        application.clearScreen();
        application.showMenu();

        String key = application.readKey();

        switch (key) {
            case "1":
                application.doSale();
                break;
            case "2":
                application.doRefund();
                break;
            case "3":
                application.printReport();
                break;
            case "4":
                application.showConfiguration();
                break;
        }
    }

}
