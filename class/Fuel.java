class FuelLimitException extends Exception{
    public FuelLimitException(String s){
        super(s);
    }
}

class FuelMonitor{
    private int tankCapacity;
    private int efficiency;
    private int fuel_in_tank;
    FuelMonitor(int t,int e){
        fuel_in_tank=0;
        tankCapacity=t;
        efficiency=e;
    }
    void dispFuel(){
        System.out.println("fuel in tank:"+fuel_in_tank+"litres");
        System.out.println("initial TankCapacity:"+tankCapacity+"litres");
        System.out.println("initial efficiency:"+efficiency+"km per litre");
    }
    void addFuel(int fuel) throws FuelLimitException{
        int fuel_available=tankCapacity-fuel_in_tank;
        if(fuel<fuel_available){
            fuel_in_tank=fuel_in_tank+fuel;
            fuel_available=tankCapacity-fuel_in_tank;
        }
        else
            throw new FuelLimitException("sufficient tank capacity,no need to add fuel");
        dispFuel();
    }
    void driveDistance(){
        int distance;
        distance=fuel_in_tank*efficiency;
        System.out.println("distance:"+distance+"km");
    }
    public static void main(String[] args) {
        FuelMonitor car = new FuelMonitor(20,20);
        try{
        car.addFuel(15);
        }
        catch(FuelLimitException f){
            System.out.println(f.getMessage());
        }
        finally{
        car.driveDistance();
        }
    }

}
