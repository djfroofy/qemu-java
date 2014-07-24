package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=MachineInfo, data={name=str, *alias=str, *is-default=bool, cpu-max=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=MachineInfo, data={name=str, *alias=str, *is-default=bool, cpu-max=int}, innerTypes=null}
public class MachineInfo extends QApiType {

	@SerializedName("name")
	@Nonnull
	public java.lang.String name;
	@SerializedName("alias")
	@CheckForNull
	public java.lang.String alias;
	@SerializedName("is-default")
	@CheckForNull
	public boolean isDefault;
	@SerializedName("cpu-max")
	@Nonnull
	public long cpuMax;

	public MachineInfo() {
	}

	public MachineInfo(java.lang.String name, java.lang.String alias, boolean isDefault, long cpuMax) {
		this.name = name;
		this.alias = alias;
		this.isDefault = isDefault;
		this.cpuMax = cpuMax;
	}
}