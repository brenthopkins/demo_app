package coderbytes;

public class Mindera {

	public static void main (String[] args) {
		OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
		Cache cache = (Cache) optimizedDiskCache;
		DiskCache diskCache = (DiskCache) cache;

		System.out.println(diskCache.toString());
		System.out.println(optimizedDiskCache.toString());
		System.out.println(cache.toString());
		System.out.println("it passed!");
	}
}
