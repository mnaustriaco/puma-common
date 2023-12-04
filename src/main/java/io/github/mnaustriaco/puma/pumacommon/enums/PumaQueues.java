package io.github.mnaustriaco.puma.pumacommon.enums;

public enum PumaQueues {
    PUMA_PUSH_REQUEST_QUEUE("puma.notif-push-request-queue"),
    PUMA_PUSH_COMPLETE_QUEUE("puma.notif-push-completed-queue")
    ;

    private PumaQueues(String queueName){
        this.queueName = queueName;
    }
    private String queueName;

    @Override
    public String toString(){
        return this.queueName;
    }

}
