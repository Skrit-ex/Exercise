package TeachMeSkills.Web;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class CalculatorWeb implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        //System.out.println(exchange.getRequestURI().getQuery());
        //сплит в масив
        String[] split = exchange.getRequestURI().getQuery().split("&");
        String num1 = split[0].split("=")[1];
        String num2 = split[1].split("=")[1];
        String type = split[2].split("=")[1];

        System.out.println(type);


        String s = "Result = 4";
        exchange.sendResponseHeaders(200, s.length());
        OutputStream responseBody =  exchange.getResponseBody();
        PrintWriter printWriter = new PrintWriter(responseBody);
        printWriter.print(s);
        printWriter.close();

    }
}