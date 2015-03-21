package quizzer

class User {
	
	String id
	String title
	String firstName
	String lastName
	String email
	boolean email_private = false
	String occupationTitle
	String organizationAffiliation
	boolean enabled = true
	List<String> roles
	transient List<Granted Authority authorities>

	static constraints = {
			title (blank: true, nullable: true)
			occupationTitle(blank: true, nullable: true)
			organizationAffiliation(blank: true, nullable: true)
			email(blank: false, email: true)
			roles(minSize: 1)
		}
	
    static mapping = {
    		id generator: "assigned"
    	}
    	
    	def setLast_name(String last_name){
    		lastName = last_name
    	}
    	
    	def setFirst_name(String first_name){
    		firstName = first_name
    	}
    	
    	def setWork_title(String work_title){
    		workTitle = work_title
    	}
    	
    	def setWork_location(String work_location){
    		workLocation = work_location
    	}

    	def getAuthorities(){
    		roles.collect{ new GrantedAuthorityImpl(Role.findById(it).name) }
    	}
}
