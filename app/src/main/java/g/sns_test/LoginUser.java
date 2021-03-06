package g.sns_test;

public class LoginUser {//로그인한 사용자 정보

    private static String account;
    private static String nickname;
    private static String profile;
    //singleton instance
    private static LoginUser loginUser;

    private LoginUser() {

    }

    private LoginUser(String account, String nickname, String profile) {
        this.account = account;
        this.nickname = nickname;
        this.profile = profile;
    }

    public static LoginUser getInstance() {
        return loginUser;
    }

    public static LoginUser initInstance(String account, String nickname, String profile){
        loginUser = new LoginUser(account, nickname, profile);
        return loginUser;
    }



    public String getAccount() {
        return account;
    }

    public String getNickname() {
        return nickname;
    }

    public String getProfile() {
        return profile;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setProfile(String profile){
        this.profile = profile;
    }
}
