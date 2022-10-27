package fpt.edu.vn.DTO;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class RoleDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String status;
	
	public RoleDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "AccountDTO{" + 
				"id=" + id + 
				", name=' " + name + '\'' +
				", status=' " + status + '\'' + 
				'}';
	}
	
//	@Override
//	public boolean equals(Object o) {
//		if(this == 0)	return true;
//		if(o == null || getClass() != o.getClass())return false;
//		AccountDTO account = (AccountDTO) o;
//		return 
//		
//
//	}
	
	
	
	
}
