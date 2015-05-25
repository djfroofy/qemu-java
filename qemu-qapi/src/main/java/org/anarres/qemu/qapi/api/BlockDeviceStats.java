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
 * <pre>QApiTypeDescriptor{name=BlockDeviceStats, data={rd_bytes=int, wr_bytes=int, rd_operations=int, wr_operations=int, flush_operations=int, flush_total_time_ns=int, wr_total_time_ns=int, rd_total_time_ns=int, wr_highest_offset=int, rd_merged=int, wr_merged=int}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockDeviceStats, data={rd_bytes=int, wr_bytes=int, rd_operations=int, wr_operations=int, flush_operations=int, flush_total_time_ns=int, wr_total_time_ns=int, rd_total_time_ns=int, wr_highest_offset=int, rd_merged=int, wr_merged=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockDeviceStats extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rd_bytes")
	@Nonnull
	public long rdBytes;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_bytes")
	@Nonnull
	public long wrBytes;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rd_operations")
	@Nonnull
	public long rdOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_operations")
	@Nonnull
	public long wrOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("flush_operations")
	@Nonnull
	public long flushOperations;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("flush_total_time_ns")
	@Nonnull
	public long flushTotalTimeNs;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_total_time_ns")
	@Nonnull
	public long wrTotalTimeNs;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rd_total_time_ns")
	@Nonnull
	public long rdTotalTimeNs;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_highest_offset")
	@Nonnull
	public long wrHighestOffset;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("rd_merged")
	@Nonnull
	public long rdMerged;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("wr_merged")
	@Nonnull
	public long wrMerged;

	@Nonnull
	public BlockDeviceStats withRdBytes(long value) {
		this.rdBytes = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrBytes(long value) {
		this.wrBytes = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withRdOperations(long value) {
		this.rdOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrOperations(long value) {
		this.wrOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withFlushOperations(long value) {
		this.flushOperations = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withFlushTotalTimeNs(long value) {
		this.flushTotalTimeNs = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrTotalTimeNs(long value) {
		this.wrTotalTimeNs = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withRdTotalTimeNs(long value) {
		this.rdTotalTimeNs = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrHighestOffset(long value) {
		this.wrHighestOffset = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withRdMerged(long value) {
		this.rdMerged = value;
		return this;
	}

	@Nonnull
	public BlockDeviceStats withWrMerged(long value) {
		this.wrMerged = value;
		return this;
	}

	public BlockDeviceStats() {
	}

	public BlockDeviceStats(long rdBytes, long wrBytes, long rdOperations, long wrOperations, long flushOperations, long flushTotalTimeNs, long wrTotalTimeNs, long rdTotalTimeNs, long wrHighestOffset, long rdMerged, long wrMerged) {
		this.rdBytes = rdBytes;
		this.wrBytes = wrBytes;
		this.rdOperations = rdOperations;
		this.wrOperations = wrOperations;
		this.flushOperations = flushOperations;
		this.flushTotalTimeNs = flushTotalTimeNs;
		this.wrTotalTimeNs = wrTotalTimeNs;
		this.rdTotalTimeNs = rdTotalTimeNs;
		this.wrHighestOffset = wrHighestOffset;
		this.rdMerged = rdMerged;
		this.wrMerged = wrMerged;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("rd_bytes");
		names.add("wr_bytes");
		names.add("rd_operations");
		names.add("wr_operations");
		names.add("flush_operations");
		names.add("flush_total_time_ns");
		names.add("wr_total_time_ns");
		names.add("rd_total_time_ns");
		names.add("wr_highest_offset");
		names.add("rd_merged");
		names.add("wr_merged");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("rd_bytes".equals(name))
			return rdBytes;
		if ("wr_bytes".equals(name))
			return wrBytes;
		if ("rd_operations".equals(name))
			return rdOperations;
		if ("wr_operations".equals(name))
			return wrOperations;
		if ("flush_operations".equals(name))
			return flushOperations;
		if ("flush_total_time_ns".equals(name))
			return flushTotalTimeNs;
		if ("wr_total_time_ns".equals(name))
			return wrTotalTimeNs;
		if ("rd_total_time_ns".equals(name))
			return rdTotalTimeNs;
		if ("wr_highest_offset".equals(name))
			return wrHighestOffset;
		if ("rd_merged".equals(name))
			return rdMerged;
		if ("wr_merged".equals(name))
			return wrMerged;
		return super.getFieldByName(name);
	}
}
