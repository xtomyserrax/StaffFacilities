package me.xtomyserrax.StaffFacilities.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * This event is fired before a player vanishes or unvanishes.
 */

public class PlayerVanishEvent extends PlayerEvent implements Cancellable {
	private static final HandlerList handlers = new HandlerList();

	private boolean isCancelled = false;
	private boolean vanishes = false;

	public PlayerVanishEvent(Player player, boolean vanishes) {
		super(player);
		this.vanishes = vanishes;
	}

	/**
	 * Utility method to see if the player is going to vanish or unvanish.
	 *
	 * @return boolean true if player is going to vanish.
	 */
	public boolean isVanishing() {
		return this.vanishes;
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
