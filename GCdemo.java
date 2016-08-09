package prepassignments;

public class GCdemo {
	
private class Blob {
	
int space[] = new int[1000];

}

public static void main(String[] args) {
// run this with increasing values of n.
// How large can n be?
	int n = 10000000;//this starts giving Java heap space error after n>10000  and space>1000
	
//Blob blobStore[] = new Blob[n];

for(int i=0;i<n;i++) {
	
GCdemo gc = new GCdemo();
Blob b = gc.new Blob();
// what happens if you comment the following
//blobStore[i] = b; this gets commented, then the reference b is not used anywhere so, GC can deallocate it, and heap space does not exceed.
}
}
}