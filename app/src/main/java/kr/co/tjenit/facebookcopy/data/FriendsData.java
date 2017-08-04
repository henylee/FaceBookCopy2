package kr.co.tjenit.facebookcopy.data;

/**
 * Created by the on 2017-08-04.
 */

public class FriendsData {

    private String name;
    private String togetherName;

    public FriendsData() {
    }

    public FriendsData(String name, String togetherName) {
        this.name = name;
        this.togetherName = togetherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTogetherName() {
        return togetherName;
    }

    public void setTogetherName(String togetherName) {
        this.togetherName = togetherName;
    }

}
