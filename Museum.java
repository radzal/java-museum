import java.util.*;
import java.text.DecimalFormat;

public class Museum{


    
    public static void main(String[] args){
    int switchNum;
    int switchBike;
    int switchCar;
    String y_n = "";
    
    Scanner input = new Scanner(System.in);
    TestVal testValue = new TestVal();
    AddCar car =  new AddCar();
    AddBike bike = new AddBike();
    
    System.out.println("\n\n\nWhat would you like to do: \n");

    bike.preBike();
    car.preCar();

        do{ 
           
            System.out.println("---------------------------------------\n|         M A I N    M E N U          |\n---------------------------------------\n|  1. Bike Entries SUB-MENU           |\n|  2. Cars Entries SUB-MENU           |\n|  3. List vehicle in given year      |\n|  4. List vehicle of 1000cc and over |\n|  5. List all bikes                  |\n|  6. List all cars                   |\n|  7. Exit                            |\n---------------------------------------\n     HINT: Back to Main Menu -> 0");
            switchNum = testValue.keyValidInt7();
            switch(switchNum)
                {
                
                case 1:
                        System.out.println("---------------------------------------\n|     >>  B I K E    M E N U          |\n---------------------------------------\n|  1. Bike Entries SUB-MENU           |\n|     1. Add entry                    |\n|     2. Delete entry                 |\n|     3. edit Entry                   |\n|     4. Back to Main Menu            |\n|  2. Cars Entries SUB-MENU           |\n|  5. List all bikes                  |\n|  6. List all cars                   |\n|  7. Exit                            |\n---------------------------------------\n     HINT: Back to Main Menu -> 0");
                        //System.out.println("---------------------------------------\n|          B I K E   M E N U          |\n---------------------------------------\n|  1. Add entry                       |\n|  2. Delete entry                    |\n|  3. Edit entry                      |\n|  4. Back to Main Menu               |\n---------------------------------------");
                        switchBike = testValue.keyValidInt7();
                        switch(switchBike){
                        case 1:
                            System.out.println("\nADDING BIKE\nTo back to menu type 'exit'\n");
                            bike.addVehivleBike();
                            break;
                        case 2:
                            System.out.print("Input entry number to be removed: ");
                            int remBike = testValue.keyValidInt0();
                            if(remBike == 0){
                            break;
                            }
                            bike.removeRecB(remBike);
                            break;
                        case 3:
                            System.out.print("What record number? ");
                            int putRecordB = testValue.keyValidInt0();
                            if(putRecordB == 0){
                            break;
                            }
                            bike.bikeRecord(putRecordB);
                            break;  
                        case 4:
                            break;
                        }
                        break;
                case 2:
                    System.out.println("---------------------------------------\n|      >> C A R S    M E N U          |\n---------------------------------------\n|  1. Bike Entries SUB-MENU           |\n|  2. Cars Entries SUB-MENU           |\n|     1. Add entry                    |\n|     2. Delete entry                 |\n|     3. edit Entry                   |\n|     4. Back to Main Menu            |\n|  5. List all bikes                  |\n|  6. List all cars                   |\n|  7. Exit                            |\n---------------------------------------\n     HINT: Back to Main Menu -> 0");
                    //System.out.println("---------------------------------------\n|           C A R    M E N U          |\n---------------------------------------\n|  1. Add entry                       |\n|  2. Delete entry                    |\n|  3. Edit entry                      |\n|  4. Back to Main Menu               |\n---------------------------------------");
                        
                        switchCar = testValue.keyValidInt7();
                        switch(switchCar){
                        case 1:
                            System.out.println("\nADDING CAR\nTo back to menu type 'exit'\n");
                            car.addVehivleCar();
                            break;
                        case 2:
                            System.out.print("Input entry number to be removed: ");
                            int remCar = testValue.keyValidInt0();
                            if(remCar == 0){
                            break;
                            }
                            car.removeRecC(remCar);
                            break;
                        case 3:
                            System.out.print("\nWhat record number? ");
                            int putRecordC = testValue.keyValidInt0();
                            if(putRecordC == 0){
                            break;
                            }
                            car.carRecord(putRecordC);
                            break;  
                        case 4:
                            break;
                        }
                        break;         
                     
                case 3:
                    System.out.print("Input vehicle' year of make: ");
                    int putAge = testValue.keyValidInt0();
                    System.out.println("\n  BIKES (production year: "+ putAge + ")");
                    bike.bikeAge(putAge);
                    System.out.println("\n  CARS (production year: "+ putAge + ")");
                    car.carAge(putAge);
                    break;
                case 4:
                    System.out.println("\n  BIKES (over 1000cc)");
                    bike.getBikeEngine();
                    System.out.println("\n  CARS (over 1000cc)");
                    car.getCarEngine();
                    break;
                case 5:
                    System.out.println("\n  BIKES  (full listing)");
                    bike.bikeList();
                    break;
                case 6:
                    System.out.println("\n  CARS (full listing)");
                    car.carList();
                    break;
                case 7:
                System.out.print("\nGoodbye!\n\n");
                System.exit(0);
                }
        }
        while(switchNum < 7);
    }
}


