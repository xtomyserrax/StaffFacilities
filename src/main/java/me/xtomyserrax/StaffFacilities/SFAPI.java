package me.xtomyserrax.StaffFacilities;

import org.bukkit.entity.Player;

import java.util.ArrayList;

//API Version: 5.0.6

public class SFAPI {
    // Exists to defeat instantiation in plugins that compile against this api
    private SFAPI(){

    }
    
    /**
     * Returns if a player can see a hidden one.
     * @param p the player to check
     * @param hidden the vanished/staffvanished player
     * @return true if player can see the vanished/staffvanished player.
     */
	public static boolean canSee(Player p, Player hidden) {
		return false;
	}

    /**
     * Returns if player is Vanished
     * @param p the player to test
     * @return whether or not the player is Vanished
     */
    public static boolean isPlayerVanished(Player p){
        return false;
    }
    
    /**
     * Returns if player is in staffchat
     * @param p the player to test
     * @return whether or not the player is in staffchat
     */
    public static boolean isPlayerInStaffchat(Player p){
        return false;
    }

    /**
     * Returns if player is StaffVanished
     * @param p the player to test
     * @return whether or not the player is StaffVanished
     */
    public static boolean isPlayerStaffVanished(Player p){
        return false;
    }

    /**
     * Returns if the player has Watchover enabled
     * @param p the player to test
     * @return whether or not the player has Watchover enabled
     */
    public static boolean isPlayerOnWatchover(Player p) {
        return false;
    }

    /**
     * Returns if the player has Staffwatch enabled
     * @param p the player to test
     * @return whether or not the player has Staffwatch enabled
     */
    public static boolean isPlayerOnStaffwatch(Player p) {
        return false;
    }

    /**
     * Returns if the player has Fly enabled
     * @param p the player to test
     * @return whether or not the player has Fly enabled
     */
    public static boolean isPlayerOnFlymode(Player p) {
        return false;
    }

    /**
     * Returns if the player has Fly enabled
     * @param p the player to test
     * @return whether or not the player has God enabled
     */
    public static boolean isPlayerOnGodmode(Player p) {
        return false;
    }

    /**
     * Returns if the player has Fakeleaved
     * @param p the player to test
     * @return whether or not the player has Fakeleaved
     */
    public static boolean isPlayerFakeleaved(Player p) {
        return false;
    }

    /**
     * Returns if the player is on duty
     * @param p the player to test
     * @return whether or not the player is on duty
     */
    public static boolean isPlayerOnDuty(Player p) {
        return false;
    }

    /**
     * Returns if the player has been frozen
     * @param p the player to test
     * @return whether or not the player is frozen
     */
    public static boolean isPlayerFrozen(Player p) {
        return false;
    }

    /**
     * Returns if the server is in Maintenance Mode
     * @return whether or not the server is in Maintenance Mode
     */
    public static boolean isServerOnMaintenanceMode() {
        return false;
    }

    /**
     * Returns if the chat is muted
     * @return whether or not the chat is muted
     */
    public static boolean isChatMuted() {
        return false;
    }

    /**
     * Gets the number of staff on duty
     * @return the number of staff on duty
     */
    public static int staffOnDuty() {
        return 0;
    }

    /**
     * Gets the number of staff online
     * @param fakeLeave if fakeLeaved players should be included in the count
     * @return the number of staff online given if fakeLeaved staff should be counted
     */
    public static int staffOnline(boolean fakeLeave) {
        return 0;
    }

    /**
     * Gets a list of staff online on the server
     * @param fakeLeave if fakeLeaved players should be included
     * @return an {@link ArrayList} of staff who are online (or who appear online)
     */
    public static ArrayList<Player> staffList(boolean fakeLeave) {
        return new ArrayList<>();
    }

    /**
     * Gets a list of staff who are presently on duty
     * @return an {@link ArrayList} of staff who are presently on duty
     */
    public static ArrayList<Player> staffOnDutyList() {
        return new ArrayList<>();
    }

    /**
     * Gets a list of all players who are vanished
     * @return an {@link ArrayList} of all vanished players
     */
    public static ArrayList<Player> vanishedPlayersList() {
        return new ArrayList<>();
    }

    /**
     * Gets a list of all players who are StaffVanished
     * @return an {@link ArrayList} of all players who are StaffVanished
     */
    public static ArrayList<Player> staffvanishedPlayersList() {
        return new ArrayList<>();
    }

    /**
     * Gets a list of all players who are fakeleaved
     * @return an {@link ArrayList} of all players who are fakeleaved
     */
    public static ArrayList<Player> fakeleavedPlayersList() {
        return new ArrayList<>();
    }

    /**
     * Gets a list of all players who are XRay Suspects
     * @return an {@link ArrayList} of all players who are suspected XRayers
     */
    public static ArrayList<Player> xRaySuspectPlayers() {
        return new ArrayList<>();
    }
}
