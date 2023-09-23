package com.simplilearn.java.hello;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class intrvwDemo {
//
//public static List<Integer> lt; List<Integer> gt; static Object sentTimes(
//		int numberOfPorts, 
//		int transmissionTime, 
//		List<Integer> packetIds	 
//
//) {	
//	List<Integer> lt; List<Integer> gt; sentPorts = new ArrayList()lt; gt;();
//int currentTime = 1;
//int[] availPorts = new int[numberOfPorts];
//Queue<Integer> lt;  List<Integer> gt; portQueue = new LinkedList()&lt;&gt;();
//
//for (int packetId : packetIds) {
//// Dequeue ports that are available
//while (!portQueue.isEmpty() &amp;&amp; availPorts[portQueue.peek()] &lt;= currentTime) {
//portQueue.poll();
//}
//
//// If all ports are busy, wait for the next available one
//if (portQueue.size() == numberOfPorts) {
//currentTime = availPorts[portQueue.poll()];
//}
//
//// Find an available port for the current packet
//int port = packetId % numberOfPorts;
//while (availPorts[port] &gt; currentTime) {
//
//port = (port + 1) % numberOfPorts;
//}
//
//// Send the packet, update port availability time, and enqueue the port
//availPorts[port] = currentTime + transmissionTime;
//portQueue.offer(port);
//sentPorts.add(port);
//currentTime += 1;
//}
//
//return sentPorts;
//}
//	
//
//	public static void main(String[] args) {
//		int numberOfPorts = 4;
//		int transmissionTime = 2;
//		
//		List<Integer> lt; List<Integer> gt; List<Integer> packetIds = java.util.List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		Object sentPorts = sentTimes(numberOfPorts, transmissionTime, packetIds);
//		
//		char[] quot;
//		System.out.println(quot; Sent Ports: quot; + sentPorts);
//		
//		}
//

	
	
//	private static Object sentTimes(int numberOfPorts, int transmissionTime, List<Integer> packetIds) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	}



//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class PortScheduler {
//	
//	
//public static List&lt;Integer&gt; sentTimes(int numberOfPorts, int transmissionTime, List&lt;Integer&gt;
//packetIds) {
//List&lt;Integer&gt; sentPorts = new ArrayList&lt;&gt;();
//int currentTime = 1;
//int[] availPorts = new int[numberOfPorts];
//Queue&lt;Integer&gt; portQueue = new LinkedList&lt;&gt;();
//
//for (int packetId : packetIds) {
//// Dequeue ports that are available
//while (!portQueue.isEmpty() &amp;&amp; availPorts[portQueue.peek()] &lt;= currentTime) {
//portQueue.poll();
//}
//
//// If all ports are busy, wait for the next available one
//if (portQueue.size() == numberOfPorts) {
//currentTime = availPorts[portQueue.poll()];
//}
//
//// Find an available port for the current packet
//int port = packetId % numberOfPorts;
//while (availPorts[port] &gt; currentTime) {
//
//port = (port + 1) % numberOfPorts;
//}
//
//// Send the packet, update port availability time, and enqueue the port
//availPorts[port] = currentTime + transmissionTime;
//portQueue.offer(port);
//sentPorts.add(port);
//currentTime += 1;
//}
//
//return sentPorts;
//}
//
//public static void main(String[] args) {
//int numberOfPorts = 4;
//int transmissionTime = 2;
//List&lt;Integer&gt; packetIds = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//List&lt;Integer&gt; sentPorts = sentTimes(numberOfPorts, transmissionTime, packetIds);
//System.out.println(&quot;Sent Ports: &quot; + sentPorts);
//}
//}