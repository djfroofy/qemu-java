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
 * <pre>QApiTypeDescriptor{name=MigrationParameters, data={compress-level=int, compress-threads=int, decompress-threads=int}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=MigrationParameters, data={compress-level=int, compress-threads=int, decompress-threads=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MigrationParameters extends QApiType {

	@JsonProperty("compress-level")
	@Nonnull
	public long compressLevel;
	@JsonProperty("compress-threads")
	@Nonnull
	public long compressThreads;
	@JsonProperty("decompress-threads")
	@Nonnull
	public long decompressThreads;

	@Nonnull
	public MigrationParameters withCompressLevel(long value) {
		this.compressLevel = value;
		return this;
	}

	@Nonnull
	public MigrationParameters withCompressThreads(long value) {
		this.compressThreads = value;
		return this;
	}

	@Nonnull
	public MigrationParameters withDecompressThreads(long value) {
		this.decompressThreads = value;
		return this;
	}

	public MigrationParameters() {
	}

	public MigrationParameters(long compressLevel, long compressThreads, long decompressThreads) {
		this.compressLevel = compressLevel;
		this.compressThreads = compressThreads;
		this.decompressThreads = decompressThreads;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("compress-level");
		names.add("compress-threads");
		names.add("decompress-threads");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("compress-level".equals(name))
			return compressLevel;
		if ("compress-threads".equals(name))
			return compressThreads;
		if ("decompress-threads".equals(name))
			return decompressThreads;
		return super.getFieldByName(name);
	}
}
