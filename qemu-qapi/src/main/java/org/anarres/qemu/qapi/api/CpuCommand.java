package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=cpu, returns=null, data={index=int}}</pre>
 */
// QApiCommandDescriptor{name=cpu, returns=null, data={index=int}}
public class CpuCommand extends QApiCommand<CpuCommand.Arguments, CpuCommand.Response> {
	/** Compound arguments to a CpuCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("index")
		@Nonnull
		public long index;

		public Arguments() {
		}

		public Arguments(long index) {
			this.index = index;
		}
	}

	/** Response to a CpuCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new CpuCommand. */
	public CpuCommand(@Nonnull CpuCommand.Arguments argument) {
		super("cpu", Response.class, argument);
	}

	/** Constructs a new CpuCommand. */
	public CpuCommand(long index) {
		this(new Arguments(index));
	}
}