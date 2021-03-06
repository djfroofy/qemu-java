package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=VNC_CONNECTED, data={server=VncServerInfo, client=VncBasicInfo}}</pre>
 */
// QApiEventDescriptor{name=VNC_CONNECTED, data={server=VncServerInfo, client=VncBasicInfo}}
public class VncConnectedEvent extends QApiEvent {

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("server")
		@Nonnull
		public VncServerInfo server;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("client")
		@Nonnull
		public VncBasicInfo client;
	}

	@JsonProperty("data")
	public Data data;
}
