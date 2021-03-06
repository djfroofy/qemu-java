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
 * <pre>QApiTypeDescriptor{name=PciBusInfo, data={number=int, secondary=int, subordinate=int, io_range=PciMemoryRange, memory_range=PciMemoryRange, prefetchable_range=PciMemoryRange}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=PciBusInfo, data={number=int, secondary=int, subordinate=int, io_range=PciMemoryRange, memory_range=PciMemoryRange, prefetchable_range=PciMemoryRange}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PciBusInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("number")
	@Nonnull
	public long number;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("secondary")
	@Nonnull
	public long secondary;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("subordinate")
	@Nonnull
	public long subordinate;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("io_range")
	@Nonnull
	public PciMemoryRange ioRange;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("memory_range")
	@Nonnull
	public PciMemoryRange memoryRange;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("prefetchable_range")
	@Nonnull
	public PciMemoryRange prefetchableRange;

	@Nonnull
	public PciBusInfo withNumber(long value) {
		this.number = value;
		return this;
	}

	@Nonnull
	public PciBusInfo withSecondary(long value) {
		this.secondary = value;
		return this;
	}

	@Nonnull
	public PciBusInfo withSubordinate(long value) {
		this.subordinate = value;
		return this;
	}

	@Nonnull
	public PciBusInfo withIoRange(PciMemoryRange value) {
		this.ioRange = value;
		return this;
	}

	@Nonnull
	public PciBusInfo withMemoryRange(PciMemoryRange value) {
		this.memoryRange = value;
		return this;
	}

	@Nonnull
	public PciBusInfo withPrefetchableRange(PciMemoryRange value) {
		this.prefetchableRange = value;
		return this;
	}

	public PciBusInfo() {
	}

	public PciBusInfo(long number, long secondary, long subordinate, PciMemoryRange ioRange, PciMemoryRange memoryRange, PciMemoryRange prefetchableRange) {
		this.number = number;
		this.secondary = secondary;
		this.subordinate = subordinate;
		this.ioRange = ioRange;
		this.memoryRange = memoryRange;
		this.prefetchableRange = prefetchableRange;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("number");
		names.add("secondary");
		names.add("subordinate");
		names.add("io_range");
		names.add("memory_range");
		names.add("prefetchable_range");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("number".equals(name))
			return number;
		if ("secondary".equals(name))
			return secondary;
		if ("subordinate".equals(name))
			return subordinate;
		if ("io_range".equals(name))
			return ioRange;
		if ("memory_range".equals(name))
			return memoryRange;
		if ("prefetchable_range".equals(name))
			return prefetchableRange;
		return super.getFieldByName(name);
	}
}
