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
 * <pre>QApiTypeDescriptor{name=NetdevVhostUserOptions, data={chardev=str, *vhostforce=bool}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=NetdevVhostUserOptions, data={chardev=str, *vhostforce=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetdevVhostUserOptions extends QApiType {

	@JsonProperty("chardev")
	@Nonnull
	public java.lang.String chardev;
	@JsonProperty("vhostforce")
	@CheckForNull
	public java.lang.Boolean vhostforce;

	@Nonnull
	public NetdevVhostUserOptions withChardev(java.lang.String value) {
		this.chardev = value;
		return this;
	}

	@Nonnull
	public NetdevVhostUserOptions withVhostforce(java.lang.Boolean value) {
		this.vhostforce = value;
		return this;
	}

	public NetdevVhostUserOptions() {
	}

	public NetdevVhostUserOptions(java.lang.String chardev, java.lang.Boolean vhostforce) {
		this.chardev = chardev;
		this.vhostforce = vhostforce;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("chardev");
		names.add("vhostforce");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("chardev".equals(name))
			return chardev;
		if ("vhostforce".equals(name))
			return vhostforce;
		return super.getFieldByName(name);
	}
}