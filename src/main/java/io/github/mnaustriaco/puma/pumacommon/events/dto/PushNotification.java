package io.github.mnaustriaco.puma.pumacommon.events.dto;

public record PushNotification(String sender, String content, String body, PushRecipients recipients) {
}
