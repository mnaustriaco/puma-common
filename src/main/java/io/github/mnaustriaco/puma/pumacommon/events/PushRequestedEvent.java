package io.github.mnaustriaco.puma.pumacommon.events;

import io.github.mnaustriaco.puma.pumacommon.events.dto.PushNotification;

public record PushRequestedEvent (String notifId, PushNotification body) {
}
