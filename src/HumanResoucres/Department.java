package HumanResoucres;

/* là định nghĩa cho class bộ phận  */
public class Department {
	/* Thuộc tính: mã bộ phận, tên bộ phận, số lượng nhân viên hiện tại */
	private String idDepartment;
	private String nameDepartment;
	private int currentNumberOfEmployees;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(String idDepartment, String nameDepartment, int currentNumberOfEmployees) {
		this.idDepartment = idDepartment;
		this.nameDepartment = nameDepartment;
		this.currentNumberOfEmployees = currentNumberOfEmployees;
	}
	
	public String getIdDepartment() {
		return idDepartment;
	}
	public void setIdDepartment(String idDepartment) {
		this.idDepartment = idDepartment;
	}
	public String getNameDepartment() {
		return nameDepartment;
	}
	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	public int getCurrentNumberOfEmployees() {
		return currentNumberOfEmployees;
	}
	public void setCurrentNumberOfEmployees(int currentNumberOfEmployees) {
		this.currentNumberOfEmployees = currentNumberOfEmployees;
	}
	/* - Phương thức: toString() hiển thị thông tin về bộ phận.  */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return idDepartment + ", " + nameDepartment + ", "  + currentNumberOfEmployees;
	}
}