class TestVal{
    public static double keyValidDouble(){
    double inputTest = 0;
    Scanner input = new Scanner(System.in);
            while((!input.hasNextDouble()) ){
                System.out.println("Numbers only!");
                input.next();
                }
            inputTest = input.nextDouble();
        return inputTest;
    }   

public static int keyValidInt(){
    int inputTest = 0;
    Scanner input = new Scanner(System.in);
            while((!input.hasNextInt()) ){
                System.out.println("Numbers only!");
                input.next();
                }
            inputTest = input.nextInt();
        return inputTest;
    }
    
public static int keyValidInt3(){
    int inputTest;
    Scanner input = new Scanner(System.in);
        do{
            while((!input.hasNextInt()) ){
                System.out.println("Only numbers between 1 and 3!");
                input.next();
                } 
            inputTest = input.nextInt();
            if (inputTest < 1 || inputTest >3){
                System.out.println("Only numbers between 1 and 3!");
                }
            }while (inputTest < 1 || inputTest >3);
        return inputTest;
    }
public static int keyValidInt0(){
    int inputTest;
    Scanner input = new Scanner(System.in);
        do{
            while((!input.hasNextInt()) ){
                System.out.println("Only numbers!\nBack to main menu --> 0");
                input.next();
                } 
            inputTest = input.nextInt();
            if (inputTest == 0){
                //System.out.println("Only numbers!\nBack to main menu --> 0");
                break;
                }
            }while (inputTest == 0);
        return inputTest;
    }
public static int keyValidInt7(){
    int inputTest;
    Scanner input = new Scanner(System.in);
        do{
            while((!input.hasNextInt()) ){
                System.out.println("Only numbers between 1 and 7!");
                input.next();
                } 
            inputTest = input.nextInt();
            if (inputTest < 1 || inputTest >7){
                System.out.println("Only numbers between 1 and 7!");
                }
            }while (inputTest < 1 || inputTest >7);
        return inputTest;
    }        
}


class AddBike{
    
        //setting array
    Bikes[] addBike = new Bikes[100];

        //calling testing input validatin class
    TestVal testValue = new TestVal();
    Scanner input = new Scanner(System.in);
                //Setting initial bikes

            public void preBike(){
                    addBike[0] = new Bikes(0, "BK77LSC", 1970, 2500, "blue", "p", 1000, "Tourer");
                    addBike[1] = new Bikes(1, "CL22TRE", 1972, 1500, "Red", "p", 350, "Sport");
                    addBike[2] = new Bikes(2, "UU72LTT", 1969, 2600, "blue", "p", 1200, "Tourer");
                    addBike[3] = new Bikes(3, "LZ98GFR", 1955, 1200, "black", "p", 600, "Trials");
                    addBike[4] = new Bikes(4, "RRRETVR", 1963, 7600, "blue", "p", 650, "Tourer");
                    addBike[5] = new Bikes(5, "KQ54UNO", 1958, 6500, "gray", "p", 750, "Trials");
                    addBike[6] = new Bikes(6, "TO18LAT", 1980, 4500, "greem", "p", 900, "Sport");
                    }
                    
