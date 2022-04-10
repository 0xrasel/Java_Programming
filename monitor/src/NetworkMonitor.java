//Network monitoring tool

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class NetworkMonitor {

    private String source;
    private String target;
    private int port;

    public static void main(String[] args) throws UnknownHostException, IOException {

        if (args.length != 3){
            System.out.println("First compile java code using javac command\n");
            System.out.printf("Usage:\njava -jar net-monitor.jar src_ip dest_ip port\n");
            return;
        }

        NetworkMonitor m = new NetworkMonitor(); //constractor

        m.setSource(args[0]);
        m.setTarget(args[1]);
        m.setPort(Integer.valueOf(args[2]));

        m.start();
    }

    private void setSource(String s) {
        source = s;
    }

    private void start() throws UnknownHostException, IOException {
        Timer t = new Timer(false); //setting timer here
        t.schedule(new TesteConexaoTask(), 0, 1000);
    }

    private void setPort(int p) {
        port = p; //setting port as p
    }

    private void setTarget(String t) {
        target = t;
    }
//Inheritance
    class TesteConexaoTask extends TimerTask {

        @Override
        public void run() {
            try{
                Socket s = new Socket();
                InetSocketAddress sourceAdder = new InetSocketAddress(source, 0);
                InetSocketAddress destAdder = new InetSocketAddress(target, port);
                s.bind(sourceAdder);
                s.connect(destAdder, 1000);
                if (s.isConnected()){
                    System.out.println(new Date() + " " + target + " : " + port + " [CONNECTED]");
                    s.close();
                }else{
                    System.out.println(new Date() + " " + target + " : " + port + " [DISCONNECTED]");
                };
            }catch(Exception e){
                System.out.println(new Date() + " "+ target + " : " + port + " [DISCONNECTED]");
            }

        }



    }
}