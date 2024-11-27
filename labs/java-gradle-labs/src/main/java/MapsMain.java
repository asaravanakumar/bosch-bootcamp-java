import com.bosch.infotainment.navigation.NavigationService;
import com.bosch.infotainment.navigation.NavigationServiceImpl;

public class MapsMain {
    public static void main(String[] args) {
        System.out.println("Maps Main");
        NavigationService navigationService = new NavigationServiceImpl();
        System.out.println(navigationService.getCoordinates());
    }
}