                //Bikess engine size (over 1000cc)
        public void getBikeEngine(){
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("Bike ID\t\tReg:\t\tYear:\tValue:\t\t Colour:\t\t    Engine:\t     Type:");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
                for(int u = 0; u < addBike.length; u++){
                    if(addBike[u]!=null){
                        if(addBike[u].getCC()>=1000)
                            System.out.println("   " + (addBike[u].getBikeID()+1) + "\t\t" + addBike[u].getBikePlate() + "\t\t" + addBike[u].getDate() + "\t" + addBike[u].getValue()+" GBP\t " + addBike[u].getColour() + "\t\t\t    " + addBike[u].getCC() + "cc"+ "\t     " + addBike[u].getType() + "\n");
                            }
                        }
             System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    }
                    
                //Bikes age in given year
        public void bikeAge(int age){
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("Bike ID\t\tReg:\t\tYear:\tValue:\t\t Colour:\t\t    Engine:\t     Type:");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
                for(int u = 0; u < addBike.length; u++){
                    if(addBike[u]!=null){
                        if(addBike[u].getDate() == age)
                            System.out.println("   " + (addBike[u].getBikeID()+1) + "\t\t" + addBike[u].getBikePlate() + "\t\t" + addBike[u].getDate() + "\t" + addBike[u].getValue()+" GBP\t " + addBike[u].getColour() + "\t\t\t    " + addBike[u].getCC() + "cc"+ "\t     " + addBike[u].getType() + "\n");
                            }
                        }
             System.out.println("----------------------------------------------------------------------------------------------------------------------");

                    }
                        
        public void bikeList(){
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("Bike ID\t\tReg:\t\tYear:\tValue:\t\t Colour:\t\t    Engine:\t     Type:");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
                for(int u = 0; u < addBike.length; u++){
                    if(addBike[u]!=null){
                            System.out.println("   " + (addBike[u].getBikeID()+1) + "\t\t" + addBike[u].getBikePlate() + "\t\t" + addBike[u].getDate() + "\t" + addBike[u].getValue()+" GBP\t " + addBike[u].getColour() + "\t\t\t    " + addBike[u].getCC() + "cc"+ "\t     " + addBike[u].getType() + "\n");
                            }
                        }
             System.out.println("----------------------------------------------------------------------------------------------------------------------");

                    }
            
        public void removeRecB(int rB){
                rB = rB-1; 
                    for(int u = rB; u < addBike.length - 1; u++){
                        addBike[u] = addBike[u + 1];
                        addBike[addBike.length - 1] = null;
                        }
                        for(int u = rB; u < addBike.length-1; u++){
                            if(addBike[u]!=null){
                                addBike[u].setBikeID(u);
                            }
                        }
                    }
                    
        public void bikeRecord(int bRecord){
                    String typeBike = "";
                    bRecord--;
                    System.out.print("Reg plates: ");
                    String plateBike = input.next();
                               
                    System.out.print("Production date: ");
                    int dateBike = testValue.keyValidInt();
            
                    System.out.print("Value: ");
                    double valueBike = testValue.keyValidDouble();
            
                    System.out.print("Colour: ");
                    String colourBike = input.next();
            
                    System.out.print("Engine size in cc: ");
                    int  ccBike = testValue.keyValidInt();
            
                    System.out.println("\nBike type:\n1. Sport\n2. Tourer\n3. Trails");
                    int tBike = testValue.keyValidInt3();
                        if(tBike == 1){
                            typeBike = "Sport";
                            }
                    else if(tBike == 2){
                            typeBike = "Tourer";
                            }
                    else if(tBike == 3){
                            typeBike = "Trails";
                            }
                
                    addBike[bRecord] = new Bikes(bRecord, plateBike, dateBike, valueBike, colourBike, "p", ccBike, typeBike);
  
                        }  
                        
