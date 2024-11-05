package co.edu.uco.ucobet.ucobet_generales.infrastructure.secondaryadapters.notificationservice;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.MessageCatalog;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;
import co.edu.uco.ucobet.ucobet_generales.domain.notification.EmailNotificationService;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EmailNotificationServiceSendGrid implements EmailNotificationService {

    @Value("${sendgrid.api.key}")
    private String apiKeySendGrid;

    @Value("${sendgrid.from}")
    private String fromEmail;

    @Override
    public void sendCityCreationNotification(String cityName) {
        Email from = new Email(fromEmail);

        String subject = String.format(MessageCatalog.getMessageContent(MessageCode.M0000000024));
        Email to = new Email("andres.cardo98@gmail.com");

        String mensajeFormateado = String.format(MessageCatalog.getMessageContent(MessageCode.M0000000025) + " ");

        Content content = new Content("text/html", mensajeFormateado + "<strong>" + cityName + "</strong>");
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(apiKeySendGrid);
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(MessageCatalog.getMessageContent(MessageCode.M0000000026) + response.getStatusCode());
        } catch (IOException exception) {
            System.err.println(MessageCatalog.getMessageContent(MessageCode.M0000000027) + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
