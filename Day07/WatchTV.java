class TV {
	private int channel;
	private int volume;
	private boolean power;
	public TV() {	//TV Class의 디폴트 생성자
		this(9, 20, false);	//기본 값으로 초기화하기 위해 오버로딩된 다른 생성자를 호출
	}
	public TV(int channel, int volume, boolean power) {	//TV Class의 설정 생성자
		if(channel < 0 || volume < 0) {	//잘못된 수치가 입력되면 기본값으로 초기화 하고 리턴
			System.out.println("입력이 잘못되었습니다. 디폴트로 초기화 합니다.");
			this.channel = 9;
			this.volume = 20;
			this.power = false;
			
			return;
		}
		//문제가 없을 경우, parameter 값으로 초기화.
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	
	public void channelUp() {	//채널 하나 올림
		this.channel++;
	}
	public void channelDown() {	//채널 하나 내림
		this.channel--;
	}
	public void volumeUp() {	//볼륨 하나 올림
		this.volume++;
	}
	public void volumeDown() {	//볼륨 하나 내림
		this.volume--;
	}
	public void powerOn() {	//전원 버튼을 누르는 동작
		this.power = !this.power;	//메소드 실행마다 입력값을 반전하여 표기
		if(this.power == true) System.out.println("TV가 켜졌습니다.");
		else System.out.println("TV가 꺼졌습니다.");
	}
	
	public void setChannel(int channel) {	//원하는 채널로 수동으로 이동 -setter
		this.channel = channel;
	}
	public void setVolume(int volume) {	//원하는 값으로 볼륨 조절 -setter
		this.volume = volume;
	}
	public int getChannel() {	//현재 채널 반환 -getter
		return this.channel;
	}
	public int getVolume() {	//현재 볼륨 확인 -getter
		return this.volume;
	}
	public boolean getPower() {	//현재 전원 상태 확인 -getter
		return power;
	}
	
	public String toString() {
		return "전원: " + this.power + ", 채널: " + this.channel + ", 볼륨: " + this.volume;
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
