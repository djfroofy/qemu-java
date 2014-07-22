package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=change, returns=null, data={device=str, target=str, *arg=str}}</pre></p>
 */
// QApiCommandDescriptor{name=change, returns=null, data={device=str, target=str, *arg=str}}
public class ChangeCommand extends QApiCommand<ChangeCommand.Arguments, ChangeCommand.Response> {
	/** Compound arguments to a ChangeCommand. */
	public static class Arguments {

		@SerializedName("device")
		@Nonnull
		public java.lang.String device;
		@SerializedName("target")
		@Nonnull
		public java.lang.String target;
		@SerializedName("arg")
		@CheckForNull
		public java.lang.String arg;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.String target, java.lang.String arg) {
			this.device = device;
			this.target = target;
			this.arg = arg;
		}
	}

	/** Response to a ChangeCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new ChangeCommand. */
	public ChangeCommand(@Nonnull ChangeCommand.Arguments argument) {
		super("change", Response.class, argument);
	}

	/** Constructs a new ChangeCommand. */
	public ChangeCommand(java.lang.String device, java.lang.String target, java.lang.String arg) {
		this(new Arguments(device, target, arg));
	}
}
