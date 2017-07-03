package com.nasa.in;


import java.io.BufferedReader;
import java.io.File;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class RestAPICallTests {
	public static void main(String[] args) {
		String id = "";
		String expected="";

		try {
			System.setProperty("https.protocols", "TLSv1.2");
			HttpURLConnection urlConnection = null;
			File testCaseFile = new File("test.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document testCaseDocument = dBuilder.parse(testCaseFile);
			testCaseDocument.getDocumentElement().normalize();
			System.out.println("Sounds element :"
					+ testCaseDocument.getDocumentElement().getNodeName());
			NodeList soundList = testCaseDocument.getElementsByTagName("sound");
			System.out.println("----------------------------");

			for (int soundCount = 0; soundCount < soundList.getLength(); soundCount++) {
				try {
					Node soundNode = soundList.item(soundCount);
					System.out.println("\nSound Element :"
							+ soundNode.getNodeName());
					if (soundNode.getNodeType() == Node.ELEMENT_NODE) {
						Element soundElement = (Element) soundNode;
						System.out.println("Test Case Id : "
								+ soundElement.getAttribute("id"));
						System.out.println("Test Case Type : "
								+ soundElement.getAttribute("testType"));

						 expected = soundElement
								.getAttribute("expectedResult");

						String q = "";
						String limit = "";
						String apiKey = "";
						id = soundElement.getAttribute("id");
						String status = "";

						boolean isFirstParameter = false;
						if (null != soundElement.getElementsByTagName("q")
								.item(0)) {
							q = soundElement.getElementsByTagName("q").item(0)
									.getTextContent();
						}
						if (null != soundElement.getElementsByTagName("limit")
								.item(0)) {
							limit = soundElement.getElementsByTagName("limit")
									.item(0).getTextContent();
						}
						if (null != soundElement.getElementsByTagName("apikey")
								.item(0)) {
							apiKey = soundElement
									.getElementsByTagName("apikey").item(0)
									.getTextContent();
						}

						System.out.println("q : " + q);
						System.out.println("Limit : " + limit);
						System.out.println("API Key : " + apiKey);
						System.out.println("expected :" +expected);

						StringBuffer URLString = new StringBuffer();
						URLString
								.append("https://api.nasa.gov/planetary/sounds");

						Map<String, String> inputParameters = new HashMap<String, String>();
						if (!q.isEmpty()) {
							URLString.append(isFirstParameter ? "&" : "?");
							URLString.append("q=");
							URLString.append(q);
							if (!isFirstParameter) {
								isFirstParameter = true;
							}
						}

						if (!limit.isEmpty()) {
							URLString.append(isFirstParameter ? "&" : "?");
							URLString.append("limit=");
							URLString.append(limit);
							if (!isFirstParameter) {
								isFirstParameter = true;
							}
						}

						if (!apiKey.isEmpty()) {
							URLString.append(isFirstParameter ? "&" : "?");
							URLString.append("api_key=");
							URLString.append(apiKey);
							if (!isFirstParameter) {
								isFirstParameter = true;
							}
						}
						System.out.println(URLString);
						URL url = new URL(URLString.toString());
						urlConnection = (HttpURLConnection) url
								.openConnection();
						urlConnection.setDoOutput(true);
						urlConnection.setRequestMethod("GET");
						urlConnection.setRequestProperty("Accept",
								"application/json");

						InputStream is = urlConnection.getInputStream();
						BufferedReader br = new BufferedReader(
								new InputStreamReader(is));
						String line = null;
						StringBuffer sb = new StringBuffer();
						while ((line = br.readLine()) != null) {
							sb.append(line);
						}
						if (urlConnection.getResponseCode() != HttpURLConnection.HTTP_OK) {
							System.out.println("Respone Code "
									+ urlConnection.getResponseCode()
									+ " Stack Trace " + sb);
						}

						System.out.println("id:"
								+ id
								+ ", Status:"
								+ urlConnection.getResponseCode()
								+ (expected.equals(String.valueOf(urlConnection
										.getResponseCode())) ? "   Pass" : "   Fail"));

					}
				} catch (Exception e) {
					// e.printStackTrace();
					System.out.println("id:"
							+ id
							+ ", Status:"
							+ urlConnection.getResponseCode()
							+ (expected.equals(String.valueOf(urlConnection
									.getResponseCode())) ? "   Pass" : "   Fail"));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	}
