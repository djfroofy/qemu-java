package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=DumpStatus, data=[none, active, completed, failed], fields=null}</pre>
 */
// QApiEnumDescriptor{name=DumpStatus, data=[none, active, completed, failed], fields=null}
public enum DumpStatus {
	none("none"),
	active("active"),
	completed("completed"),
	failed("failed"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ DumpStatus(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}