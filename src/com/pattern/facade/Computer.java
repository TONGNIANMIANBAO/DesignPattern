package com.pattern.facade;

public class Computer {
	Cpu cpu;
	Disk disk;

	public Computer() {
		cpu = new Cpu();
		disk = new Disk();
	}

	public void startup() {
		cpu.startup();
		disk.startup();
		System.out.println("computer startup");
	}

	public void shutdown() {
		cpu.shutdowm();
		disk.shutdown();
		System.out.println("computer shutdown");
	}
}
