package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=Netdev, data={id=str, opts=NetClientOptions}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=Netdev, data={id=str, opts=NetClientOptions}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Netdev extends QApiType {

	@JsonProperty("id")
	@Nonnull
	public java.lang.String id;
	@JsonProperty("opts")
	@Nonnull
	public NetClientOptions opts;

	@Nonnull
	public Netdev withId(java.lang.String value) {
		this.id = value;
		return this;
	}

	@Nonnull
	public Netdev withOpts(NetClientOptions value) {
		this.opts = value;
		return this;
	}

	public Netdev() {
	}

	public Netdev(java.lang.String id, NetClientOptions opts) {
		this.id = id;
		this.opts = opts;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("id");
		names.add("opts");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("id".equals(name))
			return id;
		if ("opts".equals(name))
			return opts;
		return super.getFieldByName(name);
	}
}