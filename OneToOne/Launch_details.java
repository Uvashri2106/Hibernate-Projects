package One_To_One_Mapping.Spacecraft_demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Launching")
class Launch_details {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private String DateOfLaunch;
	private String Application;
	private String LaunchVehicle;
	
	@OneToOne(targetEntity = Rocket.class)
	private Rocket rocket;
	
	public String getDateOfLaunch() {
		return DateOfLaunch;
	}
	public void setDateOfLaunch(String dateOfLaunch) {
		DateOfLaunch = dateOfLaunch;
	}
	public String getApplication() {
		return Application;
		}
	public void setApplication(String application) {
		Application = application;
	}
	public String getLaunchVehicle() {
		return LaunchVehicle;
	}
	public void setLaunchVehicle(String launchVehicle) {
		LaunchVehicle = launchVehicle;
	}
	public Rocket getRocket() {
		return rocket;
	}

	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
}
}