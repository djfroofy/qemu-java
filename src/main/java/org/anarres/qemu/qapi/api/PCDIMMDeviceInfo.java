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
 * <p><pre>QApiTypeDescriptor{name=PCDIMMDeviceInfo, data={*id=str, addr=int, size=int, slot=int, node=int, memdev=str, hotplugged=bool, hotpluggable=bool}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=PCDIMMDeviceInfo, data={*id=str, addr=int, size=int, slot=int, node=int, memdev=str, hotplugged=bool, hotpluggable=bool}, innerTypes=null}
public class PCDIMMDeviceInfo extends QApiType {

	@SerializedName("id")
	@CheckForNull
	public java.lang.String id;
	@SerializedName("addr")
	@Nonnull
	public long addr;
	@SerializedName("size")
	@Nonnull
	public long size;
	@SerializedName("slot")
	@Nonnull
	public long slot;
	@SerializedName("node")
	@Nonnull
	public long node;
	@SerializedName("memdev")
	@Nonnull
	public java.lang.String memdev;
	@SerializedName("hotplugged")
	@Nonnull
	public boolean hotplugged;
	@SerializedName("hotpluggable")
	@Nonnull
	public boolean hotpluggable;

	public PCDIMMDeviceInfo() {
	}

	public PCDIMMDeviceInfo(java.lang.String id, long addr, long size, long slot, long node, java.lang.String memdev, boolean hotplugged, boolean hotpluggable) {
		this.id = id;
		this.addr = addr;
		this.size = size;
		this.slot = slot;
		this.node = node;
		this.memdev = memdev;
		this.hotplugged = hotplugged;
		this.hotpluggable = hotpluggable;
	}
}