package com.yedam.thread;

import java.awt.Toolkit;

// Runnable 인터페이스의 구현객체를 통해서 쓰레드. 1번방법
public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5 ; i++) {
			toolkit.beep(); //"삐"소리 출력
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
