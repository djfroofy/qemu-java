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
 * <pre>QApiTypeDescriptor{name=BlockdevCacheInfo, data={writeback=bool, direct=bool, no-flush=bool}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockdevCacheInfo, data={writeback=bool, direct=bool, no-flush=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevCacheInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("writeback")
	@Nonnull
	public boolean writeback;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("direct")
	@Nonnull
	public boolean direct;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("no-flush")
	@Nonnull
	public boolean noFlush;

	@Nonnull
	public BlockdevCacheInfo withWriteback(boolean value) {
		this.writeback = value;
		return this;
	}

	@Nonnull
	public BlockdevCacheInfo withDirect(boolean value) {
		this.direct = value;
		return this;
	}

	@Nonnull
	public BlockdevCacheInfo withNoFlush(boolean value) {
		this.noFlush = value;
		return this;
	}

	public BlockdevCacheInfo() {
	}

	public BlockdevCacheInfo(boolean writeback, boolean direct, boolean noFlush) {
		this.writeback = writeback;
		this.direct = direct;
		this.noFlush = noFlush;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("writeback");
		names.add("direct");
		names.add("no-flush");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("writeback".equals(name))
			return writeback;
		if ("direct".equals(name))
			return direct;
		if ("no-flush".equals(name))
			return noFlush;
		return super.getFieldByName(name);
	}
}
