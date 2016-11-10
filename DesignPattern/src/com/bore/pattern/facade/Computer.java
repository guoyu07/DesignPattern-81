package com.bore.pattern.facade;

/**
 * @description ���ģʽ 1�����������֮���������ϵ��2������ϵͳһ����computer���
 * @author Pet.Li
 * @date 2016��11��3�� ����10:03:04
 * @version 1.0.0
 */
public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}

	public void startup() {
		System.out.println("computer startup.");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("computer startup finished.");
	}

	public void shutdown() {
		System.out.println("computer shutdown.");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer shutdown finished.");
	}
}
