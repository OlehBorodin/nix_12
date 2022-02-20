package level3;

public class RunnerGame {
    public static void runGame() {
        System.out.println("Да начнеться игра в жизнь...");
        Window window = new Window();
        javax.swing.SwingUtilities.invokeLater(window);
    }
}
