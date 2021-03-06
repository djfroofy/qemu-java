package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiEventDescriptor{name=DEVICE_TRAY_MOVED, data={device=str, tray-open=bool}}</pre>
 */
// QApiEventDescriptor{name=DEVICE_TRAY_MOVED, data={device=str, tray-open=bool}}
public class DeviceTrayMovedEvent extends QApiEvent {

	public static class Data {
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("tray-open")
		@Nonnull
		public boolean trayOpen;
	}

	@JsonProperty("data")
	public Data data;
}
