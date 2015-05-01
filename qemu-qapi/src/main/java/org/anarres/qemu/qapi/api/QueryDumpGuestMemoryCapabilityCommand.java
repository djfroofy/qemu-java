package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=query-dump-guest-memory-capability, returns=DumpGuestMemoryCapability, data=null}</pre>
 */
// QApiCommandDescriptor{name=query-dump-guest-memory-capability, returns=DumpGuestMemoryCapability, data=null}
public class QueryDumpGuestMemoryCapabilityCommand extends QApiCommand<java.lang.Void, QueryDumpGuestMemoryCapabilityCommand.Response> {

	/** Response to a QueryDumpGuestMemoryCapabilityCommand. */
	public static class Response extends QApiResponse<DumpGuestMemoryCapability> {
	}

	/** Constructs a new QueryDumpGuestMemoryCapabilityCommand. */
	public QueryDumpGuestMemoryCapabilityCommand() {
		super("query-dump-guest-memory-capability", Response.class, null);
	}

}