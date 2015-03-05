/**
 * 
 */
package movie.collection;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Virgil Barcan
 *
 */
public class Movie {
	
	private String title;
	private String imdbID;
	private ArrayList<Category> categories;
	private Date releaseDate;
	private Double rating;
	private String shortDescription;
	
	
	//implicit constructor
	/**
	 * 
	 */
	public Movie(){
		initialize();
	}
	
	//explicit constructors
	/**
	 * @param title
	 * @param imdbID
	 * @param categories
	 * @param releaseDate
	 * @param rating
	 * @param shortDescription
	 */
	public Movie(String title, String imdbID, ArrayList<Category> categories, Date releaseDate, Double rating, String shortDescription){
		initialize();
		
		this.title = title;
		this.imdbID = imdbID;
		this.categories = categories;
		this.releaseDate = releaseDate;
		this.rating = rating;
		this.shortDescription = shortDescription;
	}
	
	
	/**
	 * 
	 */
	private void initialize(){
		title = new String();
		imdbID = new String();
		categories = new ArrayList<Category>();
		releaseDate = new Date();
		rating = 0.0;
		shortDescription = new String();
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the imdbID
	 */
	public String getImdbID() {
		return imdbID;
	}


	/**
	 * @param imdbID the imdbID to set
	 */
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}


	/**
	 * @return the categories
	 */
	public ArrayList<Category> getCategories() {
		return categories;
	}


	/**
	 * @param categories the categories to set
	 */
	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}


	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}


	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}


	/**
	 * @return the rating
	 */
	public Double getRating() {
		return rating;
	}


	/**
	 * @param rating the rating to set
	 */
	public void setRating(Double rating) {
		this.rating = rating;
	}


	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}


	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	
}