package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <pre>QApiEnumDescriptor{name=BlkdebugEvent, data=[l1_update, l1_grow.alloc_table, l1_grow.write_table, l1_grow.activate_table, l2_load, l2_update, l2_update_compressed, l2_alloc.cow_read, l2_alloc.write, read_aio, read_backing_aio, read_compressed, write_aio, write_compressed, vmstate_load, vmstate_save, cow_read, cow_write, reftable_load, reftable_grow, reftable_update, refblock_load, refblock_update, refblock_update_part, refblock_alloc, refblock_alloc.hookup, refblock_alloc.write, refblock_alloc.write_blocks, refblock_alloc.write_table, refblock_alloc.switch_table, cluster_alloc, cluster_alloc_bytes, cluster_free, flush_to_os, flush_to_disk, pwritev_rmw.head, pwritev_rmw.after_head, pwritev_rmw.tail, pwritev_rmw.after_tail, pwritev, pwritev_zero, pwritev_done, empty_image_prepare], fields=null}</pre>
 */
// QApiEnumDescriptor{name=BlkdebugEvent, data=[l1_update, l1_grow.alloc_table, l1_grow.write_table, l1_grow.activate_table, l2_load, l2_update, l2_update_compressed, l2_alloc.cow_read, l2_alloc.write, read_aio, read_backing_aio, read_compressed, write_aio, write_compressed, vmstate_load, vmstate_save, cow_read, cow_write, reftable_load, reftable_grow, reftable_update, refblock_load, refblock_update, refblock_update_part, refblock_alloc, refblock_alloc.hookup, refblock_alloc.write, refblock_alloc.write_blocks, refblock_alloc.write_table, refblock_alloc.switch_table, cluster_alloc, cluster_alloc_bytes, cluster_free, flush_to_os, flush_to_disk, pwritev_rmw.head, pwritev_rmw.after_head, pwritev_rmw.tail, pwritev_rmw.after_tail, pwritev, pwritev_zero, pwritev_done, empty_image_prepare], fields=null}
public enum BlkdebugEvent {
	l1_update("l1_update"),
	l1_grow_alloc_table("l1_grow.alloc_table"),
	l1_grow_write_table("l1_grow.write_table"),
	l1_grow_activate_table("l1_grow.activate_table"),
	l2_load("l2_load"),
	l2_update("l2_update"),
	l2_update_compressed("l2_update_compressed"),
	l2_alloc_cow_read("l2_alloc.cow_read"),
	l2_alloc_write("l2_alloc.write"),
	read_aio("read_aio"),
	read_backing_aio("read_backing_aio"),
	read_compressed("read_compressed"),
	write_aio("write_aio"),
	write_compressed("write_compressed"),
	vmstate_load("vmstate_load"),
	vmstate_save("vmstate_save"),
	cow_read("cow_read"),
	cow_write("cow_write"),
	reftable_load("reftable_load"),
	reftable_grow("reftable_grow"),
	reftable_update("reftable_update"),
	refblock_load("refblock_load"),
	refblock_update("refblock_update"),
	refblock_update_part("refblock_update_part"),
	refblock_alloc("refblock_alloc"),
	refblock_alloc_hookup("refblock_alloc.hookup"),
	refblock_alloc_write("refblock_alloc.write"),
	refblock_alloc_write_blocks("refblock_alloc.write_blocks"),
	refblock_alloc_write_table("refblock_alloc.write_table"),
	refblock_alloc_switch_table("refblock_alloc.switch_table"),
	cluster_alloc("cluster_alloc"),
	cluster_alloc_bytes("cluster_alloc_bytes"),
	cluster_free("cluster_free"),
	flush_to_os("flush_to_os"),
	flush_to_disk("flush_to_disk"),
	pwritev_rmw_head("pwritev_rmw.head"),
	pwritev_rmw_after_head("pwritev_rmw.after_head"),
	pwritev_rmw_tail("pwritev_rmw.tail"),
	pwritev_rmw_after_tail("pwritev_rmw.after_tail"),
	pwritev("pwritev"),
	pwritev_zero("pwritev_zero"),
	pwritev_done("pwritev_done"),
	empty_image_prepare("empty_image_prepare"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ BlkdebugEvent(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}