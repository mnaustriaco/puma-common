package io.github.mnaustriaco.puma.pumacommon.helpers;

import io.github.mnaustriaco.puma.pumacommon.enums.PumaQueues;
import io.github.mnaustriaco.puma.pumacommon.events.PushCompletedEvent;
import io.github.mnaustriaco.puma.pumacommon.events.PushRequestedEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public final class PumaProducer {
    private final RabbitTemplate rabbitTemplate;

    public PumaProducer(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    public void produceToRequestedQueue(PushRequestedEvent event){
        this.rabbitTemplate.convertAndSend(null,
                PumaQueues.PUMA_PUSH_REQUEST_QUEUE.toString(), event);
    }
    public void produceToCompletedQueue(PushCompletedEvent event){
        this.rabbitTemplate.convertAndSend(null,
                PumaQueues.PUMA_PUSH_COMPLETE_QUEUE.toString(), event);
    }

    // TODO method overloading for MAIL


}
