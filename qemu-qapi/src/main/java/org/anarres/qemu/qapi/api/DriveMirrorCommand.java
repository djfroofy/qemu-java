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
 * <pre>QApiCommandDescriptor{name=drive-mirror, returns=null, data={device=str, target=str, *format=str, *node-name=str, *replaces=str, sync=MirrorSyncMode, *mode=NewImageMode, *speed=int, *granularity=uint32, *buf-size=int, *on-source-error=BlockdevOnError, *on-target-error=BlockdevOnError, *unmap=bool}}</pre>
 */
// QApiCommandDescriptor{name=drive-mirror, returns=null, data={device=str, target=str, *format=str, *node-name=str, *replaces=str, sync=MirrorSyncMode, *mode=NewImageMode, *speed=int, *granularity=uint32, *buf-size=int, *on-source-error=BlockdevOnError, *on-target-error=BlockdevOnError, *unmap=bool}}
public class DriveMirrorCommand extends QApiCommand<DriveMirrorCommand.Arguments, DriveMirrorCommand.Response> {
	/** Compound arguments to a DriveMirrorCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("target")
		@Nonnull
		public java.lang.String target;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("format")
		@CheckForNull
		public java.lang.String format;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("node-name")
		@CheckForNull
		public java.lang.String nodeName;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("replaces")
		@CheckForNull
		public java.lang.String replaces;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("sync")
		@Nonnull
		public MirrorSyncMode sync;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("mode")
		@CheckForNull
		public NewImageMode mode;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("speed")
		@CheckForNull
		public java.lang.Long speed;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("granularity")
		@CheckForNull
		public java.lang.Long granularity;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("buf-size")
		@CheckForNull
		public java.lang.Long bufSize;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("on-source-error")
		@CheckForNull
		public BlockdevOnError onSourceError;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("on-target-error")
		@CheckForNull
		public BlockdevOnError onTargetError;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("unmap")
		@CheckForNull
		public java.lang.Boolean unmap;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.String target, java.lang.String format, java.lang.String nodeName, java.lang.String replaces, MirrorSyncMode sync, NewImageMode mode, java.lang.Long speed, java.lang.Long granularity, java.lang.Long bufSize, BlockdevOnError onSourceError, BlockdevOnError onTargetError, java.lang.Boolean unmap) {
			this.device = device;
			this.target = target;
			this.format = format;
			this.nodeName = nodeName;
			this.replaces = replaces;
			this.sync = sync;
			this.mode = mode;
			this.speed = speed;
			this.granularity = granularity;
			this.bufSize = bufSize;
			this.onSourceError = onSourceError;
			this.onTargetError = onTargetError;
			this.unmap = unmap;
		}
	}

	/** Response to a DriveMirrorCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new DriveMirrorCommand. */
	public DriveMirrorCommand(@Nonnull DriveMirrorCommand.Arguments argument) {
		super("drive-mirror", Response.class, argument);
	}

	/** Constructs a new DriveMirrorCommand. */
	public DriveMirrorCommand(java.lang.String device, java.lang.String target, java.lang.String format, java.lang.String nodeName, java.lang.String replaces, MirrorSyncMode sync, NewImageMode mode, java.lang.Long speed, java.lang.Long granularity, java.lang.Long bufSize, BlockdevOnError onSourceError, BlockdevOnError onTargetError, java.lang.Boolean unmap) {
		this(new Arguments(device, target, format, nodeName, replaces, sync, mode, speed, granularity, bufSize, onSourceError, onTargetError, unmap));
	}
}
