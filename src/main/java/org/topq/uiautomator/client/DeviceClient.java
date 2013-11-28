package org.topq.uiautomator.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.topq.uiautomator.AutomatorService;
import org.topq.uiautomator.Selector;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.googlecode.jsonrpc4j.ProxyUtil;

public class DeviceClient {
	
	JsonRpcHttpClient client;
	AutomatorService deviceService;
	
	public DeviceClient(String serverUrl)throws MalformedURLException {
		URL serverURL = new URL(serverUrl);
		JsonRpcHttpClient client = new JsonRpcHttpClient(serverURL);
		deviceService =  ProxyUtil.createClientProxy(getClass().getClassLoader(),
				AutomatorService.class, client);
	}
	
	public AutomatorService getDeviceService() {
		return deviceService;
	}

	


}
