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
 * <pre>QApiTypeDescriptor{name=NameInfo, data={*name=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=NameInfo, data={*name=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NameInfo extends QApiType {

	@JsonProperty("name")
	@CheckForNull
	public java.lang.String name;

	@Nonnull
	public NameInfo withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	public NameInfo() {
	}

	public NameInfo(java.lang.String name) {
		this.name = name;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("name");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("name".equals(name))
			return name;
		return super.getFieldByName(name);
	}
}