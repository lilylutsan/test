
public class Users extends Human {
	private int id;
	private String secondname;
	public Users(String name, int age, int number, int id, String secondname) {
		super(name, age, number);
		this.id = id;
		this.secondname = secondname;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", secondname=" + secondname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + id;
		result = prime * result + ((secondname == null) ? 0 : secondname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (id != other.id)
			return false;
		if (secondname == null) {
			if (other.secondname != null)
				return false;
		} else if (!secondname.equals(other.secondname))
			return false;
		return true;
	}

	
}
