public class Computer
{
    private CPU proccesor;
    private RAM memory;
    private Hard hardMemory;
    private SalesCompany shop;
    private String manufacturer;
    private String releaseDate;
    private String nameOfComputer;
    
    public void setNameOfComputer(String nameOfComputer){
        this.nameOfComputer = nameOfComputer;
    }
    
    public String getNameOfComputer(){
        return nameOfComputer;
    }
    
    public Computer(){
        this.proccesor = new CPU();
        this.memory = new RAM();
        this.shop = new SalesCompany();
        this.hardMemory = new Hard();
    }
    
    public CPU getProccesor(){
        return proccesor;
    }
    
    public RAM getMemory(){
        return memory;
    }
    
    public Hard getHardMemory(){
        return hardMemory;
    }
    
    public SalesCompany getShop(){
        return shop;
    }
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }
    
    public String getReleaseDate(){
        return releaseDate;
    }
    
    public void printAboutObject()
    {
        System.out.println("Название - " + nameOfComputer);
        System.out.println();
        System.out.println("Характеристики процессора:");
        System.out.println("Тактовая частота - " + this.proccesor.getClockFrequency());
        System.out.println("Тип процессора - " + this.proccesor.getProcessorType());
        System.out.println("Тип сокета - " + this.proccesor.getSocketType());
        System.out.println("Количество ядер - " + this.proccesor.getNumberOfCores());
        System.out.println("Количество потоков - " + this.proccesor.getNumberOfThreads());
        System.out.println();
        System.out.println("Характеристики оператичной памяти: ");
        System.out.println("Такктовая частоат - " + this.memory.getRamClockSpeed());
        System.out.println("Объем - " + this.memory.getRamVolume());
        System.out.println("Поколение - " + this.memory.getRamGeneration ());
        System.out.println();
        System.out.println("Характеристики жесткого диска: ");
        System.out.println("Объем - " + this.hardMemory.getDiskSpace());
        System.out.println("Количество оборотов - " + this.hardMemory.getNumberOfRevolutions());
        System.out.println("Кэш память - " + this.hardMemory.getCacheMemory());
        System.out.println();
        System.out.println("Производитель - " + manufacturer);
        System.out.println("Где преобрести - " + this.shop.getNameSalesCompany());
        System.out.println("Номер телефона - " + this.shop.getNumberSalesCompany());
        System.out.println("Адрес магазина - " + this.shop. getAddressSalesCompany());
        System.out.println("Дата выпуска - " + releaseDate);
    }
}
