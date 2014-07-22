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
 * <p><pre>QApiCommandDescriptor{name=human-monitor-command, returns=str, data={command-line=str, *cpu-index=int}}</pre></p>
 */
// QApiCommandDescriptor{name=human-monitor-command, returns=str, data={command-line=str, *cpu-index=int}}
public class HumanMonitorCommandCommand extends QApiCommand<HumanMonitorCommandCommand.Arguments, HumanMonitorCommandCommand.Response> {
	/** Compound arguments to a HumanMonitorCommandCommand. */
	public static class Arguments {

		@SerializedName("command-line")
		@Nonnull
		public java.lang.String commandLine;
		@SerializedName("cpu-index")
		@CheckForNull
		public long cpuIndex;

		public Arguments() {
		}

		public Arguments(java.lang.String commandLine, long cpuIndex) {
			this.commandLine = commandLine;
			this.cpuIndex = cpuIndex;
		}
	}

	/** Response to a HumanMonitorCommandCommand. */
	public static class Response extends QApiResponse<java.lang.String> {
	}

	/** Constructs a new HumanMonitorCommandCommand. */
	public HumanMonitorCommandCommand(@Nonnull HumanMonitorCommandCommand.Arguments argument) {
		super("human-monitor-command", Response.class, argument);
	}

	/** Constructs a new HumanMonitorCommandCommand. */
	public HumanMonitorCommandCommand(java.lang.String commandLine, long cpuIndex) {
		this(new Arguments(commandLine, cpuIndex));
	}
}
