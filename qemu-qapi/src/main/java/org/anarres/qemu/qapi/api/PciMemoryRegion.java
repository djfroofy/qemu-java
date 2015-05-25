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
 * <pre>QApiTypeDescriptor{name=PciMemoryRegion, data={bar=int, type=str, address=int, size=int, *prefetch=bool, *mem_type_64=bool}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=PciMemoryRegion, data={bar=int, type=str, address=int, size=int, *prefetch=bool, *mem_type_64=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PciMemoryRegion extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("bar")
	@Nonnull
	public long bar;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("type")
	@Nonnull
	public java.lang.String type;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("address")
	@Nonnull
	public long address;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("size")
	@Nonnull
	public long size;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("prefetch")
	@CheckForNull
	public java.lang.Boolean prefetch;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("mem_type_64")
	@CheckForNull
	public java.lang.Boolean memType64;

	@Nonnull
	public PciMemoryRegion withBar(long value) {
		this.bar = value;
		return this;
	}

	@Nonnull
	public PciMemoryRegion withType(java.lang.String value) {
		this.type = value;
		return this;
	}

	@Nonnull
	public PciMemoryRegion withAddress(long value) {
		this.address = value;
		return this;
	}

	@Nonnull
	public PciMemoryRegion withSize(long value) {
		this.size = value;
		return this;
	}

	@Nonnull
	public PciMemoryRegion withPrefetch(java.lang.Boolean value) {
		this.prefetch = value;
		return this;
	}

	@Nonnull
	public PciMemoryRegion withMemType64(java.lang.Boolean value) {
		this.memType64 = value;
		return this;
	}

	public PciMemoryRegion() {
	}

	public PciMemoryRegion(long bar, java.lang.String type, long address, long size, java.lang.Boolean prefetch, java.lang.Boolean memType64) {
		this.bar = bar;
		this.type = type;
		this.address = address;
		this.size = size;
		this.prefetch = prefetch;
		this.memType64 = memType64;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("bar");
		names.add("type");
		names.add("address");
		names.add("size");
		names.add("prefetch");
		names.add("mem_type_64");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("bar".equals(name))
			return bar;
		if ("type".equals(name))
			return type;
		if ("address".equals(name))
			return address;
		if ("size".equals(name))
			return size;
		if ("prefetch".equals(name))
			return prefetch;
		if ("mem_type_64".equals(name))
			return memType64;
		return super.getFieldByName(name);
	}
}
