package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=SpiceBasicInfo, data={host=str, port=str, family=NetworkAddressFamily}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=SpiceBasicInfo, data={host=str, port=str, family=NetworkAddressFamily}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SpiceBasicInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("host")
	@Nonnull
	public java.lang.String host;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("port")
	@Nonnull
	public java.lang.String port;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("family")
	@Nonnull
	public NetworkAddressFamily family;

	@Nonnull
	public SpiceBasicInfo withHost(java.lang.String value) {
		this.host = value;
		return this;
	}

	@Nonnull
	public SpiceBasicInfo withPort(java.lang.String value) {
		this.port = value;
		return this;
	}

	@Nonnull
	public SpiceBasicInfo withFamily(NetworkAddressFamily value) {
		this.family = value;
		return this;
	}

	public SpiceBasicInfo() {
	}

	public SpiceBasicInfo(java.lang.String host, java.lang.String port, NetworkAddressFamily family) {
		this.host = host;
		this.port = port;
		this.family = family;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("host");
		names.add("port");
		names.add("family");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("host".equals(name))
			return host;
		if ("port".equals(name))
			return port;
		if ("family".equals(name))
			return family;
		return super.getFieldByName(name);
	}
}
