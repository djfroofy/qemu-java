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
 * <pre>QApiTypeDescriptor{name=FdsetFdInfo, data={fd=int, *opaque=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=FdsetFdInfo, data={fd=int, *opaque=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FdsetFdInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("fd")
	@Nonnull
	public long fd;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("opaque")
	@CheckForNull
	public java.lang.String opaque;

	@Nonnull
	public FdsetFdInfo withFd(long value) {
		this.fd = value;
		return this;
	}

	@Nonnull
	public FdsetFdInfo withOpaque(java.lang.String value) {
		this.opaque = value;
		return this;
	}

	public FdsetFdInfo() {
	}

	public FdsetFdInfo(long fd, java.lang.String opaque) {
		this.fd = fd;
		this.opaque = opaque;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("fd");
		names.add("opaque");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("fd".equals(name))
			return fd;
		if ("opaque".equals(name))
			return opaque;
		return super.getFieldByName(name);
	}
}
