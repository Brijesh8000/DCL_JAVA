package storing_object;

public class Movie {
	String title;
	String director;
	String genre;
	
	Movie(String title,String director,String genre){
		this.title=title;
		this.director=director;
		this.genre=genre;
		
	}
	@Override
	public String toString() {
		return "Movie [title "+title+", direcrot "+director+ ", genre "+genre+" ]";
	}
	
	public static void main(String[] args) {
		Movie m1=new Movie("KGF 3","Prashan Nee;","Action ");
		Movie m2=new Movie("Hera Pheri","Devraj","Comedy");
		Movie m3=new Movie("Dhurandar","Aditya Dhar","Action ");
		Movie m4=new Movie("1920 London","Ran Rohit","Horror");

		Movie m5=new Movie("Conjuring","Ranjit ","Horror");
		
		Movie[] m= {m1,m2,m3,m4,m5};
		
		for(Movie mv:m) {
			System.out.println(mv);
		}


	}

}
