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
 * <pre>QApiTypeDescriptor{name=ObjectTypeInfo, data={name=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=ObjectTypeInfo, data={name=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ObjectTypeInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("name")
	@Nonnull
	public java.lang.String name;

	@Nonnull
	public ObjectTypeInfo withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	public ObjectTypeInfo() {
	}

	public ObjectTypeInfo(java.lang.String name) {
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
