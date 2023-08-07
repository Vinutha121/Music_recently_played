# Music_recently_played

# Songrecent Class

The `Songrecent` class allows users to maintain playlists of recent songs for multiple users. The class uses a HashMap to store the playlists of each user. The maximum capacity of each user's playlist is set to 4 songs.

### Usage

To use the `Songrecent` class, follow these steps:

1. Create an instance of the `Songrecent` class.

2. Call the `adduser` method to add users and their recent songs to the playlist.

3. The `recentsong` method adds a song to a user's playlist. If the playlist size exceeds the capacity, the oldest song is removed.

The Storetest class contains test cases for the Songrecent class using TestNG. It verifies the correctness of the Songrecent class methods by checking if the playlists are updated as expected

Running the Tests
To run the tests for the Songrecent class, execute the Storetest class as a TestNG test suite. The test cases will automatically be executed, and the results will be displayed in the console.
Also use main method to execute the test by adding Users and songs manually to check login
