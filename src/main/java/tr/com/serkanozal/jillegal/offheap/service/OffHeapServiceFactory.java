/**
 * @author SERKAN OZAL
 *         
 *         E-Mail: <a href="mailto:serkanozal86@hotmail.com">serkanozal86@hotmail.com</a>
 *         GitHub: <a>https://github.com/serkan-ozal</a>
 */

package tr.com.serkanozal.jillegal.offheap.service;

import tr.com.serkanozal.jillegal.Jillegal;

public class OffHeapServiceFactory {

	static {
		Jillegal.init();
	}
	
	private static OffHeapService offHeapService = new OffHeapServiceImpl();
	
	private OffHeapServiceFactory() {
		
	}
	
	public static OffHeapService getOffHeapService() {
		return offHeapService;
	}
	
	public static void setOffHeapService(OffHeapService service) {
		offHeapService = service;
	}
	
}
