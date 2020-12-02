class Main {
    public static void main(String [] args){
        Computer comp = new Computer();
        
        comp.getProccesor().setClockFrequency(5);
        comp.getProccesor().setProcessorType("Intel i9-9900k");
        comp.getProccesor().setSocketType("LGA1151v2");
        comp.getProccesor().setNumderOfCores(8);
        comp.getProccesor().setNumberOfThreads(16);
        
        comp.getMemory().setRamClockSpeed(3200);
        comp.getMemory().setRamVolume(32);
        comp.getMemory().setRamGeneration("DDR 4");
        
        comp.getShop().setNumberSalesCompany("89623044678");
        comp.getShop().setNameSalesCompany("Куклус клан");
        comp.getShop().setAddressSalesCompany("у. Пушкина 14 п. 88");
        
        comp.getHardMemory().setDiskSpace(1024);
        comp.getHardMemory().setNumberOfRevolutions(7200);
        comp.getHardMemory().setCacheMemory(64);
        
        comp.setManufacturer("HayperPC");
        comp.setReleaseDate("02.12.2020");
        comp.setNameOfComputer("DungeonMaster");
        comp.printAboutObject();
    }
}