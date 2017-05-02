class TV {
	int channel;
	int volume;
	boolean power;
	public TV() {
		this(9, 20, false);
	}
	public TV(int channel, int volume, boolean power) {
		if(channel < 0 || volume < 0) {
			System.out.println("입력이 잘못되었습니다. 디폴트로 초기화 합니다.");
			this.channel = 9;
			this.volume = 20;
			this.power = false;
			
			return;
		}
		
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
	public void volumeUp() {
		this.volume++;
	}
	public void volumeDown() {
		this.volume--;
	}
	public void powerOn() {
		this.power = !this.power;
		if(this.power == true) System.out.println("TV가 켜졌습니다.");
		else System.out.println("TV가 꺼졌습니다.");
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getChannel() {
		return this.channel;
	}
	public int getVolume() {
		return this.volume;
	}
	public boolean getPower() {
		return power;
	}
	
}

public class WatchTV {

	public static void main(String[] args) {
		//처음 tv의 채널은 9번, 볼륨은 20, 전원은 꺼져있다.
		System.out.println("20164149 이동원");
		TV tv = new TV();
		tv.powerOn();
		System.out.printf("현재 TV채널은 %d입니다.\n", tv.getChannel());
		System.out.printf("현재 TV볼륨은 %d입니다.\n", tv.getVolume());
		tv.setChannel(16);
		tv.channelUp();
		tv.volumeUp();
		tv.volumeUp();
		System.out.printf("현재 TV채널은 %d입니다.\n", tv.getChannel());
		System.out.printf("현재 TV볼륨은 %d입니다.\n", tv.getVolume());
		tv.powerOn();
	}

}
