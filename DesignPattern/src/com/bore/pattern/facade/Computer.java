package com.bore.pattern.facade;

/**
 * @description 外观模式 1、解决类与类之间的依赖关系；2、将关系统一放在computer类里。
 * @author Pet.Li
 * @date 2016年11月3日 上午10:03:04
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
