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
 * <pre>QApiTypeDescriptor{name=MigrationInfo, data={*status=MigrationStatus, *ram=MigrationStats, *disk=MigrationStats, *xbzrle-cache=XBZRLECacheStats, *total-time=int, *expected-downtime=int, *downtime=int, *setup-time=int}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=MigrationInfo, data={*status=MigrationStatus, *ram=MigrationStats, *disk=MigrationStats, *xbzrle-cache=XBZRLECacheStats, *total-time=int, *expected-downtime=int, *downtime=int, *setup-time=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MigrationInfo extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("status")
	@CheckForNull
	public MigrationStatus status;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ram")
	@CheckForNull
	public MigrationStats ram;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("disk")
	@CheckForNull
	public MigrationStats disk;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("xbzrle-cache")
	@CheckForNull
	public XBZRLECacheStats xbzrleCache;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("total-time")
	@CheckForNull
	public java.lang.Long totalTime;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("expected-downtime")
	@CheckForNull
	public java.lang.Long expectedDowntime;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("downtime")
	@CheckForNull
	public java.lang.Long downtime;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("setup-time")
	@CheckForNull
	public java.lang.Long setupTime;

	@Nonnull
	public MigrationInfo withStatus(MigrationStatus value) {
		this.status = value;
		return this;
	}

	@Nonnull
	public MigrationInfo withRam(MigrationStats value) {
		this.ram = value;
		return this;
	}

	@Nonnull
	public MigrationInfo withDisk(MigrationStats value) {
		this.disk = value;
		return this;
	}

	@Nonnull
	public MigrationInfo withXbzrleCache(XBZRLECacheStats value) {
		this.xbzrleCache = value;
		return this;
	}

	@Nonnull
	public MigrationInfo withTotalTime(java.lang.Long value) {
		this.totalTime = value;
		return this;
	}

	@Nonnull
	public MigrationInfo withExpectedDowntime(java.lang.Long value) {
		this.expectedDowntime = value;
		return this;
	}

	@Nonnull
	public MigrationInfo withDowntime(java.lang.Long value) {
		this.downtime = value;
		return this;
	}

	@Nonnull
	public MigrationInfo withSetupTime(java.lang.Long value) {
		this.setupTime = value;
		return this;
	}

	public MigrationInfo() {
	}

	public MigrationInfo(MigrationStatus status, MigrationStats ram, MigrationStats disk, XBZRLECacheStats xbzrleCache, java.lang.Long totalTime, java.lang.Long expectedDowntime, java.lang.Long downtime, java.lang.Long setupTime) {
		this.status = status;
		this.ram = ram;
		this.disk = disk;
		this.xbzrleCache = xbzrleCache;
		this.totalTime = totalTime;
		this.expectedDowntime = expectedDowntime;
		this.downtime = downtime;
		this.setupTime = setupTime;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("status");
		names.add("ram");
		names.add("disk");
		names.add("xbzrle-cache");
		names.add("total-time");
		names.add("expected-downtime");
		names.add("downtime");
		names.add("setup-time");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("status".equals(name))
			return status;
		if ("ram".equals(name))
			return ram;
		if ("disk".equals(name))
			return disk;
		if ("xbzrle-cache".equals(name))
			return xbzrleCache;
		if ("total-time".equals(name))
			return totalTime;
		if ("expected-downtime".equals(name))
			return expectedDowntime;
		if ("downtime".equals(name))
			return downtime;
		if ("setup-time".equals(name))
			return setupTime;
		return super.getFieldByName(name);
	}
}
