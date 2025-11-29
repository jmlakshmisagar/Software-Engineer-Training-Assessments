package memory.management.practice;

public class MyResource implements AutoCloseable {
	
	public static MyResource getResource() throws Exception {
		try(MyResource resource = new MyResource();){
			System.out.println("Resource using");
			return resource;
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("REesource closed...");

	}

	public static void main(String[] args) throws Exception {
		MyResource myResource = getResource();
		System.out.println("Requesting GC");
		System.gc();
	}
}
