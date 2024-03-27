package FlyweightMode;

import java.util.ArrayList;
import java.util.List;

public class DevicePool {
  private static List<Device> devicepool = new ArrayList<>();
  private static int devicenum = 0;
 
  public static Device getDevice() {
    for(Device obj : devicepool) {
      if(!obj.using) {
        return obj;
      }
    }
    Device d = new Device(devicepool.size() + 1);
    ++devicenum;
    devicepool.add(d);
    return d;
  }
  public static int getDeviceNum() {
    return devicenum;
  }
}
