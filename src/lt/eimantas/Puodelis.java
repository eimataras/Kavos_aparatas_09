package lt.eimantas;

public class Puodelis {
    private int maxSize;


    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public  void rodykInformacija () {
        System.out.println("Puodelio talpa: "+maxSize);
    }
}
