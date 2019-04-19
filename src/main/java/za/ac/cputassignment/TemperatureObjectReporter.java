package za.ac.cputassignment;

public class TemperatureObjectReporter implements TemperatureInfo {

    CelciusReporter celciusReporter;


    public TemperatureObjectReporter()
    {
        celciusReporter =new CelciusReporter();
    }

    @Override
    public double getTemperatureInF() {
        return cToF(celciusReporter.getTemperature());
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusReporter.setTemperature(fToC(temperatureInF));
    }

    @Override
    public double getTemperatureInc() {
        return celciusReporter.getTemperature();
    }

    @Override
    public void setTemperatureInc(double temperatureInc) {

        celciusReporter.setTemperature(temperatureInc);
    }

    private double fToC(double f)
    {
        return ((f-32)*5/9);

    }

    private double cToF(double c)
    {
        return ((c * 9/5)+32);
    }


}
