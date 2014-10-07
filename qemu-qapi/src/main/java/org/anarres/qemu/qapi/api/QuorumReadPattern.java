package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEnumDescriptor{name=QuorumReadPattern, data=[quorum, fifo], fields=null}</pre></p>
 */
// QApiEnumDescriptor{name=QuorumReadPattern, data=[quorum, fifo], fields=null}
public enum QuorumReadPattern {
	// @JsonProperty("quorum")
	quorum("quorum"),
	// @JsonProperty("fifo")
	fifo("fifo"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ QuorumReadPattern(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
