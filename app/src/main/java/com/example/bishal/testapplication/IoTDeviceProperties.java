package com.example.bishal.testapplication;
import java.util.Properties;

public final class IoTDeviceProperties {

    public static final String TCPAddress = System.getProperty("TCPAddress",
            "tcp://rgecs9.messaging.internetofthings.ibmcloud.com:1883");

    public static final String username = "use-token-auth";
    //
    public static final char[] password = "q61@ZrUoa935OLCHXD".toCharArray();

    //	public static String clientId = "d:quickstart:javadevice:001122334455";
    public static String clientId = "d:rgecs9:Pi:gateway_jindal";

    public static final String topicStringSub = "iot-2/evt/jindal/fmt/json";

    public static final int QoS =0;

    public static final long sleepTimeout = 5000;


    public static final Properties getSSLSettings() {
        final Properties properties = new Properties();
        properties.setProperty("com.ibm.ssl.keyStore",
                "C:\\IBM\\MQ\\Data\\ClientKeyStore.jks");
        properties.setProperty("com.ibm.ssl.keyStoreType", "JKS");
        properties.setProperty("com.ibm.ssl.keyStorePassword", "password");
        properties.setProperty("com.ibm.ssl.trustStore",
                "C:\\IBM\\MQ\\Data\\ClientTrustStore.jks");
        properties.setProperty("com.ibm.ssl.trustStoreType", "JKS");
        properties.setProperty("com.ibm.ssl.trustStorePassword", "password");
        return properties;
    }
}