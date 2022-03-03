package HumanResoucres;

import java.util.Scanner;

/* là định nghĩa cho class quản lý  */
//Thừa kế: Manager cũng là nhân viên, nên sẽ thừa kế từ class Staff. 
public class Manager extends Staff {
	/* - Thuộc tính: chức danh  */
	private String officer = "Technical Leader";
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	@Override
	//chức năng thêm manager
	public void input() {
		Scanner inputText = new Scanner(System.in);
		super.input();
		System.out.print("Nhap chức danh cua nhan vien: ");
		this.officer = inputText.nextLine();
	}
	
	/*-  Phương thức: displayInformation() hiển thị thông tin bao gồm cả chức danh */
	@Override
	public void displayInformation() {
		System.out.println(getIdEmployee() + "," + getNameEmployee() + "," + getNumValidateDays()
		 + "," + getSalaryAmount() + "," + getWorkParts() + "," + getWorkStartDays()
		+ "," + getAge() + "," + this.officer + "," + calculateSalary());
	}
	
	public String getOfficer() {
		return officer;
	}
	


	/*Quản lý: Hệ số lương * 5,000,000 + lương trách nhiệm*/
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return super.getSalaryAmount() * 5000000 + salary_responsible();
	}
	public double salary_responsible() {
		// TODO Auto-generated method stub
		if (officer == "Project Leader") {
			return 5000000;
		} else if (officer == "Business Leade") {
			return 8000000;
		} else {
			return 6000000;
		}
	}
}