        //method - to start processing Bike – used in MAIN
    public void addVehivleBike(){
        String typeBike = "";
        int a = 0;
            for(a = 0; a < addBike.length; a++){
                if(addBike[a]==null){
                    System.out.print("Reg plates: ");
                    String plateBike = input.next();
                        if(plateBike.equals("exit")){
                        break;}
            
                    System.out.print("Production date: ");
                    int dateBike = testValue.keyValidInt();
            
                    System.out.print("Value: ");
                    double valueBike = testValue.keyValidDouble();
            
                    System.out.print("Colour: ");
                    String colourBike = input.next();
            
                    System.out.print("Engine size in cc: ");
                    int  ccBike = testValue.keyValidInt();
            
                    System.out.println("\nBike type:\n1. Sport\n2. Tourer\n3. Trails");
                    int tBike = testValue.keyValidInt3();
                        if(tBike == 1){
                            typeBike = "Sport";
                            }
                    else if(tBike == 2){
                            typeBike = "Tourer";
                            }
                    else if(tBike == 3){
                            typeBike = "Trails";
                            }
                
                    addBike[a] = new Bikes(a, plateBike, dateBike, valueBike, colourBike, "p", ccBike, typeBike);
                    
                    System.out.println(" Added:\n---------\nBike ID: " + (addBike[a].getBikeID()+1) + "\tPeg: " + addBike[a].getBikePlate() + "\tYear: " + addBike[a].getDate() + "\tValue: " + addBike[a].getValue()+" GBP\tColour: " + addBike[a].getColour() + "\tEngine: " + addBike[a].getCC() + "cc"+ "\t\tBike type: " + addBike[a].getType() + "\n");

    
                    break;    
                    }
                }
    }
}

    //Class AddCar - an input to Car class
class AddCar{  
        //Setting array
    public Car[] addCar = new Car[100];
        //calling testing input validatin class
    TestVal testValue = new TestVal();
    Scanner input = new Scanner(System.in);

            //Setting initial bikes
        public void preCar(){
                    addCar[0] = new Car(0, "BL55LSC", 1960, 8500, "blue", "p", 1000, 4, 5);
                    addCar[1] = new Car(1, "UL52LRE", 1975, 9500, "Red", "d", 3000, 2, 4);
                    addCar[2] = new Car(2, "MU62LSS", 1979, 9600, "blue", "p", 1200, 4, 4);
                    addCar[3] = new Car(3, "ZZ54GRR", 1953, 6200, "black", "d", 600, 2, 5);
                    addCar[4] = new Car(4, "KT2ETLR", 1970, 6600, "blue", "p", 800, 3, 4);
                    addCar[5] = new Car(5, "NA54DWA", 1948, 2500, "gray", "d", 1800, 4, 5);
                    addCar[6] = new Car(6, "DO18DOM", 1966, 3500, "green", "p", 900, 2, 5);
                    addCar[7] = new Car(7, "PA64KOS", 1970, 8500, "green", "p", 2900, 2, 2);
                    }
                    
            //Cars engine size (over 1000cc)
        public void getCarEngine(){
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("Car ID\t\tReg:\t\tYear:\tValue:\t\t Colour:\tFuel:\t    Engine:\tDoor No:\tSeats:");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    for(int u = 0; u < addCar.length; u++){
                        if(addCar[u]!=null){
                            if(addCar[u].getCC()>=1000)
                                System.out.println("  " + (addCar[u].getCarID()+1) + "\t\t" + addCar[u].getCarPlate() + "\t\t" + addCar[u].getDate() + "\t" + addCar[u].getValue() + " GBP" + "\t " + addCar[u].getColour() + "\t\t" + addCar[u].getFuel() + "\t    " + addCar[u].getCC() + "cc" + "\t   " + addCar[u].getDoors() + "\t\t   " + addCar[u].getSeats() +"\n");
                            }
                        }
             System.out.println("----------------------------------------------------------------------------------------------------------------------");

                    }
                        
