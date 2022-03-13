package One_To_One_Mapping.Spacecraft_demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="rocket")
class Rocket {
	@Id
	@PrimaryKeyJoinColumn
	private int rocket_id;
	private String Name;
	@OneToOne(targetEntity = Launch_details.class, cascade = CascadeType.ALL)
	private Launch_details launching;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Launch_details getlaunching() {
		return launching;
	}
	public void setlaunching(Launch_details launching) {
		this.launching = launching;
		}
}