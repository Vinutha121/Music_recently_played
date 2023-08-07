package codingAssignment1.MusicStore;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;




public class Storetest {
	
	private static Songrecent songrecent;

    @BeforeClass
    public static void setUp() {
        songrecent = new Songrecent();
    }
	 @Test
	    public void testAddUserWithSongs() {
	        // Add some users and their recent songs
	        songrecent.recentsong("User1", "Song1");
	        songrecent.recentsong("User2", "Song2");
	        songrecent.recentsong("User1", "Song3");
	        songrecent.recentsong("User2", "Song4");

	        System.out.println("....");
	        // Verify the playlists of specific users
	        Assert.assertEquals(songrecent.map.get("User1").toString(), "[Song1, Song3]");
	        Assert.assertEquals(songrecent.map.get("User2").toString(), "[Song2, Song4]");
	    }

	    
	    @Test
	    public void testAddMultipleSongsToUser() {
	        // Add multiple songs to a single user to check capacity
	        songrecent.recentsong("User4", "Song6");
	        songrecent.recentsong("User4", "Song7");
	        songrecent.recentsong("User4", "Song8");
	        songrecent.recentsong("User4", "Song9");
	        songrecent.recentsong("User4", "Song10");

	        // Verify that the playlist has a maximum capacity of 4
	        Assert.assertEquals(songrecent.map.get("User4").toString(), "[Song7, Song8, Song9, Song10]");
	    }

	    @Test
	    public void testAddUserWithNoRecentSongs() {
	        // Add a user without specifying any recent songs
	        songrecent.recentsong("User5", "");

	        // Verify that the playlist is empty for the user
	        Assert.assertNull(songrecent.map.get("User5"));
	    }
	}