            //Cars age in given year
        public void carAge(int age){
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("Car ID\t\tReg:\t\tYear:\tValue:\t\t Colour:\tFuel:\t    Engine:\tDoor No:\tSeats:");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    for(int u = 0; u < addCar.length; u++){
                        if(addCar[u]!=null){
                            if(addCar[u].getDate() == age)
                                System.out.println("  " + (addCar[u].getCarID()+1) + "\t\t" + addCar[u].getCarPlate() + "\t\t" + addCar[u].getDate() + "\t" + addCar[u].getValue() + " GBP" + "\t " + addCar[u].getColour() + "\t\t" + addCar[u].getFuel() + "\t    " + addCar[u].getCC() + "cc" + "\t   " + addCar[u].getDoors() + "\t\t   " + addCar[u].getSeats() +"\n");
                            }
                        }
             System.out.println("----------------------------------------------------------------------------------------------------------------------");

                    }
                        
        public void carList(){
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("Car ID\t\tReg:\t\tYear:\tValue:\t\t Colour:\tFuel:\t    Engine:\tDoor No:\tSeats:");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    for(int u = 0; u < addCar.length; u++){
                        if(addCar[u]!=null){
                                System.out.println("  " + (addCar[u].getCarID()+1) + "\t\t" + addCar[u].getCarPlate() + "\t\t" + addCar[u].getDate() + "\t" + addCar[u].getValue() + " GBP" + "\t " + addCar[u].getColour() + "\t\t" + addCar[u].getFuel() + "\t    " + addCar[u].getCC() + "cc" + "\t   " + addCar[u].getDoors() + "\t\t   " + addCar[u].getSeats() +"\n");
                                }
                            }
             System.out.println("----------------------------------------------------------------------------------------------------------------------");

                        }
                        
           public void removeRecC(int rB){
                rB = rB-1; 
                    for(int u = rB; u < addCar.length - 1; u++){
                        addCar[u] = addCar[u + 1];
                        addCar[addCar.length - 1] = null;
                        }
                        for(int u = rB; u < addCar.length-1; u++){
                            if(addCar[u]!=null){
                                addCar[u].setCarID(u);
                                }
                            }
                    }

        public void carRecord(int cRecord){
                cRecord--;
                        System.out.print("Reg plates: ");
                        String plateVeh = input.next();
            
                        System.out.print("Production date: ");
                        int dateVeh = testValue.keyValidInt();
            
                        System.out.print("Value: ");
                        double valueVeh = testValue.keyValidDouble();
            
                        System.out.print("Colour: ");
                        String colourVeh = input.next();
            
                        System.out.print("Fuel petrol or diesel p/d: ");
                        String fuelVeh = input.next();
            
                        System.out.print("Engine size in cc: ");
                        int  ccVeh = testValue.keyValidInt();
            
                        System.out.print("Doors' no: ");
                        int doorVeh = testValue.keyValidInt();
            
                        System.out.print("Seats no: ");
                        int seatsVeh = testValue.keyValidInt();
                       
                        addCar[cRecord] = new Car(cRecord, plateVeh, dateVeh, valueVeh, colourVeh, fuelVeh, ccVeh, doorVeh, seatsVeh);
                        }
            //method - to start processing cars – used in MAIN
        public void addVehivleCar(){
            int a;
                for(a = 0; a < addCar.length; a++)
                    {
                    if(addCar[a]==null){
                   
                        System.out.print("Reg plates: ");
                        String plateVeh = input.next();
                             if(plateVeh.equals("exit")){
                                break;}
            
                        System.out.print("Production date: ");
                        int dateVeh = testValue.keyValidInt();
            
                        System.out.print("Value: ");
                        double valueVeh = testValue.keyValidDouble();
            
                        System.out.print("Colour: ");
                        String colourVeh = input.next();
            
                        System.out.print("Fuel petrol or diesel p/d: ");
                        String fuelVeh = input.next();
            
                        System.out.print("Engine size in cc: ");
                        int  ccVeh = testValue.keyValidInt();
            
                        System.out.print("Doors' no: ");
                        int doorVeh = testValue.keyValidInt();
            
                        System.out.print("Seats no: ");
                        int seatsVeh = testValue.keyValidInt();
                       
                        addCar[a] = new Car(a, plateVeh, dateVeh, valueVeh, colourVeh, fuelVeh, ccVeh, doorVeh, seatsVeh);
            
                            /*for(int i = 0; i < addCar.length; i++)
                                {
                                if(addCar[i]!=null){
                                    //System.out.println("All cars: \nCar ID: " + (addCar[i].getCarID()+1) + "\nPlates: " + addCar[i].getCarPlate() + "\n"); 
                                    //a[i]= new Integer(x);
                                    }
                                }*/
System.out.println("Added Car\n---------------\nCar ID: " + (addCar[a].getCarID()+1) + "\tReg: " + addCar[a].getCarPlate() + "\tYear: " + addCar[a].getDate() + "\tValue: " + addCar[a].getValue() + " GBP" + "\t Colour: " + addCar[a].getColour() + "\tFuel: " + addCar[a].getFuel() + "\tEngine: " + addCar[a].getCC() + "cc" + "\tDoor No: " + addCar[a].getDoors() + "\tSeats: " + addCar[a].getSeats() +"\n");       
                            break;   
                        }
                    }                     
    }
}

