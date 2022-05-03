public class Graphite extends Account {
	public String userName = "Graphite";
	public String userId = "@GraphiteJP";
	
	@Override
	public void introduce() {
		System.out.println("Hi! Name Is " + this.userName + ". Nice To Meet You!\nI Am A Apple Devotee.");
	}
}

class Subphite extends Graphite {
	public String subUserName = "Subphite";
	public String SubUserId = "@SubphiteJP";
	
	@Override
	public void introduce() {
		System.out.println("Hi! Name Is " + this.userName + ". Nice To Meet You!\nPlease Watch My Main Account : " + this.getUserId());
	}
}

abstract class Account {
	public String userName;
	public String userId;
	
	public String getUserName() {
		return this.userName;
	}
	public String getUserId() {
		return this.userId;
	}
	
	public void introduce() {
		System.out.println("Hi! My Name Is " + this.userName + ".\nNice To Meet You!");
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
