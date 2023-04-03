package co.com.sofka.listener.listener;

import co.com.sofka.listener.data.Notification;
import co.com.sofka.listener.seriallizer.JSONMapper;
import co.com.sofka.listener.seriallizer.JSONMapperImpl;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@Component
public class RabbitMQListener {
    public static final String EVENTS_QUEUE = "events.queue";
    private final Logger logger = Logger.getLogger("RabbitMqEventHandler");
    private final JSONMapper mapper = new JSONMapperImpl();
    @RabbitListener(queues = EVENTS_QUEUE)
    public void listener(String message) throws ClassNotFoundException {
        Notification notification = Notification.from(message);
        System.out.println(notification.getType());
        if (notification.getType()
                .equals("co.com.sofka.model.patient.events.AppointmentAdded")) {
            logger.info("1: " + notification.toString());
        } else {
            logger.info("1: " + "we currently don't have a listener for that event " + notification.toString());
        }
    }
}