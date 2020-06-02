package com.ejemplo.base.javaUtils;

public class WebDriverBaseUrl {

	public static String getUrl(String enviroment) {
		String url = "";
		switch (enviroment) {
		case "URL_TEST":
			url ="";
			break;
		}
		return url;
	}

	private WebDriverBaseUrl() {
		throw new IllegalStateException("Utility class");
	}

}
