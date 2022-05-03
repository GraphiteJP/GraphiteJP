public class Graphite extends Account {
	public String userName = "Graphite";
	public String userId = "@GraphiteJP";
}

class Subphite extends Graphite {
	public String subUserName = "Subphite";
	public String SubUserId = "@SubphiteJP";
}

class Thirdphite extends Graphite {
	public String thirdUserName = "Thirdphite";
	public String thirdUserId = "@Thirdphite";
}

abstract class Account {
	public String userName;
	public String userId;
	public final int age = 13;
	
	public String getUserName() {
		return this.userName;
	}
	public String getUserId() {
		return this.userId;
	}
	
	public final void introduce() {
		System.out.println("Hi! My Name Is " + this.userName + ", Age Is " + this.age + "\nNice To Meet You!");
	}
	public final void watchTwitter(int length) {
		System.out.println(this.userName + "Is Watching Twitter For " + length + "Minutes...");
	}
	public final void sendTweet(Object msg) {
		System.out.println(msg);
	}
	public final void replyTweet(String userIdTo, Object msg) {
		System.out.println(userIdTo + "\n|\n" + msg);
	}
	public final void exitTwitter() {
		System.out.println(this.userName + "exited.");
	}
}
