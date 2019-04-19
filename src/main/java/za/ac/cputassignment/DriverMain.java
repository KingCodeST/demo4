package za.ac.cputassignment;

public class DriverMain {

    public static void main(String[] args){

        System.out.println("Class adapter test");
        TemperatureInfo tempInfo =new TemperatureClassReporter();
        testTempInfo(tempInfo);

        System.out.println("\n object adapter test");
        testTempInfo(tempInfo);
    }


    public static void testTempInfo(TemperatureInfo tempInfo)
    {
        tempInfo.setTemperatureInc(0);
        System.out.println("temp in C: "+ tempInfo.getTemperatureInc());
        System.out.println("temp in F: "+ tempInfo.getTemperatureInF());


        tempInfo.setTemperatureInF(85);
        System.out.println("temp in C: "+tempInfo.getTemperatureInc());
        System.out.println("temp in F: "+tempInfo.getTemperatureInF());
    }


}
