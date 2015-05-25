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
 * <pre>QApiTypeDescriptor{name=TargetInfo, data={arch=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=TargetInfo, data={arch=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TargetInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("arch")
	@Nonnull
	public java.lang.String arch;

	@Nonnull
	public TargetInfo withArch(java.lang.String value) {
		this.arch = value;
		return this;
	}

	public TargetInfo() {
	}

	public TargetInfo(java.lang.String arch) {
		this.arch = arch;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("arch");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("arch".equals(name))
			return arch;
		return super.getFieldByName(name);
	}
}
