package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=WatchdogExpirationAction, data=[reset, shutdown, poweroff, pause, debug, none], fields=null}</pre>
 */
// QApiEnumDescriptor{name=WatchdogExpirationAction, data=[reset, shutdown, poweroff, pause, debug, none], fields=null}
public enum WatchdogExpirationAction {
	reset("reset"),
	shutdown("shutdown"),
	poweroff("poweroff"),
	pause("pause"),
	debug("debug"),
	none("none"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ WatchdogExpirationAction(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}