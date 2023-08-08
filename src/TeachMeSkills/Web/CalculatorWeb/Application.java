package TeachMeSkills.Web.CalculatorWeb;

import TeachMeSkills.Generic.Optional;
import TeachMeSkills.Web.CalculatorWeb.util.ConsoleReader;
import TeachMeSkills.Web.CalculatorWeb.util.ConsoleWriter;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;

public class Application {
    private static final ConsoleReader reader = new ConsoleReader();
    private static final ConsoleWriter writer = new ConsoleWriter();
    private static final Calculator calculator = new Calculator();
    private static Operation operation = new Operation();

    public static void main(String[] args)  {
        writer.write("Enter num1");
        double num1 = reader.readDouble();
        writer.write("Enter num2");
        double num2 = reader.readDouble();
        writer.write("Enter typeOperation");
        String type = reader.readString();
        Operation op = new Operation(num1, num2, type);
        Optional<Operation> result = calculator.calculate(op);

    }
    private void server()throws IOException{
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
        httpServer.createContext("/num1");
        httpServer.createContext("/num2");
        httpServer.createContext("/type");
        httpServer.start();
    }
    private void handle(HttpExchange exchange) throws IOException {
        Operation operation = new Operation();
        String num1 = String.valueOf(operation.getNum1());
        String num2 = String.valueOf(operation.getNum1());
        String type = String.valueOf(operation.getNum1());

        exchange.sendResponseHeaders(200,num1.length());
        exchange.sendResponseHeaders(200,num2.length());
        exchange.sendResponseHeaders(200,type.length());
        OutputStream responseBody = exchange.getResponseBody();
        PrintWriter printWriter = new PrintWriter(responseBody);
        printWriter.print(num1);
        printWriter.print(num2);
        printWriter.print(type);
        printWriter.flush();
    }
}
