package me.xtomyserrax.StaffFacilities.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * This event is fired before a player tries to fake leave or join.
 */

public class PlayerFakeleaveEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();

	private boolean isCancelled = false;
	private boolean fakeleave = false;

	public PlayerFakeleaveEvent(Player player, boolean fakeleave) {
		super(player);
		this.fakeleave =fakeleave;
	}

	/**
	 * Utility method to see if the player is fake leaving or joining.
	 *
	 * @return boolean true if player is turning fakeleave on.
	 */
	public boolean isFakeleaving() {
		return this.fakeleave;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}

	public boolean isCancelled() {
		return this.isCancelled;
	}

	public void setCancelled(boolean cancel) {
		this.isCancelled = cancel;
	}

	public HandlerList getHandlers() {
		return handlers;
	}
}
