import java.io.File;
import Service.WalletManager;

public class Application {

    public static void main(String[] args) throws Exception{
        if(args.length < 1) {
            System.out.println("input file is required");
            System.exit(-1);
        }
        File file = new File(Application.class.getResource(args[0]).getFile());
        WalletManager manager = WalletManager.getInstance();
        manager.startProcess(file);
    }
}
