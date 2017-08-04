package kr.co.tjenit.facebookcopy.data;

/**
 * Created by the on 2017-08-04.
 */

public class AlarmData {

    public String userName;
    public String userInputSetting;
    public int inputTime;

    public AlarmData() {
    }

    public AlarmData(String userName, String userInputSetting, int inputTime) {
        this.userName = userName;
        this.userInputSetting = userInputSetting;
        this.inputTime = inputTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserInputSetting() {
        return userInputSetting;
    }

    public void setUserInputSetting(String userInputSetting) {
        this.userInputSetting = userInputSetting;
    }

    public int getInputTime() {
        return inputTime;
    }

    public void setInputTime(int inputTime) {
        this.inputTime = inputTime;
    }
}
