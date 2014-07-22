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
 * <p><pre>QApiUnionDescriptor{name=NetClientOptions, data={none=NetdevNoneOptions, nic=NetLegacyNicOptions, user=NetdevUserOptions, tap=NetdevTapOptions, l2tpv3=NetdevL2TPv3Options, socket=NetdevSocketOptions, vde=NetdevVdeOptions, dump=NetdevDumpOptions, bridge=NetdevBridgeOptions, hubport=NetdevHubPortOptions, netmap=NetdevNetmapOptions, vhost-user=NetdevVhostUserOptions}, innerTypes=null, fields=null}</pre></p>
 */
public class NetClientOptions extends QApiUnion {
	@SerializedName("none")
	@Nonnull
	public NetdevNoneOptions none;
	@SerializedName("nic")
	@Nonnull
	public NetLegacyNicOptions nic;
	@SerializedName("user")
	@Nonnull
	public NetdevUserOptions user;
	@SerializedName("tap")
	@Nonnull
	public NetdevTapOptions tap;
	@SerializedName("l2tpv3")
	@Nonnull
	public NetdevL2TPv3Options l2tpv3;
	@SerializedName("socket")
	@Nonnull
	public NetdevSocketOptions socket;
	@SerializedName("vde")
	@Nonnull
	public NetdevVdeOptions vde;
	@SerializedName("dump")
	@Nonnull
	public NetdevDumpOptions dump;
	@SerializedName("bridge")
	@Nonnull
	public NetdevBridgeOptions bridge;
	@SerializedName("hubport")
	@Nonnull
	public NetdevHubPortOptions hubport;
	@SerializedName("netmap")
	@Nonnull
	public NetdevNetmapOptions netmap;
	@SerializedName("vhost-user")
	@Nonnull
	public NetdevVhostUserOptions vhostUser;

	@Nonnull
	public static NetClientOptions none(NetdevNoneOptions none) {
		NetClientOptions self = new NetClientOptions();
		self.none = none;
		return self;
	}

	@Nonnull
	public static NetClientOptions nic(NetLegacyNicOptions nic) {
		NetClientOptions self = new NetClientOptions();
		self.nic = nic;
		return self;
	}

	@Nonnull
	public static NetClientOptions user(NetdevUserOptions user) {
		NetClientOptions self = new NetClientOptions();
		self.user = user;
		return self;
	}

	@Nonnull
	public static NetClientOptions tap(NetdevTapOptions tap) {
		NetClientOptions self = new NetClientOptions();
		self.tap = tap;
		return self;
	}

	@Nonnull
	public static NetClientOptions l2tpv3(NetdevL2TPv3Options l2tpv3) {
		NetClientOptions self = new NetClientOptions();
		self.l2tpv3 = l2tpv3;
		return self;
	}

	@Nonnull
	public static NetClientOptions socket(NetdevSocketOptions socket) {
		NetClientOptions self = new NetClientOptions();
		self.socket = socket;
		return self;
	}

	@Nonnull
	public static NetClientOptions vde(NetdevVdeOptions vde) {
		NetClientOptions self = new NetClientOptions();
		self.vde = vde;
		return self;
	}

	@Nonnull
	public static NetClientOptions dump(NetdevDumpOptions dump) {
		NetClientOptions self = new NetClientOptions();
		self.dump = dump;
		return self;
	}

	@Nonnull
	public static NetClientOptions bridge(NetdevBridgeOptions bridge) {
		NetClientOptions self = new NetClientOptions();
		self.bridge = bridge;
		return self;
	}

	@Nonnull
	public static NetClientOptions hubport(NetdevHubPortOptions hubport) {
		NetClientOptions self = new NetClientOptions();
		self.hubport = hubport;
		return self;
	}

	@Nonnull
	public static NetClientOptions netmap(NetdevNetmapOptions netmap) {
		NetClientOptions self = new NetClientOptions();
		self.netmap = netmap;
		return self;
	}

	@Nonnull
	public static NetClientOptions vhostUser(NetdevVhostUserOptions vhostUser) {
		NetClientOptions self = new NetClientOptions();
		self.vhostUser = vhostUser;
		return self;
	}

	@Override
	public boolean isUnion() {
		int count = 0;
		if (none != null)
			count++;
		if (nic != null)
			count++;
		if (user != null)
			count++;
		if (tap != null)
			count++;
		if (l2tpv3 != null)
			count++;
		if (socket != null)
			count++;
		if (vde != null)
			count++;
		if (dump != null)
			count++;
		if (bridge != null)
			count++;
		if (hubport != null)
			count++;
		if (netmap != null)
			count++;
		if (vhostUser != null)
			count++;
		return (count == 1);
	}
}
