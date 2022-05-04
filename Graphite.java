/*
* やあ！ここはGraphiteのソースコードだよ！(？)
*/

public class Graphite extends User {
    public String userName = getUserName();
    public String getUserName() {
        return "Graphite";
    }
    public String userId = getUserId();
    public String getUserId() {
        return "@GraphiteJP";
    }
}

interface Account {
    void introduce();
    void send(Object _msg);
    void watch(int _length);
    void reply(String _toUserName, String _fromUserName, String msg);
    void exit();
}

abstract class User implements Account {
    public String userName;
    public String userId;

    @Override
    public void exit() {
        System.out.println(this.userName + " exited.");
    }
    @Override
    public void introduce() {
        System.out.printf("Hi! I am %s. Nice to meet you!", this.userName);
    }
    @Override
    public void reply(String _toUserName, String _fromUserName, String _msg) {
        System.out.printf("%s\n|\n%s\n%s", _toUserName, _fromUserName, _msg.toString());
    }
    @Override
    public void send(Object _msg) {
        System.out.printf("%s : %s", this.userName, _msg.toString());
    }
    @Override
    public void watch(int _length) {
        if (_length < 0) {
            try {
                throw new NotValidValueException("有効ではない値です");
            } catch (NotValidValueException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s is watching Twitter for %d minutes...", this.userName, _length);
    }
}

// 例外

class NotValidValueException extends Exception {
    private static final long serialVersionUID = 1l;

    public NotValidValueException(String _msg) {
        super(_msg);
    }
}
