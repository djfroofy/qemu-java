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
 * <pre>QApiTypeDescriptor{name=AcpiTableOptions, data={*sig=str, *rev=uint8, *oem_id=str, *oem_table_id=str, *oem_rev=uint32, *asl_compiler_id=str, *asl_compiler_rev=uint32, *file=str, *data=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=AcpiTableOptions, data={*sig=str, *rev=uint8, *oem_id=str, *oem_table_id=str, *oem_rev=uint32, *asl_compiler_id=str, *asl_compiler_rev=uint32, *file=str, *data=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AcpiTableOptions extends QApiType {

	@JsonProperty("sig")
	@CheckForNull
	public java.lang.String sig;
	@JsonProperty("rev")
	@CheckForNull
	public char rev;
	@JsonProperty("oem_id")
	@CheckForNull
	public java.lang.String oemId;
	@JsonProperty("oem_table_id")
	@CheckForNull
	public java.lang.String oemTableId;
	@JsonProperty("oem_rev")
	@CheckForNull
	public java.lang.Long oemRev;
	@JsonProperty("asl_compiler_id")
	@CheckForNull
	public java.lang.String aslCompilerId;
	@JsonProperty("asl_compiler_rev")
	@CheckForNull
	public java.lang.Long aslCompilerRev;
	@JsonProperty("file")
	@CheckForNull
	public java.lang.String file;
	@JsonProperty("data")
	@CheckForNull
	public java.lang.String data;

	@Nonnull
	public AcpiTableOptions withSig(java.lang.String value) {
		this.sig = value;
		return this;
	}

	@Nonnull
	public AcpiTableOptions withRev(char value) {
		this.rev = value;
		return this;
	}

	@Nonnull
	public AcpiTableOptions withOemId(java.lang.String value) {
		this.oemId = value;
		return this;
	}

	@Nonnull
	public AcpiTableOptions withOemTableId(java.lang.String value) {
		this.oemTableId = value;
		return this;
	}

	@Nonnull
	public AcpiTableOptions withOemRev(java.lang.Long value) {
		this.oemRev = value;
		return this;
	}

	@Nonnull
	public AcpiTableOptions withAslCompilerId(java.lang.String value) {
		this.aslCompilerId = value;
		return this;
	}

	@Nonnull
	public AcpiTableOptions withAslCompilerRev(java.lang.Long value) {
		this.aslCompilerRev = value;
		return this;
	}

	@Nonnull
	public AcpiTableOptions withFile(java.lang.String value) {
		this.file = value;
		return this;
	}

	@Nonnull
	public AcpiTableOptions withData(java.lang.String value) {
		this.data = value;
		return this;
	}

	public AcpiTableOptions() {
	}

	public AcpiTableOptions(java.lang.String sig, char rev, java.lang.String oemId, java.lang.String oemTableId, java.lang.Long oemRev, java.lang.String aslCompilerId, java.lang.Long aslCompilerRev, java.lang.String file, java.lang.String data) {
		this.sig = sig;
		this.rev = rev;
		this.oemId = oemId;
		this.oemTableId = oemTableId;
		this.oemRev = oemRev;
		this.aslCompilerId = aslCompilerId;
		this.aslCompilerRev = aslCompilerRev;
		this.file = file;
		this.data = data;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("sig");
		names.add("rev");
		names.add("oem_id");
		names.add("oem_table_id");
		names.add("oem_rev");
		names.add("asl_compiler_id");
		names.add("asl_compiler_rev");
		names.add("file");
		names.add("data");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("sig".equals(name))
			return sig;
		if ("rev".equals(name))
			return rev;
		if ("oem_id".equals(name))
			return oemId;
		if ("oem_table_id".equals(name))
			return oemTableId;
		if ("oem_rev".equals(name))
			return oemRev;
		if ("asl_compiler_id".equals(name))
			return aslCompilerId;
		if ("asl_compiler_rev".equals(name))
			return aslCompilerRev;
		if ("file".equals(name))
			return file;
		if ("data".equals(name))
			return data;
		return super.getFieldByName(name);
	}
}