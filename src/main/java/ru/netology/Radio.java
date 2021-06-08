package ru.netology;

class Radio<currentVolume, CurrentStationNumber> {

    private static int MinVolume = 0;
    private static int currentVolume = 0;
    private static int maxVolume = 10;
    private static int minVolume = 0;
    static int currentStation;

    public static int setNewVolume;
    public int setNewStation;


    boolean on;








    public static int MaxVolume = 10;



    int currentStationNumber;




    private int volume;
    private String name;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int maxStation = 9;
    private int minStation = 0;


    public boolean isOn() {
        return on;

    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public static void setCurrentVolume(int i) {
    }

    public static void setMaxVolumeLevel(int i) {
    }

    public static void setMinVolumeLevel(int i) {
    }

    public static void getCurrentVolume(int i) {
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStationNumber) {
            return;
        }
        if (currentStation < minStationNumber) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStationNumber = 9;
    }

    public void setMaxStation(int maxStation) {
        maxStationNumber = maxStation;
    }

    public int getMinStation() {
        return minStationNumber;
    }

    public void setMinStation(int minStation) {
        minStationNumber = minStation;
    }


    public void setCurrentVolume(int currentVolume, int MinVolume) {
        if (currentVolume > MaxVolume) {
            return;
        }

        if (currentVolume < MinVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolumeLevel() {
        return MaxVolume;
    }

    public static void setMaxVolume(int i) {
        MaxVolume = maxVolume;
    }

    public int getMinVolumeLevel() {
        return MinVolume;
    }

    public static int setMinVolume(int i) {
        MinVolume = minVolume;
        return 0;
    }


    public void setNewVolume() {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentVolume = currentVolume;
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            if (currentVolume > 10) {
                currentVolume = currentVolume - 1;

            }
        }


    }

    public void setNewStation() {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentVolume = currentVolume;


        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        }
        if (currentVolume > 10) {
            currentVolume = currentVolume - 1;
        }
    }
}



















