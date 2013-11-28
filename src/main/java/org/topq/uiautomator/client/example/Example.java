package org.topq.uiautomator.client.example;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.topq.uiautomator.Selector;
import org.topq.uiautomator.client.DeviceClient;

import com.android.uiautomator.core.UiObjectNotFoundException;


public class Example {
	
	
	public static void main(String[] args)  {
		try{
		DeviceClient client = new DeviceClient("http://localhost:9008/jsonrpc/0");
		//press home
		client.getDeviceService().pressKey("home");
		//create new selector for app drawer
		Selector selector = new Selector();
		selector.setDescription("Apps");
		selector.setClassName("android.widget.TextView");
		// click to open app drawer
		client.getDeviceService().click(selector);
		
		}catch (MalformedURLException e){
			System.out.println("Error while trying to connect to server");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not send command");
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not find object");
		}
	}

}
