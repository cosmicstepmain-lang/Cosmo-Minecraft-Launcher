package com.cosmicstep.launcher.ai.hardware;

public class HardwareProfile {
    private String cpuModel;
    private int cpuCores;
    private int cpuThreads;
    private long totalRAM;
    private long availableRAM;
    private String gpuModel;
    private long gpuVRAM;
    private String osName;
    private String osVersion;
    private String javaVersion;
    private String performanceTier;

    public HardwareProfile(String cpuModel, int cpuCores, int cpuThreads, long totalRAM, long availableRAM, String gpuModel, long gpuVRAM, String osName, String osVersion, String javaVersion) {
        this.cpuModel = cpuModel;
        this.cpuCores = cpuCores;
        this.cpuThreads = cpuThreads;
        this.totalRAM = totalRAM;
        this.availableRAM = availableRAM;
        this.gpuModel = gpuModel;
        this.gpuVRAM = gpuVRAM;
        this.osName = osName;
        this.osVersion = osVersion;
        this.javaVersion = javaVersion;
        this.performanceTier = calculatePerformanceTier();
    }

    private String calculatePerformanceTier() {
        if (totalRAM < 4096) {
            return "Low";
        } else if (totalRAM < 8192) {
            return "Medium";
        } else if (totalRAM < 16384) {
            return "High";
        } else {
            return "Ultra";
        }
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public int getCpuThreads() {
        return cpuThreads;
    }

    public long getTotalRAM() {
        return totalRAM;
    }

    public long getAvailableRAM() {
        return availableRAM;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public long getGpuVRAM() {
        return gpuVRAM;
    }

    public String getOsName() {
        return osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public String getPerformanceTier() {
        return performanceTier;
    }

    @Override
    public String toString() {
        return "HardwareProfile{" +
                "cpuModel='" + cpuModel + '\'' +
                ", cpuCores=" + cpuCores +
                ", totalRAM=" + totalRAM + " MB" +
                ", gpuModel='" + gpuModel + '\'' +
                ", performanceTier='" + performanceTier + '\'' +
                '}';
    }
}