public class Graphite extends User {
    public String userName = "Graphite";
    public String userId = "@GraphiteJP";
    public int age = 13;

    //　僕だよ！
    Graphite() {
        System.out.println(userName + "が降臨した！");
    }

    public void introduce(int _age) {
        System.out.println("Hi! My name is " + userName + ", Age is" + _age + "\nNice to meet you!");
    }
}

class Subphite extends Graphite {
    public String subName = "Subphite";
    public String subId = "@SubphiteJP";

    // サブだよ！
    Subphite() {
        System.out.println(subName + "が降臨した...のか？");
    }
}

class Thirdphite extends Graphite {
    public String thirdName = "Thirdphite";
    public String thirdId = "@ThirdphiteJP";

    // サードだよ！
    Thirdphite() {
        System.out.println(thirdName + "が降臨したっぽい");
    }
}

interface Account {
    // インターフェース

    void introduce();
    void watch(int _length);
    void send(Object _msg);
    void reply(String _userIdTo, String _userIdFrom, Object _msg);
    void exit();
}

abstract class User implements Account {
    //抽象クラス

    public String userName;
    public String userId;

    // メソッド
    public String getUsername() {
        return this.userName;
    }
    public String getUserId() {
        return this.userId;
    }

    // 継承したメソッド
    @Override
    public void introduce() {
        System.out.println("Hi! My name is " + userName + ".\nNice to meet you!");
    }
    @Override
    public void watch(int _length) {
        System.out.println(userName + "is watching Twitter for "+ _length + "minutes...");
    }
    @Override
    public void send(Object _msg) {
        System.out.println(userId + " : " + _msg);
    }
    @Override
    public void reply(String _userNameTo, String _userNameFrom, Object _msg) {
        System.out.println(_userNameTo + "\n|\n" + _userNameFrom + "\n" + _msg);
    }
    @Override
    public void exit() {
        System.out.println(userName + "exited.");
    }
}
