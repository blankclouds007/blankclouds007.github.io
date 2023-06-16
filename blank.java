import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoogleIFrameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Google IFrame</title>");
        out.println("</head>");
        out.println("<body>");

        URL googleUrl = new URL("https://www.google.com");
        InputStream googleStream = googleUrl.openStream();

        out.println("<iframe src=\"" + googleUrl + "\" width=\"100%\" height=\"100%\"></iframe>");

        out.println("</body>");
        out.println("</html>");
    }
}
