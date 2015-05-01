package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=ErrorClass, data=[GenericError, CommandNotFound, DeviceEncrypted, DeviceNotActive, DeviceNotFound, KVMMissingCap], fields=null}</pre>
 */
// QApiEnumDescriptor{name=ErrorClass, data=[GenericError, CommandNotFound, DeviceEncrypted, DeviceNotActive, DeviceNotFound, KVMMissingCap], fields=null}
public enum ErrorClass {
	GenericError("GenericError"),
	CommandNotFound("CommandNotFound"),
	DeviceEncrypted("DeviceEncrypted"),
	DeviceNotActive("DeviceNotActive"),
	DeviceNotFound("DeviceNotFound"),
	KVMMissingCap("KVMMissingCap"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ ErrorClass(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}