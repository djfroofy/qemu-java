package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=VncPrimaryAuth, data=[none, vnc, ra2, ra2ne, tight, ultra, tls, vencrypt, sasl], fields=null}</pre>
 */
// QApiEnumDescriptor{name=VncPrimaryAuth, data=[none, vnc, ra2, ra2ne, tight, ultra, tls, vencrypt, sasl], fields=null}
public enum VncPrimaryAuth {
	none("none"),
	vnc("vnc"),
	ra2("ra2"),
	ra2ne("ra2ne"),
	tight("tight"),
	ultra("ultra"),
	tls("tls"),
	vencrypt("vencrypt"),
	sasl("sasl"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ VncPrimaryAuth(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
