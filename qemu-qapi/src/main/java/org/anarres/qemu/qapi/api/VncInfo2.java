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
 * <pre>QApiTypeDescriptor{name=VncInfo2, data={id=str, server=[VncBasicInfo], clients=[VncClientInfo], auth=VncPrimaryAuth, *vencrypt=VncVencryptSubAuth, *display=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=VncInfo2, data={id=str, server=[VncBasicInfo], clients=[VncClientInfo], auth=VncPrimaryAuth, *vencrypt=VncVencryptSubAuth, *display=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VncInfo2 extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("id")
	@Nonnull
	public java.lang.String id;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("server")
	@Nonnull
	public java.util.List<VncBasicInfo> server;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("clients")
	@Nonnull
	public java.util.List<VncClientInfo> clients;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("auth")
	@Nonnull
	public VncPrimaryAuth auth;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("vencrypt")
	@CheckForNull
	public VncVencryptSubAuth vencrypt;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("display")
	@CheckForNull
	public java.lang.String display;

	@Nonnull
	public VncInfo2 withId(java.lang.String value) {
		this.id = value;
		return this;
	}

	@Nonnull
	public VncInfo2 withServer(java.util.List<VncBasicInfo> value) {
		this.server = value;
		return this;
	}

	@Nonnull
	public VncInfo2 withClients(java.util.List<VncClientInfo> value) {
		this.clients = value;
		return this;
	}

	@Nonnull
	public VncInfo2 withAuth(VncPrimaryAuth value) {
		this.auth = value;
		return this;
	}

	@Nonnull
	public VncInfo2 withVencrypt(VncVencryptSubAuth value) {
		this.vencrypt = value;
		return this;
	}

	@Nonnull
	public VncInfo2 withDisplay(java.lang.String value) {
		this.display = value;
		return this;
	}

	public VncInfo2() {
	}

	public VncInfo2(java.lang.String id, java.util.List<VncBasicInfo> server, java.util.List<VncClientInfo> clients, VncPrimaryAuth auth, VncVencryptSubAuth vencrypt, java.lang.String display) {
		this.id = id;
		this.server = server;
		this.clients = clients;
		this.auth = auth;
		this.vencrypt = vencrypt;
		this.display = display;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("id");
		names.add("server");
		names.add("clients");
		names.add("auth");
		names.add("vencrypt");
		names.add("display");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("id".equals(name))
			return id;
		if ("server".equals(name))
			return server;
		if ("clients".equals(name))
			return clients;
		if ("auth".equals(name))
			return auth;
		if ("vencrypt".equals(name))
			return vencrypt;
		if ("display".equals(name))
			return display;
		return super.getFieldByName(name);
	}
}
