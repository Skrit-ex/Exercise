package TeachMeSkills.Web.CalculatorWeb;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class HttpExchangeDemo implements HttpHandler {
    private final Operation operation = new Operation();

    public void handle(HttpExchange exchange) throws IOException {
        String num1 = String.valueOf(operation.getNum1());
        String num2 = String.valueOf(operation.getNum1());
        String type = String.valueOf(operation.getNum1());
        String result = String.valueOf(operation.getResult());

        exchange.sendResponseHeaders(200,num1.length());
        exchange.sendResponseHeaders(200,num2.length());
        exchange.sendResponseHeaders(200,type.length());
        exchange.sendResponseHeaders(200, result.length());
        OutputStream responseBody = exchange.getResponseBody();
        PrintWriter printWriter = new PrintWriter(responseBody);
        printWriter.print(num1);
        printWriter.print(num2);
        printWriter.print(type);
        printWriter.print(result);
        printWriter.close();
    }
}
