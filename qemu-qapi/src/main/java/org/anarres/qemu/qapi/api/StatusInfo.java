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
 * <pre>QApiTypeDescriptor{name=StatusInfo, data={running=bool, singlestep=bool, status=RunState}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=StatusInfo, data={running=bool, singlestep=bool, status=RunState}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StatusInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("running")
	@Nonnull
	public boolean running;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("singlestep")
	@Nonnull
	public boolean singlestep;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("status")
	@Nonnull
	public RunState status;

	@Nonnull
	public StatusInfo withRunning(boolean value) {
		this.running = value;
		return this;
	}

	@Nonnull
	public StatusInfo withSinglestep(boolean value) {
		this.singlestep = value;
		return this;
	}

	@Nonnull
	public StatusInfo withStatus(RunState value) {
		this.status = value;
		return this;
	}

	public StatusInfo() {
	}

	public StatusInfo(boolean running, boolean singlestep, RunState status) {
		this.running = running;
		this.singlestep = singlestep;
		this.status = status;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("running");
		names.add("singlestep");
		names.add("status");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("running".equals(name))
			return running;
		if ("singlestep".equals(name))
			return singlestep;
		if ("status".equals(name))
			return status;
		return super.getFieldByName(name);
	}
}
