package me.xtomyserrax.StaffFacilities.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * This event is fired before a player turns watchover on or off.
 */

public class PlayerWatchoverEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();

	private boolean isCancelled = false;
	private boolean watchover = false;

	public PlayerWatchoverEvent(Player player, boolean watchover) {
		super(player);
		this.watchover = watchover;
	}

	/**
	 * Utility method to see if the player is going to toggle watchover on or off.
	 *
	 * @return boolean true if player is going to toggle watchover on.
	 */
	public boolean isTogglingWatchoverOn() {
		return this.watchover;
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
