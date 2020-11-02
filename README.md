# Open Camera Extensions
[![Build Status](https://travis-ci.org/azaat/opencamera-extensions.svg?branch=master)](https://travis-ci.org/azaat/opencamera-extensions)

**This repository is created to extend OpenCamera application with the following capabilities:**

- Support asynchronous IMU recording, provide settings for different IMU frequencies
- Menu with some important smartphone properties
  - preprocessing options (optical/digital video stabilization)
  - whether or not IMU and camera be synchronized
- Provide recording of smartphone model and build number
- Support remote recording over the network (Open Camera Remote can be used as basis)

**How to enable sensor data recording?**

Go to OpenCamera preferences and press the ```Enable IMU recording``` switch. Additionally, in preferences you can specify sensor sampling rate in microseconds, but this number is only a hint to the system according to the android documentation.

**How to find recorded IMU data?**

All videos recorded by the camera are located in OpenCamera folder on the disk (usually in DCIM), additional info can be found in subdirectories with video date as a name. 

Data saved in the subdirectory ```./<currentVideoDate>```:

- ```<video_name>gyro.csv```, data format: ```X-data, Y-data, Z-data, timestamp (ns)```
- ```<video_name>accel.csv```, data format: ```X-data, Y-data, Z-data, timestamp (ns)```

**Contribution**

The project follows [AOSP Java Code Style](https://source.android.com/setup/contribute/code-style), main principles:

- Non-public fields should start with ```m```, constants are ```ALL_CAPS_UNDERSCORES``` 
- Standard brace style:
```java
if () {
    //...
} else {
    //...
}
```
- Limit line length