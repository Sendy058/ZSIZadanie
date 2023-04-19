package Space;

public class Vesmir {
   public boolean state;
   private long size;
   private String owner;

    public Vesmir() {
        state = false;
        size = 0;
    }
    public void startVesmir(){
        state = true;
        System.out.println("Vesmir nastartovany");
        increaseSize();

    }
    public void stopVesmir(){
        state = false;
        System.out.println("Vesmir vypnuty");
        //decreaseSize(100);
    }
    private void increaseSize(){
        while(size!=999){
            size++;
        }
        System.out.println("velkost je "+size+"km3");
    }
    private void decreaseSize(long desiredSize){
        while (size!=desiredSize){
            size--;
        }
        System.out.println("Velkost je " +size+"km3");
    }
}
