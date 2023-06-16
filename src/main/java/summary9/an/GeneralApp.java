package summary9.an;

public class GeneralApp {
    public static void main(String[] args) {
        GeneralIndicatorsMonitoringModule generalIndicatorsMonitoringModule = new GeneralIndicatorsMonitoringModule();
        ErrorMonitoringModule errorMonitoringModule = new ErrorMonitoringModule();
        SecurityMonitoringModule securityMonitoringModule = new SecurityMonitoringModule();

        generalIndicatorsMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityMonitoringModule.startMonitoring();
    }
}
