package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-command-line-options, returns=[CommandLineOptionInfo], data={*option=str}}</pre></p>
 */
// QApiCommandDescriptor{name=query-command-line-options, returns=[CommandLineOptionInfo], data={*option=str}}
public class QueryCommandLineOptionsCommand extends QApiCommand<QueryCommandLineOptionsCommand.Arguments, QueryCommandLineOptionsCommand.Response> {
	/** Compound arguments to a QueryCommandLineOptionsCommand. */
	public static class Arguments {

		@SerializedName("option")
		@CheckForNull
		public java.lang.String option;

		public Arguments() {
		}

		public Arguments(java.lang.String option) {
			this.option = option;
		}
	}

	/** Response to a QueryCommandLineOptionsCommand. */
	public static class Response extends QApiResponse<List<CommandLineOptionInfo>> {
	}

	/** Constructs a new QueryCommandLineOptionsCommand. */
	public QueryCommandLineOptionsCommand(@Nonnull QueryCommandLineOptionsCommand.Arguments argument) {
		super("query-command-line-options", Response.class, argument);
	}

	/** Constructs a new QueryCommandLineOptionsCommand. */
	public QueryCommandLineOptionsCommand(java.lang.String option) {
		this(new Arguments(option));
	}
}
