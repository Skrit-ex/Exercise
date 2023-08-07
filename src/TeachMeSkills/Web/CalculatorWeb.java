package TeachMeSkills.Web;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
public class CalculatorWeb implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println(exchange.getRequestURI().getQuery());
        //сплит в масив
        String[] split = exchange.getRequestURI().getQuery().split("&");
        System.out.println(split);
    }
}