package io.github.mnaustriaco.puma.pumacommon.helpers;

import io.github.mnaustriaco.puma.pumacommon.enums.PumaQueues;
import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Service;

/** Helper class to provide PUMA Queues that follows the convention.
 *
 */
@Service
public final class PumaQueueFactory {

    public static Queue provideQueueFor(PumaQueues pumaQueues){
        return new Queue(pumaQueues.toString());
    }

}
