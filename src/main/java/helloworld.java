package net.frozen_butter.helloworld;

import com.google.gson.Gson;

import com.pi4j.system.NetworkInfo;
import com.pi4j.system.SystemInfo;

import java.io.IOException;
import java.text.ParseException;

public class helloworld {
	public static void main(String[] args) throws InterruptedException, IOException, ParseException {
		// display a few of the available system information properties
                World world = new World();
                System.out.println(world.greet());

                System.out.println("----------------------------------------------------");
                System.out.println("HARDWARE INFO");
                System.out.println("----------------------------------------------------");
                System.out.println("Serial Number     :  " + SystemInfo.getSerial());
                System.out.println("CPU Revision      :  " + SystemInfo.getCpuRevision());
                System.out.println("CPU Architecture  :  " + SystemInfo.getCpuArchitecture());
                System.out.println("CPU Part          :  " + SystemInfo.getCpuPart());
                System.out.println("CPU Temperature   :  " + SystemInfo.getCpuTemperature());
                System.out.println("CPU Core Voltage  :  " + SystemInfo.getCpuVoltage());
                System.out.println("CPU Model Name    :  " + SystemInfo.getModelName());
                System.out.println("Processor         :  " + SystemInfo.getProcessor());
                System.out.println("Hardware Revision :  " + SystemInfo.getRevision());
                System.out.println("Is Hard Float ABI :  " + SystemInfo.isHardFloatAbi());
                System.out.println("Board Type        :  " + SystemInfo.getBoardType().name());
	}
}

