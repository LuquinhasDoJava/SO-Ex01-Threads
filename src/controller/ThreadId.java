package controller;

public class ThreadId extends Thread {
	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		int id = (int) getId();
		System.out.println("TID="+id+" Numero atribuido: "+idThread);
	}

}
