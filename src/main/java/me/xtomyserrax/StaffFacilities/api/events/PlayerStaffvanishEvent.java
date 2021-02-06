package me.xtomyserrax.StaffFacilities.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * This event is fired before a player staffvanishes or unstaffvanishes.
 */

public class PlayerStaffvanishEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();

	private boolean isCancelled = false;
	private boolean staffvanishes = false;

	public PlayerStaffvanishEvent(Player player, boolean staffvanishes) {
		super(player);
		this.staffvanishes = staffvanishes;
	}

	/**
	 * Utility method to see if the player is going to staffvanish or unstaffvanish.
	 *
	 * @return boolean true if player is going to staffvanish.
	 */
	public boolean isStaffvanishing() {
		return this.staffvanishes;
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
