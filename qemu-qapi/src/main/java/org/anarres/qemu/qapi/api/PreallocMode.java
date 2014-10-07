package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEnumDescriptor{name=PreallocMode, data=[off, metadata, falloc, full], fields=null}</pre></p>
 */
// QApiEnumDescriptor{name=PreallocMode, data=[off, metadata, falloc, full], fields=null}
public enum PreallocMode {
	// @JsonProperty("off")
	off("off"),
	// @JsonProperty("metadata")
	metadata("metadata"),
	// @JsonProperty("falloc")
	falloc("falloc"),
	// @JsonProperty("full")
	full("full"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ PreallocMode(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
