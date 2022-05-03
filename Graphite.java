public class Graphite {
	
	public static void main(String[] args) {
		// オブジェクト指向の良さがあんま出ていないプログラムです。
		
		Twitter twitter = new Twitter();
		twitter.send("どうもGraphiteです。");
		twitter.watch(60);
		twitter.exit();
	}
}

class Twitter {
	public String userName = "GraphiteJP";
	
	public void send(Object msg) {
		System.out.println(this.userName + " : " + msg);
	}
	public void watch(int length) {
		System.out.println(this.userName + "is watching Twitter for " + length + "minutes...");
	}
	public void exit() {
		System.out.println(this.userName + "exited.");
	}
}
