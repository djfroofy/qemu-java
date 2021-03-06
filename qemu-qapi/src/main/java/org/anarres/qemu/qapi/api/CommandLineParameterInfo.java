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
 * <pre>QApiTypeDescriptor{name=CommandLineParameterInfo, data={name=str, type=CommandLineParameterType, *help=str, *default=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=CommandLineParameterInfo, data={name=str, type=CommandLineParameterType, *help=str, *default=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CommandLineParameterInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("name")
	@Nonnull
	public java.lang.String name;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("type")
	@Nonnull
	public CommandLineParameterType type;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("help")
	@CheckForNull
	public java.lang.String help;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("default")
	@CheckForNull
	public java.lang.String _default;

	@Nonnull
	public CommandLineParameterInfo withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	@Nonnull
	public CommandLineParameterInfo withType(CommandLineParameterType value) {
		this.type = value;
		return this;
	}

	@Nonnull
	public CommandLineParameterInfo withHelp(java.lang.String value) {
		this.help = value;
		return this;
	}

	@Nonnull
	public CommandLineParameterInfo with_default(java.lang.String value) {
		this._default = value;
		return this;
	}

	public CommandLineParameterInfo() {
	}

	public CommandLineParameterInfo(java.lang.String name, CommandLineParameterType type, java.lang.String help, java.lang.String _default) {
		this.name = name;
		this.type = type;
		this.help = help;
		this._default = _default;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("name");
		names.add("type");
		names.add("help");
		names.add("default");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("name".equals(name))
			return name;
		if ("type".equals(name))
			return type;
		if ("help".equals(name))
			return help;
		if ("default".equals(name))
			return _default;
		return super.getFieldByName(name);
	}
}
