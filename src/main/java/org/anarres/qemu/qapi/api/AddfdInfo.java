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
 * <p><pre>QApiTypeDescriptor{name=AddfdInfo, data={fdset-id=int, fd=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=AddfdInfo, data={fdset-id=int, fd=int}, innerTypes=null}
public class AddfdInfo extends QApiType {

	@SerializedName("fdset-id")
	@Nonnull
	public long fdsetId;
	@SerializedName("fd")
	@Nonnull
	public long fd;

	public AddfdInfo() {
	}

	public AddfdInfo(long fdsetId, long fd) {
		this.fdsetId = fdsetId;
		this.fd = fd;
	}
}