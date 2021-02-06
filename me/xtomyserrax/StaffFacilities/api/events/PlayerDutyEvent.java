package me.xtomyserrax.StaffFacilities.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * This event is fired before a player goes on or off duty.
 */

public class PlayerDutyEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();

	private boolean isCancelled;
	private boolean onduty;

	public PlayerDutyEvent(Player player, boolean onduty) {
		super(player);
		this.onduty = onduty;
	}

	/**
	 * Utility method to see if the player is going on or off duty
	 *
	 * @return boolean true if player is going on duty.
	 */
	public boolean isTogglingOnDuty() {
		return this.onduty;
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
