package TeachMeSkills.Web;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class CalculatorWeb1 implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        //System.out.println(exchange.getRequestURI().getQuery());
        //сплит в масив
        String[] split = exchange.getRequestURI().getQuery().split("&");
        String num1 = split[0].split("=")[1];
        String num2 = split[1].split("=")[1];
        String type = split[2].split("=")[1];

        System.out.println(type);


        String s = "Result = 3";
        //String s2 = "resada";
        exchange.sendResponseHeaders(200, s.length());
        //exchange.sendResponseHeaders(210, s2.length());
        OutputStream responseBody =  exchange.getResponseBody();
        PrintWriter printWriter = new PrintWriter(responseBody);
        printWriter.println(s);
        //printWriter.println(s2);
        printWriter.close();

    }
}