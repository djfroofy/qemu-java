package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=migrate-set-parameters, returns=null, data={*compress-level=int, *compress-threads=int, *decompress-threads=int}}</pre>
 */
// QApiCommandDescriptor{name=migrate-set-parameters, returns=null, data={*compress-level=int, *compress-threads=int, *decompress-threads=int}}
public class MigrateSetParametersCommand extends QApiCommand<MigrateSetParametersCommand.Arguments, MigrateSetParametersCommand.Response> {
	/** Compound arguments to a MigrateSetParametersCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("compress-level")
		@CheckForNull
		public java.lang.Long compressLevel;
		@JsonProperty("compress-threads")
		@CheckForNull
		public java.lang.Long compressThreads;
		@JsonProperty("decompress-threads")
		@CheckForNull
		public java.lang.Long decompressThreads;

		public Arguments() {
		}

		public Arguments(java.lang.Long compressLevel, java.lang.Long compressThreads, java.lang.Long decompressThreads) {
			this.compressLevel = compressLevel;
			this.compressThreads = compressThreads;
			this.decompressThreads = decompressThreads;
		}
	}

	/** Response to a MigrateSetParametersCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new MigrateSetParametersCommand. */
	public MigrateSetParametersCommand(@Nonnull MigrateSetParametersCommand.Arguments argument) {
		super("migrate-set-parameters", Response.class, argument);
	}

	/** Constructs a new MigrateSetParametersCommand. */
	public MigrateSetParametersCommand(java.lang.Long compressLevel, java.lang.Long compressThreads, java.lang.Long decompressThreads) {
		this(new Arguments(compressLevel, compressThreads, decompressThreads));
	}
}
