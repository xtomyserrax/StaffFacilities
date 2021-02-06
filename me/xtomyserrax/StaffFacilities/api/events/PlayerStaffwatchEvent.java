package me.xtomyserrax.StaffFacilities.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * This event is fired before a player turns staffwatch on or off.
 */

public class PlayerStaffwatchEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();

	private boolean isCancelled = false;
	private boolean staffwatch = false;

	public PlayerStaffwatchEvent(Player player, boolean staffwatch) {
		super(player);
		this.staffwatch = staffwatch;
	}

	/**
	 * Utility method to see if the player is going to toggle staffwatch on or off.
	 *
	 * @return boolean true if player is going to toggle staffwatch on.
	 */
	public boolean isTogglingStaffwatchOn() {
		return this.staffwatch;
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
