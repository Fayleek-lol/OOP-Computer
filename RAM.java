class RAM {
    
    private int ramClockSpeed;
    private int ramVolume;
    private String ramGeneration;
    
    public void setRamClockSpeed(int ramClockSpeed){
        this.ramClockSpeed = ramClockSpeed;
    }
    
    public int getRamClockSpeed(){
        return ramClockSpeed;
    }
    
    public void setRamVolume(int ramVolume){
        this.ramVolume = ramVolume;
    }
    
    public int getRamVolume (){
        return ramVolume;
    }
    
    public void setRamGeneration ( String ramGeneration){
        this.ramGeneration = ramGeneration;
    }
    
    public String getRamGeneration (){
        return ramGeneration;
    }
}