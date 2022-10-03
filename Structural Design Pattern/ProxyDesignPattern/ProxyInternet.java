import java.util.Scanner;

public class ProxyInternet implements Internet {
    Scanner sc = new Scanner(System.in);
    private RealInternet ri = new RealInternet();

    public void showData() {
        if (sc.nextLine().equals("Fuck you bitch")) {
            ri.showData();
            return;
        } else {
            System.out.println("Fuck you too bitch you PROXY dumbfuck");
        }
    }
}
