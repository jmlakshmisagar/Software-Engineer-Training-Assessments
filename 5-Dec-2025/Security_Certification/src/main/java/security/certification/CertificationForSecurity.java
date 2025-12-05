package security.certification;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.X509Certificate;

@WebServlet("/cert")
public class CertificationForSecurity extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CertificationForSecurity() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body style='font-family:Arial;'>");
        out.println("<h2>Client Certificate Authentication Details</h2>");

        X509Certificate[] certs =
                (X509Certificate[]) request.getAttribute("jakarta.servlet.request.X509Certificate");

        if (certs == null || certs.length == 0) {
            out.println("<p style='color:red;'>No Client Certificate Found!</p>");
        } else {
            X509Certificate clientCert = certs[0];

            out.println("<p><b>Subject:</b> " + clientCert.getSubjectDN() + "</p>");
            out.println("<p><b>Issuer:</b> " + clientCert.getIssuerDN() + "</p>");
            out.println("<p><b>Serial Number:</b> " + clientCert.getSerialNumber() + "</p>");
            out.println("<p><b>Valid From:</b> " + clientCert.getNotBefore() + "</p>");
            out.println("<p><b>Valid Until:</b> " + clientCert.getNotAfter() + "</p>");
        }

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
