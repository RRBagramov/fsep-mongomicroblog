package ru.fsep.models;

/**
 * 08.07.2017
 *
 * @author Robert Bagramov.
 */


public class UserInfo {

    private int followersCount;

    private int followingCount;

    private int postsCount;

    public UserInfo() {
    }

    public UserInfo(int followersCount, int followingCount, int postsCount) {
        this.followersCount = followersCount;
        this.followingCount = followingCount;
        this.postsCount = postsCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }
}
