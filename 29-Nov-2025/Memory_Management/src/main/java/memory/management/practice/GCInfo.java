package memory.management.practice;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GCInfo {
	public static void main(String[] args) throws InterruptedException {
		List<GarbageCollectorMXBean> garbageCollectorMXBeans = ManagementFactory.getGarbageCollectorMXBeans();
		System.out.println("Requesting gc");
		
		System.gc();
		Thread.sleep(1000);

		for (GarbageCollectorMXBean bean : garbageCollectorMXBeans) {

			System.out.println("GC Names : " + bean.getName());
			System.out.println("Count : " + bean.getCollectionCount());
			System.out.println("Time(ms) : " + bean.getCollectionTime());
		}
	}
}
