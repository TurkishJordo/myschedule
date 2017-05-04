
public class members {

	@Entity
	public class Members {
		
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(unique = true)
	    @NotEmpty
	    private String telephone;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String gettelephone() {
	        return telephone;
	    }

	    public void settelephone(String telephone) {
	        this.telephone = telephone;
	    }

	    /* toString(), equals() and hashCode() for Members, using the natural identity of the object */

	    @Override
	    public String toString() {
	        return telephone;
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result
	                + ((telephone == null) ? 0 : telephone.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (!(obj instanceof Members))
	            return false;
	        Members other = (Members) obj;
	        if (telephone == null) {
	            if (other.telephone != null)
	                return false;
	        } else if (!telephone.equals(other.telephone))
	            return false;
	        return true;
	    }
	}