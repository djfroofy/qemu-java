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
 * <p><pre>QApiUnionDescriptor{name=TransactionAction, data={blockdev-snapshot-sync=BlockdevSnapshot, drive-backup=DriveBackup, abort=Abort, blockdev-snapshot-internal-sync=BlockdevSnapshotInternal}, innerTypes=null, fields=null}</pre></p>
 */
public class TransactionAction extends QApiUnion {
	@SerializedName("blockdev-snapshot-sync")
	@Nonnull
	public BlockdevSnapshot blockdevSnapshotSync;
	@SerializedName("drive-backup")
	@Nonnull
	public DriveBackup driveBackup;
	@SerializedName("abort")
	@Nonnull
	public Abort abort;
	@SerializedName("blockdev-snapshot-internal-sync")
	@Nonnull
	public BlockdevSnapshotInternal blockdevSnapshotInternalSync;

	@Nonnull
	public static TransactionAction blockdevSnapshotSync(BlockdevSnapshot blockdevSnapshotSync) {
		TransactionAction self = new TransactionAction();
		self.blockdevSnapshotSync = blockdevSnapshotSync;
		return self;
	}

	@Nonnull
	public static TransactionAction driveBackup(DriveBackup driveBackup) {
		TransactionAction self = new TransactionAction();
		self.driveBackup = driveBackup;
		return self;
	}

	@Nonnull
	public static TransactionAction abort(Abort abort) {
		TransactionAction self = new TransactionAction();
		self.abort = abort;
		return self;
	}

	@Nonnull
	public static TransactionAction blockdevSnapshotInternalSync(BlockdevSnapshotInternal blockdevSnapshotInternalSync) {
		TransactionAction self = new TransactionAction();
		self.blockdevSnapshotInternalSync = blockdevSnapshotInternalSync;
		return self;
	}

	@Override
	public boolean isUnion() {
		int count = 0;
		if (blockdevSnapshotSync != null)
			count++;
		if (driveBackup != null)
			count++;
		if (abort != null)
			count++;
		if (blockdevSnapshotInternalSync != null)
			count++;
		return (count == 1);
	}
}
