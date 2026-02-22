package com.cosmicstep.launcher.data;

import java.io.*;
import java.util.Properties;

public class DataPersistence {

    private Properties properties;
    private String configFilePath;

    public DataPersistence(String configFilePath) {
        this.configFilePath = configFilePath;
        properties = new Properties();
    }

    public void loadConfig() throws IOException {
        try (InputStream input = new FileInputStream(configFilePath)) {
            properties.load(input);
        }
    }

    public void saveConfig() throws IOException {
        try (OutputStream output = new FileOutputStream(configFilePath)) {
            properties.store(output, "Configuration Settings");
        }
    }

    public String getSetting(String key) {
        return properties.getProperty(key);
    }

    public void setSetting(String key, String value) {
        properties.setProperty(key, value);
    }
}
