package com.example.moneytransfer;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

public class App {
	
	private static String DEFAULT_HOST_NAME = "localhost";
	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Starting Embedded Jersey HTTPServer...\n");
		HttpServer crunchifyHTTPServer = createHttpServer();
		crunchifyHTTPServer.start();
		System.out.println("Started Embedded Jersey HTTPServer Successfully !!!");
	}

	private static HttpServer createHttpServer() throws IOException {
		ResourceConfig resourceConfig = new PackagesResourceConfig("com.example.moneytransfer.service");
		return HttpServerFactory.create(getURI(), resourceConfig);
	}

	private static URI getURI() {
		return UriBuilder.fromUri("http://" + getHostName() + "/").port(8080).build();
	}

	private static String getHostName() {
		String hostName = "";
		try {
			hostName = InetAddress.getLocalHost().getCanonicalHostName();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return hostName != null ? hostName : DEFAULT_HOST_NAME;
	}
}
