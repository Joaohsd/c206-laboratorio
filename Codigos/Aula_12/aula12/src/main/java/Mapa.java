public class Mapa extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Gerando Mapa!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
