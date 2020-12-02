class CPU { 
    
    private double clockFrequency;
    private String processorType;
    private String socketType;
    private int numberOfCores;
    private int numberOfThreads;
    
    public void setClockFrequency(double clockFrequency){
        this.clockFrequency = clockFrequency;
    }
    
    public double getClockFrequency(){
        return clockFrequency;
    }
    
    public void setProcessorType(String processorType){
        this.processorType = processorType;
    }
    
    public String getProcessorType(){
        return processorType;
    }
    
    public void setSocketType(String socketType){
        this.socketType = socketType;
    }
    
    public String getSocketType(){
        return socketType;
    }
    
    public void setNumderOfCores( int numberOfCores){
        this.numberOfCores = numberOfCores;
    }
    
    public int getNumberOfCores(){
        return numberOfCores;
    }
    
    public void setNumberOfThreads(int numberOfThreads){
        this.numberOfThreads = numberOfThreads;
    }
    
    public int getNumberOfThreads(){
        return numberOfThreads;
    }
}