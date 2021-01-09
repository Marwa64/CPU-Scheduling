package Schedulers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static public void main (String[] arg) {
		int numberOfProcesses;
		int RRQuantum;
		
		ArrayList<Process> Processes = new ArrayList<Process>();

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of processes: ");
		numberOfProcesses = input.nextInt();
		
		System.out.print("Enter Round Robin Time Quantum: ");
		RRQuantum = input.nextInt();
		
		
		// Read Processes
		for(int i = 0 ; i < numberOfProcesses; ++i) {
			input = new Scanner(System.in);
			Process p = new Process();
			System.out.print( (i+1) + "th Process name: ");
			p.setName(input.nextLine());
		
			System.out.print( (i+1) + "th Process arraival time: ");
			p.setArrivalTime(input.nextInt()) ;
			
			System.out.print( (i+1) + "th Process burst time: ");
			p.setBurstTime(input.nextInt());
			
			System.out.print( (i+1) + "th Process queue qumber: ");
			p.setPriority(input.nextInt());
						
			Processes.add(p);	
		}
		
		while (true) {
			System.out.println("\nSelect the Scheduler you want to use:"
					+ "\n[1] Preemptive Shortest- Job First (SJF)"
					+ "\n[2] Round Robin (RR)"
					+ "\n[3] Preemptive Priority Scheduling."
					+ "\n[4] Multi Level Scheduling."
					+ "\n[5] End");
			int option = input.nextInt();
			if(option == 1) {

			}
			else if(option == 2) {

			}
			else if(option == 3) {

			}
			else if(option == 4)  {
				
			}
			else if (option == 5) {
				System.exit(0);
			}
			else {
				System.out.println("Invalid option!");
			}
		}
	}
}