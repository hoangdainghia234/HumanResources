package HumanResoucres;
import java.util.Scanner;

import java.util.Iterator;
import java.util.List;

/* là định nghĩa cho class nhân viên  */
public class Employee extends Staff {
	/*Thuộc tính: số giờ làm thêm */
	private int overtimeHours;
	
	public int getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	/*Gọi lại hàm constract */
	public Employee(String idEmployee, String idDepartment, String nameEmployee, int age, double salaryAmount,
			int workStartDays, String workParts, int numValidateDays, int overtimeHours) {
		super(idEmployee, idDepartment, nameEmployee, age, salaryAmount, workStartDays, workParts,
				numValidateDays);
		
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double getSalaryAmount() {
		// TODO Auto-generated method stub
		return super.getSalaryAmount();
	}
	
	@Override
	public void input() {
		Scanner inputNum = new Scanner(System.in);
		Scanner inputText = new Scanner(System.in);
		super.input();
		System.out.print("Nhap gio làm thêm cua nhan vien: ");
		this.overtimeHours = inputNum.nextInt();
		super.setSalary(calculateSalary()); 
	}
	
	@Override
	/* hiển thị thông tin nhân viên. */
	public void displayInformation() {
		System.out.println(getIdEmployee() + "," + getNameEmployee() + "," + getNumValidateDays()
		 + "," + getSalaryAmount() + "," + getWorkParts() + "," + getWorkStartDays()
		+ "," + getAge() + "," + this.overtimeHours);
	}
	/*- Phương thức: calculateSalary() trả về lương nhân viên, displayInformation() hiển thị thông tin nhân viên.*/
	public double calculateSalary() {
		/* Nhân viên: Hệ số lương * 3,000,000 + số giờ làm thêm * 200,000 */
		return super.getSalaryAmount() * 3000000 + overtimeHours * 200000;
	}
	
}
