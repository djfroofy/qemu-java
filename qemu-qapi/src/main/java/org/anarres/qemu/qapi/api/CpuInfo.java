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
 * <pre>QApiTypeDescriptor{name=CpuInfo, data={CPU=int, current=bool, halted=bool, qom_path=str, *pc=int, *nip=int, *npc=int, *PC=int, thread_id=int}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=CpuInfo, data={CPU=int, current=bool, halted=bool, qom_path=str, *pc=int, *nip=int, *npc=int, *PC=int, thread_id=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CpuInfo extends QApiType {

	@JsonProperty("CPU")
	@Nonnull
	public long cpu;
	@JsonProperty("current")
	@Nonnull
	public boolean current;
	@JsonProperty("halted")
	@Nonnull
	public boolean halted;
	@JsonProperty("qom_path")
	@Nonnull
	public java.lang.String qomPath;
	@JsonProperty("pc")
	@CheckForNull
	public java.lang.Long pc;
	@JsonProperty("nip")
	@CheckForNull
	public java.lang.Long nip;
	@JsonProperty("npc")
	@CheckForNull
	public java.lang.Long npc;
	@JsonProperty("PC")
	@CheckForNull
	public java.lang.Long PC;
	@JsonProperty("thread_id")
	@Nonnull
	public long threadId;

	@Nonnull
	public CpuInfo withCpu(long value) {
		this.cpu = value;
		return this;
	}

	@Nonnull
	public CpuInfo withCurrent(boolean value) {
		this.current = value;
		return this;
	}

	@Nonnull
	public CpuInfo withHalted(boolean value) {
		this.halted = value;
		return this;
	}

	@Nonnull
	public CpuInfo withQomPath(java.lang.String value) {
		this.qomPath = value;
		return this;
	}

	@Nonnull
	public CpuInfo withPc(java.lang.Long value) {
		this.pc = value;
		return this;
	}

	@Nonnull
	public CpuInfo withNip(java.lang.Long value) {
		this.nip = value;
		return this;
	}

	@Nonnull
	public CpuInfo withNpc(java.lang.Long value) {
		this.npc = value;
		return this;
	}

	@Nonnull
	public CpuInfo withPC(java.lang.Long value) {
		this.PC = value;
		return this;
	}

	@Nonnull
	public CpuInfo withThreadId(long value) {
		this.threadId = value;
		return this;
	}

	public CpuInfo() {
	}

	public CpuInfo(long cpu, boolean current, boolean halted, java.lang.String qomPath, java.lang.Long pc, java.lang.Long nip, java.lang.Long npc, java.lang.Long PC, long threadId) {
		this.cpu = cpu;
		this.current = current;
		this.halted = halted;
		this.qomPath = qomPath;
		this.pc = pc;
		this.nip = nip;
		this.npc = npc;
		this.PC = PC;
		this.threadId = threadId;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("CPU");
		names.add("current");
		names.add("halted");
		names.add("qom_path");
		names.add("pc");
		names.add("nip");
		names.add("npc");
		names.add("PC");
		names.add("thread_id");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("CPU".equals(name))
			return cpu;
		if ("current".equals(name))
			return current;
		if ("halted".equals(name))
			return halted;
		if ("qom_path".equals(name))
			return qomPath;
		if ("pc".equals(name))
			return pc;
		if ("nip".equals(name))
			return nip;
		if ("npc".equals(name))
			return npc;
		if ("PC".equals(name))
			return PC;
		if ("thread_id".equals(name))
			return threadId;
		return super.getFieldByName(name);
	}
}
