package ru.netology;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.testng.Assert.assertEquals;

class RadioTest {
  @Test
  public void shouldCreate() {
    Radio rad = new Radio();
  }

  @Test
  public void shouldChangeFields() {
    Radio rad = new Radio();
    assertEquals(0, rad.currentStationNumber);
    rad.currentStationNumber = 15;
    assertEquals(15, rad.currentStationNumber );
  }

  @Test
  public void shouldChangeFields1() {
    Radio radio = new Radio();
    assertEquals(0, radio.currentStationNumber);
    radio.currentStationNumber = -10;
    assertEquals(-10, radio.currentStationNumber);
  }



  @Test
  public void shouldGetAndSet() {
    Radio radio = new Radio();
    String expected = "radio";

    assertNull(radio.getName());
    radio.setName(expected);
    assertEquals(expected, radio.getName());
  }



  @Test
  public void increaseVolume() {
    Radio radio = new Radio();
      Radio.setMaxVolume(10);
      Radio.setMinVolume(0);
      Radio.setCurrentVolume(5);
Radio.setCurrentVolume(6);
      int expected = 6;

      assertEquals(expected, Radio.setNewVolume);
    }

  @Test
  public void shouldIncreaseVolume() {
    Radio radio = new Radio();
    Radio.setMaxVolume(10);
    Radio.setMinVolume(0);
    Radio.setCurrentVolume(5);

    int expected = 6;

    assertEquals(expected,Radio.setNewVolume );
  }

  @Test
  public void shouldIncreaseVolumeMoreMax() {
    Radio Radio = new Radio();
    Radio.setMaxVolumeLevel(10);
    Radio.setMinVolumeLevel(0);
    Radio.setCurrentVolume(11);

    int expected = 10;

    assertEquals(expected, Radio.setNewVolume);
  }



  @Test
  public void shouldIncreaseVolumeLessMin() {
    Radio Radio = new Radio();
    Radio.setCurrentVolume(-1);

    int expected = 0;
    assertEquals(expected, Radio.setNewVolume);
  }

  @Test
  public void shouldDecreaseVolume() {
    Radio Radio = new Radio();
    Radio.setMaxVolumeLevel(10);
    Radio.setMinVolumeLevel(0);
    Radio.setCurrentVolume(8);

    Radio.setCurrentVolume(7);

    int expected = 7;

    assertEquals(expected, Radio.setNewVolume);
  }

  @Test
  public void shouldDecreaseVolumeMoreMax() {
    Radio Radio = new Radio();
    Radio.setCurrentVolume(11);

    int expected = 0;
    assertEquals(expected, Radio.setNewVolume);
  }

  @Test
  public void shouldDecreaseVolumeLessMin() {
    Radio Radio = new Radio();
    Radio.setCurrentVolume(-5);

    int expected = 0;
    assertEquals(expected, Radio.setNewVolume);
  }

  @Test
  public void shouldIncreaseStation() {
    Radio Radio = new Radio();
    Radio.setCurrentStation(9);
    Radio.setMinStation(0);
    Radio.setMaxStation(9);

    int expected = 0;
    assertEquals(expected, Radio.setNewStation);
  }

  @Test
  public void shouldIncreaseStationMoreMax() {
    Radio Radio = new Radio();
    Radio.setCurrentStation(11);

    int expected = 1;
    assertEquals(expected, Radio.setNewStation);
  }

  @Test
  public void shouldDecreaseStationLessMin() {
    Radio radio = new Radio();
    radio.setCurrentStation(-10);

    int expected = 9;
    assertEquals(expected, radio.setNewStation);
  }



  @Test
  public void shouldInitField() {
    Radio Radio = new Radio();
    assertNull(Radio.getName());
    assertEquals(9, Radio.getMaxStation());
    assertEquals(0, Radio.getMinStation());
    assertEquals(0, Radio.getCurrentStation());
    assertEquals(10, Radio.getMaxVolumeLevel());
    assertEquals(0, Radio.getMinVolumeLevel());
    assertEquals(0, Radio.getCurrentVolume());
    assertFalse(Radio.isOn());
  }

  private void assertFalse(boolean on) {
  }



  @Test
  public void shouldChangeFields5() {
    Radio radio = new Radio();
    assertEquals(0, radio.currentStation);
    radio.currentStation = 5;
    assertEquals(5, radio.currentStation);
  }
}
