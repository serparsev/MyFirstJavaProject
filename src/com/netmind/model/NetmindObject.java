package com.netmind.model;

import java.util.UUID;

public class NetmindObject {

	private UUID uuid;

	public NetmindObject() {
		this.uuid = UUID.randomUUID();
	}

	public NetmindObject(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getUUId() {
		return uuid;
	}

}
