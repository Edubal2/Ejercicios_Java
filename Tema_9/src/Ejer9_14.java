import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class Ejer9_14 {

    public static String[] datos() {
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        String[] info = new String[3];
        info[0] = String.valueOf((osBean.getSystemCpuLoad()));
        info[1] = String.valueOf(osBean.getFreePhysicalMemorySize()/ (1024 * 1024));
        info[2] = String.valueOf(osBean.getTotalPhysicalMemorySize()/ (1024 * 1024));

        return info;
    }


    public static void main(String[] args) {

            System.out.println("CPU Load " + datos()[0]);
            System.out.println("Free Memory " + datos()[1] + " MB");
            System.out.println("Total Memory " + datos()[2] + " MB");


    }
}
