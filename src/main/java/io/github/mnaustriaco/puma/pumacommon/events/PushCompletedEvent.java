package io.github.mnaustriaco.puma.pumacommon.events;

import io.github.mnaustriaco.puma.pumacommon.events.dto.PushNotification;

public record PushCompletedEvent(String notifId, PushNotification pushBody, String status) {
}
