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
 * <p><pre>QApiCommandDescriptor{name=memsave, returns=null, data={val=int, size=int, filename=str, *cpu-index=int}}</pre></p>
 */
// QApiCommandDescriptor{name=memsave, returns=null, data={val=int, size=int, filename=str, *cpu-index=int}}
public class MemsaveCommand extends QApiCommand<MemsaveCommand.Arguments, MemsaveCommand.Response> {
	/** Compound arguments to a MemsaveCommand. */
	public static class Arguments {

		@SerializedName("val")
		@Nonnull
		public long val;
		@SerializedName("size")
		@Nonnull
		public long size;
		@SerializedName("filename")
		@Nonnull
		public java.lang.String filename;
		@SerializedName("cpu-index")
		@CheckForNull
		public long cpuIndex;

		public Arguments() {
		}

		public Arguments(long val, long size, java.lang.String filename, long cpuIndex) {
			this.val = val;
			this.size = size;
			this.filename = filename;
			this.cpuIndex = cpuIndex;
		}
	}

	/** Response to a MemsaveCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new MemsaveCommand. */
	public MemsaveCommand(@Nonnull MemsaveCommand.Arguments argument) {
		super("memsave", Response.class, argument);
	}

	/** Constructs a new MemsaveCommand. */
	public MemsaveCommand(long val, long size, java.lang.String filename, long cpuIndex) {
		this(new Arguments(val, size, filename, cpuIndex));
	}
}