//class Car extending Vehicle clas
class Car extends Vehicle{
    int doorsC;
    int seatsC;
    
    public Car(int vehID, String plateV, int dateV, double valueV, String colourV, String fuelV, int ccV, int doorsC, int seatsC){
        super(vehID, plateV, dateV, valueV, colourV, fuelV, ccV);
        this.doorsC = doorsC;
        this.seatsC = seatsC;
        }
        
    public void setCarID(int carID){
        vehID = carID;
        }    
        
    public int getCarID(){
        return vehID;
        }
        
    public String getCarPlate(){
        return plateV;
        }
    
    public int getDoors(){
        return doorsC;
        }
        
    public int getSeats(){
        return seatsC;
        }
    }
    
//class Bikes - extending Vehicle class
class Bikes extends Vehicle{
    String typeB;
    public Bikes(int vehID, String plateV, int dateV, double valueV, String colourV, String fuelV, int ccV, String typeB){
        super(vehID, plateV, dateV, valueV, colourV, fuelV, ccV);
        this.typeB = typeB;
        }
        
    public void setBikeID(int bikeID){
        vehID = bikeID;
        }
        
    public int getBikeID(){
        return vehID;
        }
        
    public String getBikePlate(){
        return plateV;
        }
    
    public String getType(){
        return typeB;
        }
    }
    
//Vehicle super class
class Vehicle{
    int vehID;
    String plateV;
    int dateV;
    double valueV;
    String colourV;
    String fuelV;
    int ccV;
    
    public Vehicle(int vehID, String plateV, int dateV, double valueV, String colourV, String fuelV, int ccV){
        this.vehID = vehID;
        this.plateV = plateV;
        this.dateV = dateV;
        this.valueV = valueV;
        this.colourV = colourV;
        this.fuelV = fuelV;
        this.ccV = ccV;
        }
    
    public int getID(){
        return vehID;
        }
        
    public String getPlate(){
        return plateV;
        }
    
    public int getDate(){
        return dateV;
        }
        
    public double getValue(){
        return valueV;
        }
        
    public String getColour(){
        return colourV;
        }
    
    public String getFuel(){
        String fuel = " ";
        if(fuelV.equals("p")){
           fuel = "petrol";
            }
        else{
            if(fuelV.equals("d")){
                fuel = "diesel";
                }
            }
        return fuel;    
        }
        
    public int getCC(){
        return ccV;
        }
    }
