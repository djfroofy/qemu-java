package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=x-blockdev-remove-medium, returns=null, data={*device=str, *id=str}}</pre>
 */
// QApiCommandDescriptor{name=x-blockdev-remove-medium, returns=null, data={*device=str, *id=str}}
public class XBlockdevRemoveMediumCommand extends QApiCommand<XBlockdevRemoveMediumCommand.Arguments, XBlockdevRemoveMediumCommand.Response> {
	/** Compound arguments to a XBlockdevRemoveMediumCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("device")
		@CheckForNull
		public java.lang.String device;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("id")
		@CheckForNull
		public java.lang.String id;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.String id) {
			this.device = device;
			this.id = id;
		}
	}

	/** Response to a XBlockdevRemoveMediumCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new XBlockdevRemoveMediumCommand. */
	public XBlockdevRemoveMediumCommand(@Nonnull XBlockdevRemoveMediumCommand.Arguments argument) {
		super("x-blockdev-remove-medium", Response.class, argument);
	}

	/** Constructs a new XBlockdevRemoveMediumCommand. */
	public XBlockdevRemoveMediumCommand(java.lang.String device, java.lang.String id) {
		this(new Arguments(device, id));
	}
}