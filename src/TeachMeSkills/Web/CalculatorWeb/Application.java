package TeachMeSkills.Web.CalculatorWeb;

import TeachMeSkills.Web.CalculatorWeb.util.ConsoleReader;
import TeachMeSkills.Web.CalculatorWeb.util.ConsoleWriter;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.Optional;

public class Application {
    private static final ConsoleReader reader = new ConsoleReader();
    private static final ConsoleWriter writer = new ConsoleWriter();
    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) throws IOException {
        writer.write("Enter num1");
        double num1 = reader.readDouble();
        writer.write("Enter num2");
        double num2 = reader.readDouble();
        writer.write("Enter typeOperation");
        String type = reader.readString();
        Operation op = new Operation(num1, num2, type);
        Optional<Operation> result = calculator.calculate(op);
        writer.write("" + op.getResult());
        server();


    }
    private static void server()throws IOException{
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8070), 0);
        httpServer.createContext("/calculatorDemo", new HttpExchangeDemo());
        httpServer.start();
    }
}
