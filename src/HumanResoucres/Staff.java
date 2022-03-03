package HumanResoucres;
import java.util.Scanner;

public abstract class Staff {
	
	private String idEmployee;//mã nhân viên
	private String nameEmployee;// tên nhân viên 
	private int age;//tuổi nhân viên
	private double salaryAmount;//hệ số lương
	private int workStartDays;//ngày vào làm
	private String workParts;//bộ phận làm việc
	private int numValidateDays;//số ngày nghỉ phép
	private String idDepartment;//thuộc tính mã bộ phận là thuoc tính trung gian
	private double salary;
	public abstract void displayInformation();
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	public void input() {
		Scanner inputNum = new Scanner(System.in);
		Scanner inputText = new Scanner(System.in);
		System.out.print("Nhap ma nhan vien: ");
		this.idEmployee = inputText.nextLine(); 
		System.out.print("Nhap ten nhan vien: ");
		this.nameEmployee = inputText.nextLine();
		System.out.print("Nhap tuoi nhan vien: ");
		this.age = inputNum.nextInt();
		System.out.print("Nhap he so luong nhan vien: ");
		this.salaryAmount = inputNum.nextDouble();
		System.out.print("Nhap ngày vào làm cua nhan vien: ");
		this.workStartDays = inputNum.nextInt();
		System.out.print("Nhap bộ phận làm việc cua nhan vien: ");
		this.workParts = inputText.nextLine();
		System.out.print("Nhap mã bộ phan cua nhan vien: ");
		String idDepartment = inputText.nextLine();
		System.out.print("Nhap số ngày nghỉ cua nhan vien: ");
		this.numValidateDays = inputNum.nextInt();
		System.out.print("Nhap mã bộ phận cua nhan vien: ");
		this.idDepartment = inputText.nextLine();
	}
	
	/*Thêm tham số gán vào thuộc tính vào constractor*/
	public Staff(String idEmployee, String idDepartment, String name_Employee, int age, double salary_Amount,
			int workStartDays, String workParts, int numValidateDays) {
		this.idEmployee = idEmployee;
		this.idDepartment = idDepartment;
		this.nameEmployee = name_Employee;
		this.age = age;
		this.salaryAmount = salary_Amount;
		this.workStartDays = workStartDays;
		this.workParts = workParts;
		this.numValidateDays = numValidateDays;
	}
	
	public String getIdDepartment() {
		return idDepartment;
	}
	
	public void setIdDepartment(String idDepartment) {
		this.idDepartment = idDepartment;
	}
	
	public String getNameEmployee() {
		return nameEmployee;
	}
	public double getSalaryAmount() {
		return salaryAmount;
	}
	public String getIdEmployee() {
		return idEmployee;
	}
	public int getAge() {
		return age;
	}
	public String getWorkParts() {
		return workParts;
	}
	public int getWorkStartDays() {
		return workStartDays;
	}
	public int getNumValidateDays() {
		return numValidateDays;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
