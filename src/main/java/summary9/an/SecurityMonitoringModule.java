package summary9.an;

public class SecurityMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал!");
    }
}
