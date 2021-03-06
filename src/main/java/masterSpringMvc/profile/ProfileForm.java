package masterSpringMvc.profile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import masterSpringMvc.date.PastLocalDate;

public class ProfileForm {
	@Size(min = 2, max=25)
	private String twitterHandle;
	@Email  
	@NotEmpty
	private String email;
	@NotNull
	@PastLocalDate
	private LocalDate birthDate;
	@NotEmpty
	private List<String> tastes = new ArrayList<>();
	
	/**
	 * @return the twitterHandle
	 */
	public String getTwitterHandle() {
		return twitterHandle;
	}
	/**
	 * @param twitterHandle the twitterHandle to set
	 */
	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the tastes
	 */
	public List<String> getTastes() {
		return tastes;
	}
	/**
	 * @param tastes the tastes to set
	 */
	public void setTastes(List<String> tastes) {
		this.tastes = tastes;
	}
	@Override
	public String toString() {
		return "ProfileForm [twitterHandle=" + twitterHandle + ", email=" + email + ", birthDate=" + birthDate
				+ ", tastes=" + tastes + "] " + super.toString();
	}
	
	

	
}
