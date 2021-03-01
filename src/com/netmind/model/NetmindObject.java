package com.netmind.model;

import java.util.UUID;

public class NetmindObject {

	private UUID uuid;

	public NetmindObject() {
		uuid = UUID.randomUUID();
	}

	public NetmindObject(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getUUId() {
		return uuid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NetmindObject other = (NetmindObject) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

}