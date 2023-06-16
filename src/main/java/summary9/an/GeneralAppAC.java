package summary9.an;

public class GeneralAppAC {

    private static int currentErrorCounter = 23;

    public static void main(String[] args) {

        GeneralAppAC generalAppAC = new GeneralAppAC();
        generalAppAC.monitoring();

    }

    public void monitoring() {
        //============

        MonitoringSystem generalMonitoring = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей запущен!");
            }
        };

        //============

        MonitoringSystem errorMonitoring = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок запущен!");
            }
        };

        //============
        MonitoringSystem securityMonitoring = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности запущен!");
            }
        };

        //============

        generalMonitoring.startMonitoring();
        errorMonitoring.startMonitoring();
        securityMonitoring.startMonitoring();
    }
}