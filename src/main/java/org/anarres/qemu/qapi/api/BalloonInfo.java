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
 * <p><pre>QApiTypeDescriptor{name=BalloonInfo, data={actual=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BalloonInfo, data={actual=int}, innerTypes=null}
public class BalloonInfo extends QApiType {

	@SerializedName("actual")
	@Nonnull public long actual;
}