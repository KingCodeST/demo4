package za.ac.cputassignment;

public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo {

    public double getTemperatureInc(){
        return  temperatureInc;
    }


    @Override
    public double getTemperatureInF() {
        return  cToF(temperatureInc) ;
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {

        this.temperatureInc =fToC(temperatureInF);


    }



    @Override
    public void setTemperatureInc(double temperatureInc) {
        this.temperatureInc =temperatureInc;
    }


    private double fToC(double f)
    {
        return  ((f-32)*5/9);
    }

    private double cToF(double c)
    {
        return ((c*9/5)+32);
    }

}
