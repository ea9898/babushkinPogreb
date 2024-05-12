package tg.bot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tg.bot.model.RabbitQueue;



@Configuration
public class RabbitConfig {

    @Bean
    public Jackson2JsonMessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public Queue textMessageQueue() {
        return new Queue(RabbitQueue.TEXT_MESSAGE_UPDATE);
    }

    @Bean
    public Queue docMessageQueue() {
        return new Queue(RabbitQueue.DOC_MESSAGE_UPDATE);
    }

    @Bean
    public Queue photoMessageQueue() {
        return new Queue(RabbitQueue.PHOTO_MESSAGE_UPDATE);
    }

    @Bean
    public Queue answerMessageQueue() {
        return new Queue(RabbitQueue.ANSWER_MESSAGE_UPDATE);
    }
}
