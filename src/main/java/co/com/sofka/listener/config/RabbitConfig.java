package co.com.sofka.listener.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class RabbitConfig {
//
//    public static final String EXCHANGE = "core-posts-events";
//    public static final String EVENTS_QUEUE = "events.queue";
//    public static final String GENERAL_QUEUE = "general.queue";
//    public static final String ROUTING_KEY = "events.routing.key";
//    public static final String ROUTING_KEY_GENERAL = "events.#";
//    @Bean
//    public RabbitAdmin rabbitAdmin(RabbitTemplate rabbitTemplate) {
//        var admin =  new RabbitAdmin(rabbitTemplate);
//        admin.declareExchange(new TopicExchange(EXCHANGE));
//        return admin;
//    }
//    @Bean
//    public TopicExchange eventsExchange(){
//        return new TopicExchange(EXCHANGE);
//    }
//}
