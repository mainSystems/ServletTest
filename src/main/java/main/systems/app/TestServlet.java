package main.systems.app;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "ServletTest", urlPatterns = "/items")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Items> items = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            items.add(new Items(i, "Item" + i, i * 10));
        }

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.printf("<html><body>");
        for (Items item : items) {
            out.printf("<span>" + item.toString() + "</span></br>");
        }
        out.printf("</body></html>");
        out.close();
    }
}