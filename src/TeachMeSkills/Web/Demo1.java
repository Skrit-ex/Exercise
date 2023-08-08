package TeachMeSkills.Web;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
        httpServer.createContext("/test", new TestHandler());
        httpServer.createContext("/calc", new CalculatorWeb1());
        httpServer.start();
    }
}
