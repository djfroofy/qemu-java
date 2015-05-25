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
 * <pre>QApiTypeDescriptor{name=BlockDirtyBitmapAdd, data={node=str, name=str, *granularity=uint32}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockDirtyBitmapAdd, data={node=str, name=str, *granularity=uint32}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockDirtyBitmapAdd extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("node")
	@Nonnull
	public java.lang.String node;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("name")
	@Nonnull
	public java.lang.String name;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("granularity")
	@CheckForNull
	public java.lang.Long granularity;

	@Nonnull
	public BlockDirtyBitmapAdd withNode(java.lang.String value) {
		this.node = value;
		return this;
	}

	@Nonnull
	public BlockDirtyBitmapAdd withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	@Nonnull
	public BlockDirtyBitmapAdd withGranularity(java.lang.Long value) {
		this.granularity = value;
		return this;
	}

	public BlockDirtyBitmapAdd() {
	}

	public BlockDirtyBitmapAdd(java.lang.String node, java.lang.String name, java.lang.Long granularity) {
		this.node = node;
		this.name = name;
		this.granularity = granularity;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("node");
		names.add("name");
		names.add("granularity");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("node".equals(name))
			return node;
		if ("name".equals(name))
			return name;
		if ("granularity".equals(name))
			return granularity;
		return super.getFieldByName(name);
	}
}
